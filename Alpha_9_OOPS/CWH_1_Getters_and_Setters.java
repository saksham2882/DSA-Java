package Alpha_9_OOPS;

public class CWH_1_Getters_and_Setters {

    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("Blue");
        System.out.println(p.getColor());
        p.setColor("Red");
        System.out.println(p.getColor());
    }
}

class Pen {
    private String color;

    // Getters : to get the value of color
    // this refers to the current object. It replaces the object for which the function is called. It is useful when variables have the same name. In any function, this helps refer to or find the calling object's reference.
    String getColor() {
        return this.color;
    }

    // Setters : to set the value of color
    void setColor(String newColor) {
        this.color = newColor;
    }
}