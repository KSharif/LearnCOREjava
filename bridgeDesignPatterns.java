
// java code bridge design
// abstraction in bridge pattern.
/*
* here I am implementing the bridge pattern for a device company which phone and laptop
* which allows me o separate the abstraction from the implementation. It is a structural design pattern.
 *
* */

// abstraction in bridge pattern
abstract class Device {
    protected DeviceMaker DeviceMaker1;
    protected DeviceMaker DeviceMaker2;

    protected Device(DeviceMaker DeviceMaker1, DeviceMaker DeviceMaker2) {
        this.DeviceMaker1 = DeviceMaker1;
        this.DeviceMaker2 = DeviceMaker2;

    }
 abstract public void manufacture();

}
// Abstraction 1 for the phone in the model
class phone extends Device{
    public phone(DeviceMaker DeviceMaker1, DeviceMaker DeviceMaker2){
        super(DeviceMaker1,DeviceMaker2);
    }

    @Override
    public void manufacture() {
       System.out.println("Phone ");
       DeviceMaker1.work();
       DeviceMaker2.work();

    }
}

// Abstraction2  for the phone in the model
class laptop extends Device{
    public laptop(DeviceMaker DeviceMaker1, DeviceMaker DeviceMaker2){
        super(DeviceMaker1,DeviceMaker2);
    }

    @Override
    public void manufacture() {
        System.out.println("laptop ");
        DeviceMaker1.work();
        DeviceMaker2.work();

    }
}
interface DeviceMaker
{
    abstract public void work();
}

class Produce implements DeviceMaker{
    @Override
    public void work()
    {
        System.out.print("Produced");
    }
}


class Assemble implements DeviceMaker{
    @Override
    public void work()
    {
        System.out.print(" And");
        System.out.println(" Assembled. ");
    }
}

// demonstration of bridge pattern model
class bridgeDesignPatterns {
    public static void main(String[] args){

        Device Device1 = new phone(new Produce(), new Assemble());
        Device1.manufacture();
        Device Device2 = new phone(new Produce(), new Assemble());
        Device2.manufacture();

}
}