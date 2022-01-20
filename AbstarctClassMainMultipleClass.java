import java.awt.*;

public class AbstarctClassMainMultipleClass {


    public static void main(String[]args) {

        // syntax for implement abstract class with other class in the main class
        // Syntax :: abstractclassname objectname = new  +  (other class name such as circle ) ();
        shape object = new rectangle1();
            object.draw();

     shape object2 = new circle1();
     object2.draw();
    object2.abstacthello();

    }
    }

    // create abstract class
abstract class shape {

    void draw(){

    }
// we can use constructor in the abstract class
        public shape() {
        System.out.println(" constructor use in the shape class ");
        }

 // declare method in the abstract class

        void abstacthello(){
        System.out.println("method using in the abstract and get the output ");
        }
    }

 // create rectangle class
class rectangle1 extends shape {

     void draw() {
         System.out.println("drawing rectangle ");
     }

 }






 // class circle
class circle1 extends shape{

    void draw(){
        System.out.println("drawing circle ");
    }

 }


