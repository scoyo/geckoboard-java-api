package nl.pvanassen.geckoboard.api.json.serializer;

import com.google.gson.*;
import nl.pvanassen.geckoboard.api.json.text.TextItemType;

import java.lang.reflect.Type;

public class TextItemTypeAdaptor implements JsonSerializer<TextItemType> {
    @Override
    public JsonElement serialize(TextItemType textItemType, Type type, JsonSerializationContext jsonSerializationContext) {
        return jsonSerializationContext.serialize(textItemType.getKey());
    }
}
