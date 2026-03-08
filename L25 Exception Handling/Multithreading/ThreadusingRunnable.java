class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread running using Runnable");
    }

    public static void main(String[] args) {

        MyRunnable r = new MyRunnable(); // runnable object
        Thread t = new Thread(r);        // thread object
        t.start();                       // start thread
    }
}
