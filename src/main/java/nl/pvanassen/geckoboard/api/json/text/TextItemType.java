package nl.pvanassen.geckoboard.api.json.text;

import com.google.gson.annotations.SerializedName;

/**
 * This is the type for the text widget http://www.geckoboard.com/developers/custom-widgets/widget-types/text/
 *
 * @author Paul van Assen
 */
public enum TextItemType {

    /**
     * No alert icon
     */
    NONE(0),
    /**
     * Alert icon
     */
    ALERT(1),
    /**
     * Info icon
     */
    INFO(2);

    private int key;
    TextItemType(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

}