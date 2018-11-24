package anvil.api.utils.permissions;

public interface IPermissionHandler {

	void setNodeForPlayer(String uuid, String node, boolean value);
	
	boolean getNodeValue(String uuid, String node);
	
}
