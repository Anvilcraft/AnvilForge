package anvil.api.utils.permissions;

import anvil.api.utils.APIUtils;

public class PermissionHandler implements IPermissionHandler {

	@Override
	public void setNodeForPlayer(String uuid, String node, boolean value) {
		APIUtils.getNodeHandler().setNode(uuid, node, value);

	}

	@Override
	public boolean getNodeValue(String uuid, String node) {
		if (APIUtils.getNodeHandler().hasNode(uuid, node)) {
			return true;
		}
		String[] nodeparts = node.split(".");
		
		return false;
	}

}
