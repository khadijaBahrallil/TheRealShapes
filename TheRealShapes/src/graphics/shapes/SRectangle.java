package graphics.shapes;
import java.awt.Point;
import java.awt.Rectangle;

public class SRectangle extends Shape {
    //fields
    private Rectangle rect;
    private Point point ;

    //constructor
    public SRectangle(Point point, int x, int y){
        this.rect=new Rectangle(x, y);
        this.rect.setLocation(point);
        this.point=point;

    }
    public Rectangle getRect(){

        return this.rect;
    }

    public Point getLoc(){

        return this.point;
    }
    public void setLoc (Point point){
        this.point=point;
    }
    @Override
    public Rectangle getBounds(){

        return this.rect;
    }
    public void accept(ShapeVisitor visitor){

        visitor.visitRectangle(this);
    }

    public String toString(){
        return "Rectangle" + rect;
    }



}
