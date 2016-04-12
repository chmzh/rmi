package zookeeper;
import rmi.*;
public class Server {
	 
    public static void main(String[] args) throws Exception {
//        if (args.length != 2) {
//            System.err.println("please using command: java Server <rmi_host> <rmi_port>");
//            System.exit(-1);
//        }
 
        String host = "localhost";
        int port = Integer.parseInt("8333");
 
        ServiceProvider provider = new ServiceProvider();
 
        HelloService helloService = new HelloServiceImpl();
        provider.publish(helloService, host, port);
 
        //Thread.sleep(Long.MAX_VALUE);
    }
}
