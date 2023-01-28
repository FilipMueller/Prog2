package Lektion22;

public class YinYangThreadRunnable implements Runnable {

    String message;

    public YinYangThreadRunnable(String message) {
        this.message = message;
    }
    public static void main(String[] args) throws InterruptedException {
        YinYangThreadRunnable yy1 = new YinYangThreadRunnable("Yin");
        Thread t1 = new Thread(yy1);
        t1.start();
        YinYangThreadRunnable yy2 = new YinYangThreadRunnable("Yang");
        Thread t2 = new Thread(yy2);
        t2.start();

    }

    @Override
    public void run() {
        boolean running = true;
        while(running) {
            try {
                Thread.sleep(500);
                System.out.println(message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
