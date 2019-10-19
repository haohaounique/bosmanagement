/**
 * @author :haohaounique
 * @version :1.0.0
 * @Detaildescription :
 * @date : 2019/10/19
 */
public class TicketWindowRunnable implements Runnable {

    private static final int MAX=50; //最大业务数量
    private static int index=1;
    @Override
    public void run() {
        while (index<=MAX) {
            System.out.println(Thread.currentThread()+" 柜台当前的号码是："+(index++));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
