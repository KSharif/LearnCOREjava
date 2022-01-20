public class LearnConstructorMain {
    public static void main(String[] args) {
        // constructor
        // two types of constructor
        //1.   default Constructor
        // 2. parameterized constructor

        // in constructor, the method is used same as the class name
        ConstructorJavaBike object = new ConstructorJavaBike();

        // build new object for ConstructorParameterizedStudent class
        // main for the single constructor
        ConstructorParameterizedStudent object2 =

               new ConstructorParameterizedStudent(10,"kazi");



        object2.display();

        // build new object for overloading constructor
        ConstructorParameterizedStudent object3 = new
                ConstructorParameterizedStudent(77,"rimu",25);
        object3.displayforOverloadingConstructor();

    }
}
