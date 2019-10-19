import java.util.concurrent.TimeUnit;

/**
 * @author :haohaounique
 * @version :1.0.0
 * @Detaildescription :
 * @date : 2019/10/19
 */
public class ThreadInterrupted {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
//                    System.out.println("run .............");
                }
            }
        };
        thread.setDaemon(true); //设置为守护进操
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.println("is " + thread.isInterrupted());
        thread.interrupt();
        System.out.println("is " + thread.isInterrupted());

    }

    private static void run() {
        while (true) {
            System.out.println("执行...........");
        }
    }
}
