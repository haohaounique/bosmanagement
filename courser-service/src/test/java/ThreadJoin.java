import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * @author :haohaounique
 * @version :1.0.0
 * @Detaildescription :  线程join的测试
 * @date : 2019/10/19
 */
public class ThreadJoin {
    public static void main(String[] args)  throws Exception{
        List<Thread> threads = IntStream.range(1, 3).mapToObj(ThreadJoin::create).collect(toList()); //类似于sql的写法
        threads.forEach(Thread::start);
        for (Thread thread : threads) {
            thread.join();
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"_#"+i);
            shortSleep();
        }


    }

    private static void shortSleep() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static Thread create(int index) {
        return new Thread(()->{
            for (int j = 0; j <10 ; j++) {
                System.out.println(Thread.currentThread().getName()+"#"+j);
            }
        }, String.valueOf(index));
    }
}
