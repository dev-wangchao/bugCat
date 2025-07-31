package thread;

public class MyTicket implements Runnable{

    int ticket = 100;
    @Override
    public void run() {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (this) {
            while(true) {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "买了第" + i + "票");
                    ticket--;
                }
            }
        }
    }
}
