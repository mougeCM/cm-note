package java.proxy.staticproxy;

/**
 * Created by chenmin on 16-9-23.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("我是火车站");
    }
}
