package java.proxy.staticproxy;

/**
 * Created by chenmin on 16-9-23.
 */
public class ProxyTest {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }
}
