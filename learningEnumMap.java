import java.util.EnumMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class learningEnumMap {


    enum days{
        monday, tuesday, wednesday, thursday
    };

    public static void main(String[] args) {

        EnumMap<days, String> enumMap = new EnumMap<days, String>(days.class);
        enumMap.put(days.monday,"1");
        enumMap.put(days.tuesday,"2");
        enumMap.put(days.wednesday,"3");
        enumMap.put(days.thursday,"4");
        // print enumMap as a empty set
        System.out.println(enumMap.entrySet());
        // printing enumMap through for each
        for (Map.Entry enumMapPrintForeachLoop  : enumMap.entrySet()
                ) {
                System.out.println("print enumMap: \n"+enumMapPrintForeachLoop.getKey()+ ""+ enumMapPrintForeachLoop.getValue());
        }

        // **************  java Vector ***************************

        /*
        * Vector is like dynamic array which can grow or shrink its size
        *
        * */

        Vector<String > vector = new Vector<String>();
        vector.add("kazi");
        vector.add("rimu");
        vector.add("shawon");
        vector.add("jubo");

        System.out.println(vector);
        System.out.println(vector.size());


        vector.addElement("kam");
        vector.addElement("min");
        vector.addElement("raaj");
        System.out.println(vector);
        System.out.println(vector.size());

        // contains
        System.out.println(vector.contains("kazi"));

        if (vector.contains("kazi")){
            System.out.println("kazi is present");
        }
        else
        {
            System.out.println("kazi is not preesent");
        }

        // remove

        vector.remove("kazi");
        System.out.println(vector);


        //************* Java Stack **********************

        /*
        * The stack is a linear data structure that is used to store the collection of objects
        * it is based on last -in -first -out
        *
        *
        * */
        // printing the empty set
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());

        // push the stack
        stack.push(10);
        System.out.println(stack);
        stack.push(20);
        System.out.println(stack);

        stack.push(30);
        System.out.println(stack);

        stack.push(40);
        System.out.println(stack);

        stack.push(50);
        System.out.println(stack);


        System.out.println("print the stack \n"+ stack);

        // check the stack
        System.out.println("Check the stack\n "+ stack.isEmpty());

        stack.pop();
        System.out.println("pop the elemnents: "+ stack);

        // peek the stack

        stack.peek();
        System.out.println(stack);

        int stackPeekNumber = stack.peek();
        System.out.println(stackPeekNumber);


        // find the elements

        stack.search(20);
        System.out.println(" search the elements \n "+ stack);

        // if the value is not present

        stack.search(100);
        System.out.println("value not present ---outcomes"+ stack);
        System.out.println(stack.size());

        // print ---- foreach

        stack.forEach(n->{
            System.out.println(n);
        });










    }
}
