import java.security.PublicKey;

public class MethodMain {
    public static void main(String[] args) {

        /****************** JAVA MEthod*************
         *A Java method is a collection of statements that are grouped together to perform
         *  an operation. When you call the System.out.println() method, for example,
         *  the system actually executes several statements in order to display a
         *  message on the console.
         *
         *
         * Syntax::::::::::::::::::::::::
         *
         *  public static int methodName(int a, int b) {
         *    // body
         * }
         *
         * Here,
         *
         * public static − modifier
         *
         * int − return type
         *
         * methodName − name of the method
         *
         * a, b − formal parameters
         *
         * int a, int b − list of parameters
         *
         *      Two types of Method
         *      1. User defined method
         *      2. Inbuilt Method
         *
         *
         * */


        // User defined method
        System.out.println("User defined method result \n"+Math.max(10, 20));



        // create the objects
        MethodMain object1 = new MethodMain();
        //object1.InbuiltMethod(50,60);
        System.out.println("result without using static function in the method\n max  value");
        System.out.println(object1.InbuiltMethod(50,60));

        // access the method-- InbuiltmethodusingStatic
        // we can access it without making the objectrs
        System.out.println("result with using static function in the method\n minimun value");
        System.out.println(InbuiltMethodUsingStatic(88,99));
        System.out.println(MethodMain.InbuiltMethodUsingStatic(55,66));


        // access the method ---Inbuiltmethod_Void_Modifier
        // we can access the method
        System.out.println(" result using void modifer \n Equivalent Value: ");
        MethodMain.InbuiltMethod_void_Modifier(12,36);
        MethodMain.InbuiltMethod_void_Modifier(55,55);

        // Accessing method 1 class to find the even odd number program

        // calling the method and create the object
        Method1 EvenOdd_Object = new Method1();
        EvenOdd_Object.EvenODDNumber(55);

        System.out.println("Print the result of even odd program \n " + EvenOdd_Object.EvenODDNumber(55));


        System.out.println(EvenOdd_Object.EvenODDNumber(66));


        // Divisble program class program -3
        Method1 DivisbleProgram_object = new Method1();
       DivisbleProgram_object.checkDivisbleResult(66);




    }

    // Inbuilt method
    // finding the maximun value
    public int InbuiltMethod(int a , int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }


    }
    /*
    * By using static we can access the method directly
    * in the main function without making the objects
    * */
    public static int InbuiltMethodUsingStatic (int c, int d ){
        // finding the minimun value
        if (c<d){
            return c;
        }
        else{
            return d;
        }

    }

    // using void we call out the method

    public static void InbuiltMethod_void_Modifier (int e, int f){
        // if we use int --- then there must be a return value
        // if we use void there are no return value
        if (e==f){
            System.out.println(" both number are equal "+ e);
        }
        else {
                    System.out.println("both number are not equal " +f);
        }


    }


}







