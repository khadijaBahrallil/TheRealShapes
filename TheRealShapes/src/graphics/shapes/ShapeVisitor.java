package graphics.shapes;

public interface ShapeVisitor {
    public void visitRectangle(SRectangle r);
    public void visitCollection(SCollection s);



}
