public class ThisKeywordMain {
    public static void main (String[]args){

        // this keyword in java
        /*
        * In java , this keyword is use a reference varaible which refers to the current object
        *
        * */

        // build objects for the this keyword class


        ThisKeyWordDemo object = new
                ThisKeyWordDemo(11000,12,"rimu");

        object.display();


        ThisKeyWordDemo object2 = new
                ThisKeyWordDemo(15000,15,"kazi"
                                                            , "ComputerScience");
        object2.display2();

        // print out the result using this functionality by using conctructor
         //    new ThisKeyWordDemo().getA().message();







    }
}
