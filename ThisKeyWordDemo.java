public class ThisKeyWordDemo {
    // implement the student program to understand the concepts of this functionality

    int rollNumberstudent;
    int feeStudent;
    String nameStudent;
    static String college = " oklahoma state university ";
    String course ;


    // build an constructor

// first constructor
    public ThisKeyWordDemo(int feeStudent, int rollNumberstudent, String nameStudent) {
        this.feeStudent = feeStudent;
        this.nameStudent= nameStudent;
        this.rollNumberstudent = rollNumberstudent;
    }

    // display
    void display(){
        System.out.println(college+"\n"+ feeStudent+"\n"+nameStudent+"\n"+rollNumberstudent);
    }

// second constructor

    public ThisKeyWordDemo(int feeStudent, int rollNumberstudent,
                           String nameStudent,String course){
        // reusing the parameter from the previous constructor
        this(feeStudent,rollNumberstudent,nameStudent);
        this.course= course;

    }
    void display2(){
        System.out.println("reusing the paraemeter in 2nd constructor \n"+
                college+"\n"+ feeStudent+"\n"+
                nameStudent+"\n"+rollNumberstudent+"\n"
        + " course \n"+   course);
    }

//this keyword also use for return some values
// build an thrd constructor

    /*
   public ThisKeyWordDemo getA(){
        return this;

    }
    // display for 3rd constructor
    void message (){
        System.out.println("heelloo this keyword ");
    }


*/

}
