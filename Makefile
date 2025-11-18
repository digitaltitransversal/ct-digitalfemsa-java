java:
	rm -rf docs && \
	rm -rf src/main/java/io/digitalfemsa/model && \
	docker run --rm \
    	-v ${PWD}:/local openapitools/openapi-generator-cli:v7.5.0 generate \
		-i https://raw.githubusercontent.com/digitalfemsa/openapi/main/_build/api.yaml \
		-g java \
		-o /local \
		-c /local/config-java.json \
		--global-property modelTests=false \
		--additional-properties=hideGenerationTimestamp=true

test:
	mvn -B package --no-transfer-progress --file pom.xml

version-update:
	@if [ -z "$(NEW_VERSION)" ]; then \
		echo "Error: NEW_VERSION is required. Usage: make version-update NEW_VERSION=1.0.6"; \
		exit 1; \
	fi
	@echo "Updating version to $(NEW_VERSION)..."
	@echo "$(NEW_VERSION)" > VERSION
	@sed -i '' 's/<version>[^<]*<\/version>/<version>$(NEW_VERSION)<\/version>/' pom.xml
	@sed -i '' 's/"artifactVersion": "[^"]*"/"artifactVersion": "$(NEW_VERSION)"/' config-java.json
	@sed -i '' "s/\"httpUserAgent\": \"App\/v2 JavaBindings\/[0-9.]*\"/\"httpUserAgent\": \"App\/v2 JavaBindings\/$(NEW_VERSION)\"/" config-java.json
	@sed -i '' 's/public static final String VERSION = "[^"]*";/public static final String VERSION = "$(NEW_VERSION)";/' src/main/java/io/digitalfemsa/Configuration.java
	@sed -i '' 's/userAgent.put("bindings_version", "[^"]*");/userAgent.put("bindings_version", "$(NEW_VERSION)");/' src/main/java/io/digitalfemsa/ApiClient.java
	@sed -i '' 's/setUserAgent("App\/v2 JavaBindings\/[^"]*");/setUserAgent("App\/v2 JavaBindings\/$(NEW_VERSION)");/' src/main/java/io/digitalfemsa/ApiClient.java
	@sed -i '' 's/<version>1\.1\.0<\/version>/<version>$(NEW_VERSION)<\/version>/' README.md
	@sed -i '' 's/io\.digitalfemsa:ct-digitalfemsa-java:[0-9.][0-9.]*/io.digitalfemsa:ct-digitalfemsa-java:$(NEW_VERSION)/' README.md
	@sed -i '' 's/ct-digitalfemsa-java-[0-9.][0-9.]*/ct-digitalfemsa-java-$(NEW_VERSION)/' README.md
	@echo "Version updated successfully to $(NEW_VERSION)"
