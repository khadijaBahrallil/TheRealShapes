package graphics.shapes.attributes;
import java.awt.Color;

public class ColorAttributes extends Attributes {
    public static String ID = "color";
    public boolean filled;
    public boolean stroked;
    public Color filledColor;
    public Color strokedColor;


    public ColorAttributes(boolean filled, Color filledColor, Color strokedColor ) {
        this.filled = filled;
        this.stroked = stroked;
        this.filledColor = filledColor;
        this.strokedColor = strokedColor;
    }
    public String getId(){

        return ID;
    }
    public String toString(){

        return "ColorAttributes filledColor : "+filledColor+" strokedColor "+strokedColor;
    }

}
