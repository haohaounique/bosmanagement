/**
 * @author :haohaounique
 * @version :1.0.0
 * @Detaildescription :
 * @date : 2019/10/19
 */
public class ThreadTest {
    public static void main(String[] args) {
//        Thread thread = new Thread();
//        thread.start();
//        TicketWindow tt = new TicketWindow(" 一号机 ");
//
//        TicketWindow tt2 = new TicketWindow(" 二号机 ");
//
//        TicketWindow tt3 = new TicketWindow(" 三号机 ");
//
//        TicketWindow tt4 = new TicketWindow(" 四号机 ");
//
//        tt.start();
//        tt2.start();
//        tt3.start();
//        tt4.start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("ok");
//            }
//        }).start();
        TicketWindowRunnable ticketWindowRunnable = new TicketWindowRunnable();
        Thread thread1 = new Thread(ticketWindowRunnable, "一号窗口");
        Thread thread2 = new Thread(ticketWindowRunnable, "二号窗口");
        Thread thread3 = new Thread(ticketWindowRunnable, "三号窗口");
        Thread thread4 = new Thread(ticketWindowRunnable, "四号窗口");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        ThreadGroup test = new ThreadGroup("test");
//        test.setDaemon(true);
    }
}
