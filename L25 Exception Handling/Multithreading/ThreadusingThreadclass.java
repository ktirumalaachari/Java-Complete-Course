class MyThread extends Thread {

    // run() contains the code executed by thread
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {

        MyThread t1 = new MyThread(); // thread object
        t1.start();  // starts thread
    }
}
