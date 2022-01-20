public class StaticMain {

    public static void main(String[] args) {
        // by static function we can use directly to the main class
        // static ---means is unchanging which is same for everyone
        // static is used for saving the memory
        // create objects for static class


        // static function use
       // implementing the static function  direct from the static class to main class
        System.out.println(StaticDemo.Information);

        //Static method --- calling method in the static class and use the code in the
        //                      main class to run the program

      StaticDemo.DetailsNoteForStudent();

      // implement a student program to understand the use of static in java
      // here static is for everyone which is usually common for all the student

      StaticDemo object = new StaticDemo(10, "kazi");
        object.display();


        System.out.println("update the static details in the main class");
        // update the static details in the main class
        StaticDemo.change_Previous_StaticInformation();
        object.display();


    }
}
