/**
 * @author :haohaounique
 * @version :1.0.0
 * @Detaildescription :
 * @date : 2019/10/19
 */
public class TicketWindow extends Thread  {
    /**
     * 匿名内部类使用定义在外部的变量，该变量必须是final类型
     * 1：匿名内部类没有构造函数，无法对引用变量进行初始化。所以引用的参数必须是在外部已经初始化的final变量。
     * 2：匿名内部类是出现在一个方法的内部的，如果它要访问这个方法的参数或者方法中定义的变量，则这些参数和变量必须被修饰为final。因为虽然匿名内部 类在方法的内部，但实际编译的时候，内部类编译成Outer.Inner,这说明内部类所处的位置和外部类中的方法处在同一个等级上，外部类中的方法中的 变量或参数只是方法的局部变量，这些变量或参数的作用域只在这个方法内部有效。因为编译的时候内部类和方法在同一级别上，所以方法中的变量或参数只有为 final，内部类才可以引用。
     *         当你在类中定义变量时，在其前面加上final关键字，那便是说，这个变量一旦被初始化便不可改变，这里不可改变的意思对基本类型来说是其值不可变，而对于对象变量来说其引用不可再变。其初始化可以在两个地方，一是其定义处，也就是说在final变量定义时直接给其赋值，二是在构造函数中。这两个地方只能选其一，要么在定义时给值，要么在构造函数中给值，不能同时既在定义时给了值，又在构造函数中给另外的值
     */
    private final String name ;// 业务名称

    private static final int MAX=50; //最大业务数量
    private static int index=1;
    public TicketWindow(String name) {
        this.name = name;
    }

    @Override
    public synchronized   void run() {
        while (index<=MAX) {
            System.out.println("柜台："+name +" 当前的号码是："+(index++));
        }

    }
}
