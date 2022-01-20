public class MethodOverloadingDemoClass {

// number of argruments
    // changing argrument for understanding the method
    static int add(int a, int b ){
        return a+b;
    }


    static int add(int a, int b , int c ){
        return a+b+c;
    }
// changing data types
    static int addition2 (int m, int n ){
        return m+n;
    }
    static double addition2 (double m, double n ){
        return m+n;
    }

    // one more examples

    static void sum (int x , long y){
        System.out.println(x+y);
    }
    public static void sum (int x, int y, int z )
    {
        System.out.println(x+y+z);
    }

}
