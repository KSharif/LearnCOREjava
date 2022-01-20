

public class FinalKeyword extends FinalKeywordBike {
    public FinalKeyword(String card_number) {
        super(card_number);
    }

    // try to overloading or try to change
    /*
    void run(){
        System.out.println("running too fast");
    }
   */
    // we cannot change it by overriding it


    public static void main(String[]args){

    FinalKeywordBike object = new FinalKeywordBike("666");
    object.run();

    }
}


