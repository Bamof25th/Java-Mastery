package oops;

public class OOPS {
    public static void main(String[] args) {
        // Creating objects of the classes.
        Pen pi = new Pen();
        pi.setColor("Red");
        pi.setTip(5);

        // System.out.println(pi.color + "     " + pi.tip);  // Calling methods
        System.out.println(pi.getColor() + "     " + pi.getTip()); 

        BankAccount myAcc = new BankAccount();

        myAcc.username = "aniketBaghel";
        myAcc.setpassword("aniketbag321");

    }
}

class BankAccount {
    public String username; // visible and accessable to every one
    private String password; // makes unaccessaible to othe class or pakages

    public void setpassword(String var) {
        password = var;
    }
}

class Pen {
  private  String color;
  private  Integer tip;

    // Getters
    String getColor() {
        return this.color;
    }

    Integer getTip() {
        return this.tip;
    }

    // Setters
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(Integer newTip) {
        tip = newTip;
    }
}
