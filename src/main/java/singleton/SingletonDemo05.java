package singleton;
//枚举
public enum SingletonDemo05 {
    INSTANCE;

    public SingletonDemo05 getInstance(){
        return INSTANCE;
    }
}
class SingletonDemo05Test{
    public static void main(String[] args) {
        SingletonDemo05 instance = SingletonDemo05.INSTANCE;
        SingletonDemo05 instance1 = SingletonDemo05.INSTANCE;
        System.out.println(instance == instance1);
    }
}