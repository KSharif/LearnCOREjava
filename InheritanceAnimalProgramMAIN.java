public class InheritanceAnimalProgramMAIN {
public static void main(String[] args){
    // here we use a animal , dog, animal class to understand the muiltilevel
    //     inheritance processs

    /*
    CLASS -- FOR INHERITANCE
    *  InheritanceAnimalProgramMAIN--- MAIN CLASS
     * InheritanceAnimalAnimal-------ANIMAL CLASS
     * InheritanceAnimalDOG---------DOG CLASS

     *InheritanceAnimalBABYDOG--- babydog class
     // later it was extend to dog class
     so baby dog class becomes the class containing all the method of all the class
     *
    * */

    // creATING Object for dog and animaal class as we get the method of both class together

    InheritanceAnimalDOG object = new
            InheritanceAnimalDOG();
    // getting all the method suceessfully in the main method
    object.bark();
    object.eat();

    // heere we extend the dog class into baby dog classd

    InheritanceAnimalBABYDOG object2 = new
            InheritanceAnimalBABYDOG();
    object2.weeping();
    object2.bark();
    object2.eat();





}

}
