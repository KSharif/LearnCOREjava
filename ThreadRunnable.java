


// creating our thread using Runnable
class ThreadRunnable implements Runnable {
    public void run(){
        // tasks for the thread

        for(int i=0; i<=10;i++){
            System.out.println("values of i "+ i);
            // we wait the program using the threads
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }




        }

    }



    // main method
    public static void main(String[] args) {

        // calling the thread class
        // create the object of the threadRunnable class
        ThreadRunnable thread1 = new ThreadRunnable();
        Thread t1 = new Thread(thread1);

        t1.start();

        // creating another object for the Thread class - class

      //  ThreadClass t2 = new ThreadClass();
        // t2.start();


        Thread2 t2 =  new Thread2();
        t2.start();




    }
}


