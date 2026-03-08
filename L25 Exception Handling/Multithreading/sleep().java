class MyThread extends Thread {

    public void run() {
        try {
            for(int i = 1; i <= 3; i++) {
                System.out.println(i);
                Thread.sleep(1000); // pause 1 sec
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new MyThread().start();
    }
}
