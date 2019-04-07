package graphics.shapes.attributes;

public class SelectionAttributes {

    //fields
    private static final String ID = "SelectionAttributes";
    private boolean selected = false;
    //constructor

    //methods
    public boolean isSelected()
    {
        return selected;
    }

    public void select()
    {
        selected = true;
    }

    public void unselect()
    {
        selected = false;
    }

    public void toggleSelection()
    {
        selected = !selected;
    }

    public String getId()
    {
        return ID;
    }
}
