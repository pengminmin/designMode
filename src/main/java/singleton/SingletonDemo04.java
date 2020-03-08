package singleton;
//内部静态类
public class SingletonDemo04 {

    //1.私有构造方法
    private SingletonDemo04() {
    }

    private static class InnerClass{
        private static final SingletonDemo04 instance = new SingletonDemo04();
    }

    public static SingletonDemo04 getInstance(){
        return InnerClass.instance;
    }

}

class SingletonDemo04Test{
    public static void main(String[] args) {
        SingletonDemo04 instance = SingletonDemo04.getInstance();
        SingletonDemo04 instance1 = SingletonDemo04.getInstance();
        System.out.println(instance == instance1);
    }
}