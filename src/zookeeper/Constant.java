package zookeeper;

public interface Constant {
	 
    String ZK_CONNECTION_STRING = "192.168.21.7:2181";
    int ZK_SESSION_TIMEOUT = 5000;
    String ZK_REGISTRY_PATH = "/rmi_registry";
    String ZK_PROVIDER_PATH = ZK_REGISTRY_PATH + "/provider";
}
