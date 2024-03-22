package WrapperClasses;

public class classes {
    public static void main(String[] args) {
        // Wrapper Class = provides a way to use primitive data types as refrence data
        // types contains useful methods can be used with collection. (ex: ArrayList)
        // Java provides two types of data types primitive and reference data type. The
        // primitive data types are predefined in Java that serves as a fundamental
        // building block while the reference data type refers to where data is stored.

        // * Primitive // * Refrence Wrapper
        // * --------- // * ---------

        // * boolean   // * Boolean

        // * char      // * character

        // * int       // * Integer

        // * double    // * Double


        // autoboxing - the automatic conversion that the java Compiler makes Between the primitive types and their corresponding object wrapper classes.
        //  unboxing -  the reverse if autoboxing. Automatic conversion of wrapper class to primitive type.
                
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 21.332;
        String e = "Aniket";

        if(b =='@'){
            System.out.println("this is True");
        }

    }
}
