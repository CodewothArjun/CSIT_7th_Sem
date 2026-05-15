class EvenThread implements Runnable {
    public void run() {
        System.out.println("Thread A - Even numbers from 50 to 100:");
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                try { Thread.sleep(10); } catch (InterruptedException e) {}
            }
        }
        System.out.println();
    }
}
 
class OddThread implements Runnable {
    public void run() {
        System.out.println("Thread B - Odd numbers from 100 to 200:");
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                try { Thread.sleep(10); } catch (InterruptedException e) {}
            }
        }
        System.out.println();
    }
}
 
public class LAB12 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new EvenThread());
        Thread t2 = new Thread(new OddThread());
        t1.start();
        t2.start();
    }
}
 
