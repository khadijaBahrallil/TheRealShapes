package graphics.shapes;
import graphics.shapes.attributes.Attributes;

import java.util.HashMap;
import java.awt.Point;
import java.awt.Rectangle;

abstract public class Shape {
        //fields
        private HashMap<String,Attributes> attributes = new HashMap();
        //constructor
        public Shape() {
        }
        //methods
        public void addAttributes(Attributes attributes){

                this.attributes.put(attributes.getId(), attributes);

        }
        public void translate(int x, int y){

                this.translate(x, y);
        }
        abstract Point getLoc();
        abstract void setLoc(Point point);
        abstract Rectangle getBounds();
        /*
        abstract void accept(ShapeVisitor visitor);
        */

}
