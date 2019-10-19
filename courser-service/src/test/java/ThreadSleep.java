import java.util.stream.IntStream;

/**
 * @author :haohaounique
 * @version :1.0.0
 * @Detaildescription :
 * @date : 2019/10/19
 */
public class ThreadSleep {
    public static void main(String[] args)  throws Exception{

//        TimeUnit.HOURS.sleep(1); //替换Thread.sleep方法
        IntStream.range(0,2).mapToObj(ThreadSleep::create).forEach(Thread::start);

    }

    private static Thread create(int index) {
        return new Thread(()->{
            //if语句代码的作用   没有时打印0 1 ，1 0  yeild提醒调度器放弃当前cpu,只是一个hint(提示),cpu调度并不能每次都满足yield提示
            /**
             * sleep 会短暂block,释放cpu资源 而yield则会使running 转为runnable(cpu调用没有忽略的情况)
             */
            if (index == 0) {
                Thread.yield();
            }
            System.out.println(index);
        });
    }


}
