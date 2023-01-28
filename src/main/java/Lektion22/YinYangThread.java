package Lektion22;

public class YinYangThread extends Thread {

    String message;

    public YinYangThread(String message) {
        this.message = message;
    }
    public static void main(String[] args) throws InterruptedException {
        YinYangThread t1 = new YinYangThread("Yin");
        t1.start();
        YinYangThread t2 = new YinYangThread("Yang");
        t2.start();

    }

    @Override
    public void run() {
        boolean running = true;
        while(running) {
            try {
                sleep(500);
                System.out.println(message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
