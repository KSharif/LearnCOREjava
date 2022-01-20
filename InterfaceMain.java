public class InterfaceMain implements boxshape, roundshape{



    @Override
    public void draw() {
            System.out.println("Drawing box shape square ");
    }

    @Override
    public void drawRound() {
        System.out.println(" drawing orange ");
    }


    public static void main(String[]args){
        //  main method
        /*
        * Interface in java
        * There are mainly three reason to use interface
        * 1. it is used to achieve abstraction
        * 2.by interface , we can support the functionality of multiple inheritance
        * 3. it is used to achieve loose coupling
        *
        *
        * */



        // create object

        boxshape object = new InterfaceMain();
        object.draw();

        roundshape object2 = new InterfaceMain();
        object2.drawRound();


    }



}


interface boxshape{

    void draw();

}

interface roundshape{

    void drawRound();
}