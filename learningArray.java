import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class learningArray {

// java collections
    public static void main(String[] args) {




        // java Arrays


        // normally an array is a collection of similar type of elements which has contigious memory location
        // java array is an object which contains elements of a similar data types
        int [] arrayNumber1 = new int [5];
        arrayNumber1[0]=2000;
        arrayNumber1[1]=1000;
        arrayNumber1[2]=800;
        arrayNumber1[3]=500;
        arrayNumber1[4]=100;
        System.out.println(" JAva Array - printing index number into array ");
        System.out.println(" first method  - printing index number into array ");
        // we use for loop to print the repeated step in a once
        for(int i =0; i<arrayNumber1.length; i++ ){
            // in the for loop we have to tell the position of index

            // if we use i int the print code, it will only print out the position of the array
                    /*
                    System.out.println("Printing array index number =     " + i );
                    Coding results:
                    Printing array index number =     0
                    Printing array index number =     1
                    Printing array index number =     2
                    Printing array index number =     3
                    Printing array index number =     4

                    */

            System.out.println("Print array index value which stores in the index location " + arrayNumber1[i]);
        }
        System.out.println(" Second method - printing index number into array ");
        int [] arrayNumber2 = {10,20,30,40,50,60};
        // we will use for each loop to print the array in a once attempt
        // here in for each loop we donot have to tell the index position
        for (int i:arrayNumber2)
        {
            System.out.println("print array " + i);

        }
        // string array
    String [] name = {"jubo", "kazi", "rimu", "sumi", "rani"};
        /*
        * System.out.println(name) ----> this code will implements the array location of the string and print out the
        *                                   location of the array
        * */
        for (String i : name
             ) {
            System.out.println("print string array "+ i );

        }
        // Multidimensional array
        /*
        int arr[][]= {{1,2,3},{4,5,6},{6,7,9}};

        for (int i =0; i<3; i++){
            for(int j = 0; j < 3;i++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
*/
        // copying an array in java

        char [] copyName = {'a','b','c','d','e','f'};
        char [] copyTo = new char[10];
        System.arraycopy(copyName,0,copyTo,0,4);
        for (char i: copyTo
             ) {
            System.out.println("Copying from the characher array to new one array "+i);
        }
        System.out.println("Changing the formart from integer to string "+String.valueOf(copyTo));

        // cloning an Array in java

        int arraySample[]= {33,55,98,45,78,25,21,02,};
        int arrayCloning[] = arraySample.clone();
        for (int i:arrayCloning
             ) {
            System.out.println("Print the cloning array "+i);
        }


//******************************************JAva ARRAYLIST**********************

// java arraylist class uses a dynamic array for storing the elements.It is like an array, but there is not size limit
// we can add or remove elements anytime. so, it is much more than flexible than the traditional array

        // delecaring arraylist
        ArrayList<String> name2 = new ArrayList<String>();
        name2.add("jubo");
        name2.add("rimu");
        name2.add("jack");
        name2.add("Robin");
        name2.add("fardin");

        ArrayList<String> nameSample = new ArrayList<String>();
        nameSample.add("jask");
        nameSample.add("hash");
        nameSample.add("love");
        nameSample.add("task");
        nameSample.add("tom");

      //  System.out.println(name); //------> we can use it directly to print the names

        // use iterator we can print the list and we can access it
            // iterator is use of access the elements
        Iterator iteratorArray = name2.iterator();
        while (iteratorArray.hasNext()){
            System.out.println(iteratorArray.next());

        }
        // another way to print the elements by " for each method"
        /*
        for (String i:name2
             ) {
            System.out.println(i);
        }

        */


        // storing the elements from one list to new list
        String name3 = name2.get(2);
        System.out.println("storing the elements from one list to new list =  " + name3);

        //remove the elements form one list to new list

        String name4= name2.remove(2);
        System.out.println("remove the elements from one to new array=    "+ name2);
        // find the size of the array
        System.out.println(" Array size "+ name2.size());


        // relpacing an elements between the previous with new one

        String name5 = name2.set(0,"kazi sharif ");
        System.out.println(" replacing the elments=    "+ name2);

        // arrange the list into ascending order

        Collections.sort(name2);
        for (String i:name2
             ) {
            System.out.println( i );


        }


        // second examples working with namesample array
        Collections.sort(nameSample);
        for (String i:nameSample)
        {
            System.out.println(i);
        }

        // adding one array to another array list
        name2.addAll(nameSample);
        System.out.println(name2);
        // adding number and names together into the arraylist

        ArrayList addingNumberName = new ArrayList();
        addingNumberName.addAll(nameSample);
        addingNumberName.add(10);
        addingNumberName.add(10);
        addingNumberName.add(10);
        addingNumberName.add(10);
        addingNumberName.add(10);
        System.out.println(addingNumberName);

        addingNumberName.indexOf(10);
        System.out.println(addingNumberName);




    }
}


