



//  Invoking Lambda Expression By using Functional Interface example-
interface Interface {
    public void add(int a , int b);
}

class java8{

    public static void main(String[] args) {


        Interface lambdaInterface = (a,b)->System.out.println("The sum by lambda expression "+ (a+b));
        lambdaInterface.add(22,66);
        lambdaInterface.add(11,66);
    }

}