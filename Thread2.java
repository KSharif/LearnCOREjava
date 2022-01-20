public class Thread2 extends Thread {



    public void run(){
        for (int a = 10; a>=1; a--){

            System.out.println("values of  a values =  "+ a);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }


    public static void main(String[] args) {
        Thread2 thread2= new Thread2();
        thread2.start();
    }



}
