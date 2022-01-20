public class MethodMain2 {
    public static void main(String[] args) {
// Mutator Method :
   /*
   *n Java, mutator methods reset the value of a private variable.
   *  This gives other classes the ability to modify the value stored in that
   *  variable without having direct access to the variable itself.

      Mutator methods take one parameter whose type matches the type of the variable
      * it is modifying. Mutator methods usually don’t return anything.
   *
   *
   *
   * */

        // after applying get and set method in the method2 program we can access it
        Method2 ProcessGet_SET_Method_object = new Method2();
        ProcessGet_SET_Method_object.setRollStudent(100);
        ProcessGet_SET_Method_object.setNameStudent("kazi ");
        System.out.println(ProcessGet_SET_Method_object.getNameStudent()+""+
                ProcessGet_SET_Method_object.getRollStudent());
        ProcessGet_SET_Method_object.displayInformationStudent();
    }
}
