package singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.print("싱글톤 객체 생성");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
