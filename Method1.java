public class Method1 {

    // finding the even odd number
    public String  EvenODDNumber (int number ){
       String findingEvenOddAnswer;
        if (number%2==0){
            findingEvenOddAnswer="Even";

        }
        else {
            findingEvenOddAnswer="Odd";
        }
        // here we have to convert the int to string because the answer is in string format
        return findingEvenOddAnswer;
    }

        // creating a method which is disivble by 3
    // we are using here private
    // private works or can access in the same classs
    private String Divisble_By_3 (int number1){
        String AnswerDivisble_3;
        if(number1%3==0){
            AnswerDivisble_3="yes, the result is divided by 3 ";
        }
        else{
            AnswerDivisble_3="no, the result is not divided by 3 ";
        }
        // here we use int before there must be return value
        return AnswerDivisble_3;
    }

    // As private is not accessible in the other class
    // here we can call out a new method
    // then by using the new method we can access it to the main method
    public void checkDivisbleResult(int dividednumber ){
        // print the divisble statement result by passing out the parameter
       System.out.println(Divisble_By_3(dividednumber));
    }


}
