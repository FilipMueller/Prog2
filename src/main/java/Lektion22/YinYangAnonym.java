package Lektion22;

public class YinYangAnonym {

    String message;

    public YinYangAnonym(String message) {
        this.message = message;
    }
    public static void main(String[] args) throws InterruptedException {
        YinYangThreadRunnable yy1 = new YinYangThreadRunnable("Yin");
        Thread t1 = new Thread(yy1) {
            @Override
            public void run() {
                boolean running = true;
                while(running) {
                    try {
                        Thread.sleep(500);
                        System.out.println();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        t1.start();
        YinYangThreadRunnable yy2 = new YinYangThreadRunnable("Yang");
        Thread t2 = new Thread(yy2) {
            @Override
            public void run() {
                boolean running = true;
                while(running) {
                    try {
                        Thread.sleep(500);
                        System.out.println();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        t2.start();
    }
}
