public class InheritanceMain extends InheritanceDEMO{


    // implement single level inheritance

    /*
    * here we use to extend functionality to get the access of the other class
    * and merge it functionality with the main class
    *
    * */

    // varaible declare use for single inheritance
    int bonus = 1000;

    public static void main (String[]args){


// INHERITANCE IN JAVA

        // creating object for accessing the bonus

        InheritanceMain object = new InheritanceMain();
        System.out.println(object.bonus);


        // here we accessing the salary part from the other class --demo class

        System.out.println(object.salary);










    }
}
