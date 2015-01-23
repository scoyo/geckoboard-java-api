package nl.pvanassen.geckoboard.api.json.serializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import nl.pvanassen.geckoboard.api.widget.ListWidget;

import java.lang.reflect.Type;

public class ListWidgetTypeAdaptor implements JsonSerializer<ListWidget> {
    @Override
    public JsonElement serialize(ListWidget listWidget, Type type, JsonSerializationContext jsonSerializationContext) {
        return jsonSerializationContext.serialize(listWidget.getItems());
    }
}
