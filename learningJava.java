import java.util.Scanner;

public class learningJava {
    public static void main(String[] args){
/*
        // Java user input (scanner)
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println(" enter your name:");
        name= input.nextLine();
        System.out.println(" MY name is"+ name);


        int number;
        System.out.println("enter your phone number ");
        number = input.nextInt();
        System.out.println(" your phone number "+ number);

*/

        // use character to print the string
        // separate character joining with the string
    /*    char[] ch = {'k','a','z','i'};
        String s = new String(ch);
        System.out.println(s);
*/
/*
* java string class provides a lot of methods to preform operations on strings such as
*  compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc
* */

        // finding a position of string
        String name = "kazi";
        char ch = name.charAt(0);
        System.out.println("First letter in the string =  "+ ch);
        // assigning the length of the string
        int length = name.length();
        System.out.println("Length of the string "+length);
        System.out.println("write the last letter of the string=    "+ name.charAt(length-1));


        // finding the middle elemeent of the string and print it
        // use substring we can findout the middle element of the string

        String name1 = "RifatMustariRimu";
        System.out.println("Find the middle letter of the string==    "+name1.substring(1,5));

        // print the rest of the string from a certain position
        System.out.println("rest of the letter in the string=   "+name1.substring(2));


        // Finding the contents of element in between the string
        String sen = " hello rifat kazi rimu sharif ";

        boolean check = sen.contains("jubo");
        System.out.println(check);

        System.out.println("finding the elements in a string=    "+ sen.contains("kazi"));

        // checking or finding the elements from one string to another string

        String name2= "kaziSharif";
        String name3 = " rifatmustariRimu";

        System.out.println(name2.equals(name3));

        // adding the element to the string by using concat function and declaring the variables also

        String name4 = " kazi";
        name4 = name4.concat("jubayer");
        System.out.println("Print the elements together=  "+ name4);

        // joining all the string together
        String name5 = " kazi ";
        String middlename = "Shaharair";
        String lastname = " Sharif";

        String fullname = name5.concat("").concat(middlename).concat("").concat(lastname);
        System.out.println("fullname:  " + fullname);


// replace method in the string
        String sen1 = " kazi is good boy";
        System.out.println(sen1);
        String replaces = sen1.replace("good","best");
        System.out.println("replacing the words:  "+replaces);

        // checking the two string contains the same thing or not
        String name6 = "kazi";
        String  name7 ="KAZI";

        boolean check1 = name6.equalsIgnoreCase(name7);
        System.out.println(check1);

// slpit method in string
        String name8 = " amazon is good website";
        //  using----- backsplash \\s---- we can run the space between the string

        String [] word = name8.split("\\s");
        for (String iiii : word){
            System.out.println(iiii);
        }
// find a position of element in the string
        System.out.println("find the position of index in the string "+name8.indexOf("good"));

        // changing the string of capital letter to small letter
        String name9 ="AKAZI SHARIF";
        String name9LowerCase = name9.toLowerCase();
        System.out.println(name9LowerCase);

//1 800 769 3571 ext 1915
    String name10 = "kazi shatif";
    String name10UpperCase = name10.toUpperCase();
    System.out.println(name10UpperCase);

    // convert integers to string format--- value of (function)
        int number112= 11;
        String convertToString = String.valueOf(number112);
        System.out.println(convertToString);
// second method ( Integer.tostring)--> function
        int number114= 556;
        String convetIntgersToString = Integer.toString(number114);
        System.out.println(convetIntgersToString);


// convert boolean value to string using value of
        boolean check12 = false;
        String convertBooleantoString = String.valueOf(check12);
        System.out.println(convertBooleantoString);




        // java StringBuffer Class
        StringBuffer name77 = new StringBuffer("kazi");
        name77.append("sharif rimu");
        System.out.println("Adding names using stringbuffer:  " + name77);

        // inserting elements in between the string


        StringBuffer name78 = new StringBuffer("kazi sharif sumi");
        name78.insert(4 ,"shaharair");
        System.out.println("Inserting elements between the string:  " + name78);
            // replacing method using stringBuffer
        // replacing it between the string


        name78.replace(4,9,"444aa");
        System.out.println("replacing the elements in between the string==  " + name78);

        // Deleting the elements in the string using stringbuffer.

        name78.delete(4,13);
        System.out.println("Deleting the elements in between the string=="+ name78);

        // reversing the elements in between the string

        StringBuffer name79 = new StringBuffer(" Kazi sharif ");
        name79.reverse();
        System.out.println(" resevering the string using string buffer methof ==   "+ name79);
        // second examples
        String name80 = " toton sumi";
        StringBuffer reverseString = new StringBuffer(name80);
        reverseString.reverse();
        System.out.println("Reversing the string: " +  reverseString);
        // ******* changing the format from the string buffer to string

       String changetoStringFromStringbuffer = reverseString.toString();
       System.out.println("reverse string with the accuarte string format" + changetoStringFromStringbuffer);

    // java string builder class
        StringBuilder StringBuilder1 = new StringBuilder(" kazi sharif");
        System.out.println("Printing by using stringBuilder" + StringBuilder1);
        // we can using append replace compare to reverse method in the same way before as StringBuffer

        // checking the time difference between the stringBuffer and StringBuilder
        // time checking for string buffer
        long startTimeToMeasure = System.currentTimeMillis();
        StringBuffer stringBuffer112 = new StringBuffer("Kazi sharif");
        for(int i=0; i<=10000000; i++){
            stringBuffer112.append("hello ");
        }
        System.out.println("Time taken to accuate string buffer: "+ (System.currentTimeMillis()- startTimeToMeasure)+ "ms");


        // checking the time for stringbuilder

        startTimeToMeasure = System.currentTimeMillis();
        StringBuilder StringBuilder2 = new StringBuilder("kazi sharif");
        for(int i =0; i<=10000000; i++ ){
            StringBuilder2.append("hello ");

        }
        System.out.println("Time take to accuate string builder:  "+ (System.currentTimeMillis()- startTimeToMeasure)+ "ms");





    }
}
