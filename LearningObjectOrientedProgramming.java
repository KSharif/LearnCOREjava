///  *************** JAVA OOOPS*************************888888888
/*
* ****************  NAMING CONVERSION *******************
*
*   Interface -> it shall start with uppercase letter . Ex: -Runnable, Remote, ActionListener
*   Method -> It shall start with lowercase letter. Ex: -main(), print(), println().
*   variable -> it sha;; start with a lowercase letter such as id, name, .Ex -- idm, name
*   Package-> it shall also use lowercase letter such as java,lang. Ex:-- java,util, java,.lang
*   Constant -> It shall be uppercase letter such as RED, YELLOW
*
*
*
*
*
* */


import java.util.Scanner;

public class LearningObjectOrientedProgramming {
        // declare the class varivble

        int id = 10 ;
        String name = "kazi";

// in one class, we can make several objects


    public static void main(String[] args) {
/*
        Scanner inputStudentScanner = new Scanner(System.in);
        System.out.println("Enter the roll number and name ");
        int rollnumber= inputStudentScanner.nextInt();
        String studentname = inputStudentScanner.nextLine();



        Student studentObject1 = new Student();
        studentObject1.insertRecord(1,"rimu");
        Student studentObject2 = new Student();
        studentObject2.insertRecord(2,"Tanji");

        studentObject1.displayInformation();
        studentObject2.displayInformation();
*/

        /*
    // create the object
    LearningObjectOrientedProgramming object1 = new LearningObjectOrientedProgramming();
    System.out.println("Print the object\n"+ object1.id);
    System.out.println(object1.name);

    LearningObjectOrientedProgramming object2= new LearningObjectOrientedProgramming();
    object2.id=11;
    object2.name="sjarif";
    System.out.println("Print the second object by declaring it in the main method \n"+ object2.id);
    System.out.println(object2.name);


        // in   the recent time for security purpose, we create multiple class then access it.

*/
rectangle rectangleObject1 = new rectangle();
rectangleObject1.insertLengthandWidth(5,5);

rectangle rectangleObject2 = new rectangle();
rectangleObject2.insertLengthandWidth(10,2);

rectangleObject1.calculateLengthandWidth();
rectangleObject2.calculateLengthandWidth();









































    }
    }
