package graphics.shapes.attributes;

import java.awt.Color;
import java.awt.Font;

public class FontAttributes extends Attributes {
    public static String ID = "font";
    public Font font;
    public Color color;

    public FontAttributes(Font font, Color color) {
        this.font=font;
        this.color=color;
    }

    public String getId(){
        return ID;
    }

    public String toString(){
        return "FontAttributes";
    }


}

