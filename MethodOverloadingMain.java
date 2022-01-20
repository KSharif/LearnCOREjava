public class MethodOverloadingMain {

    public static void main(String[]args){

// method overloading in java
/*
* two types of method overloading
* by changing number of arguments
* by changing the data types

*
* */

        //  number of arguments  method
System.out.println(MethodOverloadingDemoClass.add(25,25));
        System.out.println(MethodOverloadingDemoClass.add(25,25,25));



        // changing the data types method
System.out.println(MethodOverloadingDemoClass.addition2(12,12));
// for double we use it decimal such as 12.0

        System.out.println(MethodOverloadingDemoClass.addition2(12.0,100.0));


      // for that another examples

      MethodOverloadingDemoClass.sum(15,25);
      MethodOverloadingDemoClass.sum(14,15,12);





    }
}
