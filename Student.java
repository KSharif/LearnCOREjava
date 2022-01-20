public class Student {

    int rollnumber;
    String studentName;


    void insertRecord(int r, String n){
        rollnumber=r;
        studentName=n;
    }
    void displayInformation(){
        System.out.println("Print the rollnumber and name\n"+rollnumber+"  "+studentName);
    }
}
