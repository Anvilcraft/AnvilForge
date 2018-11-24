package anvil.api.utils.node;

public interface INodeHandler {
	
	boolean hasNode(String uuid, String node);
	
	boolean getBNodeValue(String uuid, String node);
	
	int getINodeValue(String uuid, String node);
	
	String getSNodeValue(String uuid, String node);
	
	void setNode(String uuid, String node, boolean value);
	
	void setNode(String uuid, String node, int value);
	
	void setNode(String uuid, String node, String value);

}
