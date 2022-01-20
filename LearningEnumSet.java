//************************  JAVA Enumset class********************8
/*
 * java enumset class is the specialized set implementation for use
 * with enum types. It inherits abstarct class and implements the interface
 *
 *
 * enumset is use to store the fixed values
 * such as day and date ---- which cannot be changed
 *
 *
 * */


import java.util.EnumSet;
import java.util.Set;

enum days{
    Sunday, monday, tuesday, wednesday, thursday, friday, saturday
}

public class LearningEnumSet {

    public static void main(String[] args) {
        // write your code here
        // print the whole set
        Set<days> set = EnumSet.allOf(days.class);
        System.out.println("print the complete set\n"+set);
        // print the specific values

        Set<days> set1 = EnumSet.of(days.monday,days.thursday);
        System.out.println("printing the specific values \n"+ set1);

        // using noneof function
        Set<days> set2 = EnumSet.noneOf(days.class);
        System.out.println("print ---> none of \n "+ set2);

    }
}
//*************** JAVA EnumMap ****************

// java enummap class is the splecialized Map implementation for enum keys
