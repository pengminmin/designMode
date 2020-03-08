package singleton;
//饿汉式
public class SingletonDemo01 {
    //1.私有构造方法
    private SingletonDemo01() {
    }

    //2.类初始化的时候立即加载该对象
    private static SingletonDemo01 instance = new SingletonDemo01();

    //3.提供获取该对象的方法，没有synchronized,效率告
    public static SingletonDemo01 getInstance(){
        return instance;
    }
}


class SingletonDemo01Test{
    public static void main(String[] args) {
        SingletonDemo01 instance = SingletonDemo01.getInstance();
        SingletonDemo01 instance1 = SingletonDemo01.getInstance();
        System.out.println(instance == instance1);
    }
}