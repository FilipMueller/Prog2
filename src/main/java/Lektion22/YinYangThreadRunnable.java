package Lektion22;

public class YinYangThreadTWO implements Runnable {

    String message;

    public YinYangThreadTWO(String message) {
        this.message = message;
    }
    public static void main(String[] args) throws InterruptedException {
        YinYangThreadTWO yy1 = new YinYangThreadTWO("Yin");
        Thread t1 = new Thread(yy1);
        t1.start();
        YinYangThreadTWO yy2 = new YinYangThreadTWO("Yang");
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
