public class AbstractClassMain extends bike {
    public static void main(String[]args){


// abstract class in java

        /**
         * it is process of hiding the implementation details and showing only functionality to the user
         * there are two ways to achieve abstraction in java
         * ====1. abstract class
         * ===2. Interface
         *
         *
         */

        // create the object for the abstract class to perform it in the main class
        //*****Snytax********************
        // abstractclass name object name = new mainclass name ();

        bike object = new AbstractClassMain();
        object.run();


    }
// calling the abstract method in the main class
    @Override
    void run() {
        System.out.println(" bike is running safely ");
    }
}
// calling the abstract class

abstract class bike{

    abstract void run();  // no pass value in the abstract method
    // if we pass anytime to abstract method it will show error because
    //     the abstract class doesnot contain any body

}