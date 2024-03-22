package oops;

public class OOPS {
 public static void main(String[] args) {
    // Creating objects of the classes.
    Pen pi = new Pen();
    pi.setColor("Red");
    pi.setTip(5);

    System.out.println(pi.color + "     " + pi.tip );  // Calling methods
 }
}

class Pen {
    String color;
    Integer tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(Integer newTip) {
        tip = newTip;
    }
}
