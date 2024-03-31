package oops;

public class staticKw {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setName("aniket");
        s1.SchoolName = "saddasd";
        System.out.println("Student Name : "+s1.getName());
        Students s2 = new Students();
        System.out.println(s2.SchoolName);

    }
}

class Students {
    String name;
    int rollNo;

    static String SchoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

}
