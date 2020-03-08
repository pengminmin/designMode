package singleton;
//懒汉式
public class SingletonDemo02 {
    //1.私有构造方法
    private SingletonDemo02() {
    }

    //2.类初始化的时候不加载该对象
    private static SingletonDemo02 instance;

    //3.提供获取该对象的方法，有synchronized,效率较低
    public static synchronized SingletonDemo02 getInstance(){
        if(instance == null){
            instance = new SingletonDemo02();
        }
        return instance;
    }
}

class SingletonDemo02Test{
    public static void main(String[] args) {
        SingletonDemo02 instance = SingletonDemo02.getInstance();
        SingletonDemo02 instance1 = SingletonDemo02.getInstance();
        System.out.println(instance == instance1);
    }
}
