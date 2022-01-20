public class FinalKeywordBike {




    final void run(){
        System.out.println("running ");
    }

    int id ;
    String name;
    final String Card_number;


    // here to pass the value in the final statement we have to build the
    //                              constructor of the final statement
    public FinalKeywordBike(String card_number) {
        Card_number = card_number;

        //card_number="22222";
    }


    // we cannot use the final for putting the varaible in the final statement
    // in the method --- cannot use direxct or cannot assign direct
/*
* using static final
* code :
* Static {card_number = "656"; }
*
* */



}
