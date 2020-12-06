package singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class Main {
    public static void main(String[] args) {
        System.out.println("시작");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 인스턴스");
        } else {
            System.out.println("다른 인스턴스");
        }

        System.out.println("End");
    }
}
