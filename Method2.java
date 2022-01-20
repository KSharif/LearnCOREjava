public class Method2 {

    private int rollStudent;
    private String nameStudent;
    // private is use here -- we can call it through inside the same class


    public int getRollStudent() {
        return rollStudent;
    }

    public void setRollStudent(int rollStudent) {
        this.rollStudent = rollStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }


    // for display
    public void displayInformationStudent (){
        System.out.println("print in the name of student using get and set method\n"+
                "Student Name "+ nameStudent + " "+ " Student Roll "+ rollStudent);
    }
}
