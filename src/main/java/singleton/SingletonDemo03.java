package singleton;
//DCL懒汉式
public class SingletonDemo03 {
    //1.私有构造方法
    private SingletonDemo03() {
    }

    //2.类初始化的时候不加载该对象
    private static volatile SingletonDemo03 instance;

    //3.提供获取该对象的方法
    public static SingletonDemo03 getInstance(){
        if(instance == null){
            synchronized (SingletonDemo03.class){
                if(instance == null){
                    instance = new SingletonDemo03();
                }
            }
        }
        return instance;
    }
}
class SingletonDemo03Test{
    public static void main(String[] args) {
        SingletonDemo03 instance = SingletonDemo03.getInstance();
        SingletonDemo03 instance1 = SingletonDemo03.getInstance();
        System.out.println(instance == instance1);
    }
}
