import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class learningjava2 {

    public static void main(String[] args) throws Exception{

        // java conversion


        /*
        Scanner ns = new Scanner(System.in);
        String numberStriing ;
        System.out.println(" Enter the number:  ");
        numberStriing = ns.nextLine();
        System.out.println("User input number " + numberStriing );

        // for checking the string format we use +10
        System.out.println("Checking the format of string ::" + numberStriing +10 );

        // convert string to integers
        int number  = Integer.parseInt(numberStriing);


        // for checking the integers format after conversion from string to integers
        System.out.println( number + 10 );

        String numberString2 = "1000";
        Integer numberInteger = Integer.valueOf(numberStriing);
        System.out.println( numberInteger + 111 );

            */


// java convert int to string

        // first method
        int numberInteger1 = 10;
        String convertIntegertoString = String.valueOf(numberInteger1);
        System.out.println(convertIntegertoString+10);

        // second method

        int numberInteger2 = 30;
        String convertIntegertoString2 = Integer.toString(numberInteger2);
        System.out.println(convertIntegertoString2+10);

// java convert string to long

    String StringNumber3 = "1205356";

    long convertStringtoLong = Long.parseLong(StringNumber3);
    System.out.println(convertStringtoLong + 1);

// java convert long to string

long numberLong = 12636933;
String convertLongToString = Long.toString(numberLong);
System.out.println(convertStringtoLong+2);

/*
* for conversion
* we can use
*   when convert any int, double, float, long to string
* 1. string. value of
* 2.
*
*
*
* */


// java string to float
        String numberString3 = "3000.1000";
        float convertStringToFloat = Float.parseFloat(numberString3);
        System.out.println(convertIntegertoString+1);

 // java float to string
        float numberFloat = 2000.00f;
     //
        //   use any other way to change the format
        //   String convertFloattoString = String.valueOf(numberFloat);
        String convertFloattoString = Float.toString(numberFloat);
        System.out.println(convertFloattoString+1+ " kazi ");


// java convert string to double
        String numberString6 = "12222222222.222222";
        double convertStringToDouble = Double.parseDouble(numberString6);
        System.out.println(convertStringToDouble+1.0);
// java convert double to string
        double numberdouble = 12222.2222;
        String convertDoubleToString = String.valueOf(numberdouble);
        System.out.println(convertDoubleToString+ "kazi");


// java string to date
        String StringDate = "3/1/2022";

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(StringDate);
        System.out.println(date1);

// java date to string
        Date date = Calendar.getInstance().getTime();
        DateFormat dateformart = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
        String stringDate = dateformart.format(date);
        System.out.println(stringDate);


// java Convert string to char
        String name009 = "kazi";
        char c = name009.charAt(0);
        System.out.println(c);
        for(int i22 = 0; i22< name009.length();i22++){
            char d = name009.charAt(i22);
            System.out.println("the value is    " + d);

        }


// java convert char to string
        char e = 'k';
        String convertCharactertoString = String.valueOf(e);
        System.out.println(convertCharactertoString+"azi");


// java convert int to long
int numberInegeer12= 10;
long numberlong1= numberInegeer12;
System.out.println(numberlong1);
// java convert long to int


        long number1 = 10252;
        int era = (int)number1;
        System.out.println(era);

        // for wrapper class ____

        Long numberlongWrapperClass = 12121l;
        int era1 = numberlongWrapperClass.intValue();
        System.out.println(era1);


    }
}

