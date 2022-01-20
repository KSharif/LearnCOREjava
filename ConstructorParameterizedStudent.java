public class ConstructorParameterizedStudent {
    int id;
    String name ;

    int age; // for overloading constructor

// single constructor

    public ConstructorParameterizedStudent(int id, String name) {
       this. id = id;
       this. name= name;
    }

    // constructor overloading


    public ConstructorParameterizedStudent(int id, String name, int age) {
        this. id = id;
        this. name= name;
        this. age= age;
    }

    // print the name
    void display(){
        System.out.println("Single constructor --- display ");
        System.out.println("name  "+ name  + "  "+"id  "+ id  );
    }

    void displayforOverloadingConstructor(){
        System.out.println("overloading constructor ---- display ");
        System.out.println("name  "+ name  + "  "+"id  "+ id +"  age  "+ age  );
    }






}
