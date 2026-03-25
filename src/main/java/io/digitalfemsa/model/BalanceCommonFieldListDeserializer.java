package io.digitalfemsa.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BalanceCommonFieldListDeserializer extends StdDeserializer<List<BalanceCommonField>> {

    private static final long serialVersionUID = 8276959176688839261L;

    public BalanceCommonFieldListDeserializer() {
        super(List.class);
    }

    @Override
    public List<BalanceCommonField> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        JsonToken token = p.currentToken();
        if (token == JsonToken.START_ARRAY) {
            List<BalanceCommonField> result = new ArrayList<>();
            while (p.nextToken() != JsonToken.END_ARRAY) {
                result.add(ctxt.readValue(p, BalanceCommonField.class));
            }
            return result;
        }
        if (token == JsonToken.START_OBJECT) {
            p.skipChildren();
            return new ArrayList<>();
        }
        return new ArrayList<>();
    }
}
