public class ProxyClient {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.doIt("www.google.com");
    }
    
}
