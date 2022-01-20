public class StaticDemo {

   static  String Information = " Information";
    int rollnumberStudent;
    String nameStudent;
    static String College = " Manarat college";

    // build a constructor
    public StaticDemo(int rollnumberStudent, String nameStudent){
        this.nameStudent= nameStudent;
        this.rollnumberStudent= rollnumberStudent;
    }
    // display

    void display (){
        System.out.println("College:"+ College +"\n"
        + " Name:   "+ nameStudent+"\n"+" Roll number:" + rollnumberStudent
                );
    }


    public static void DetailsNoteForStudent(){
        System.out.println("Details about the student");
    }

// update the static method if there is a change in the static

    static void change_Previous_StaticInformation(){
        College = "Manarat Dhaka school and college ";
    }


}
