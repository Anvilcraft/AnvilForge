package anvil.api.utils.chat;

import anvil.api.utils.APIUtils;

public class ChatHandler implements IChatHandler {

	@Override
	public String getPrefix(String uuid) {
		return APIUtils.getNodeHandler().getSNodeValue(uuid, "anvil.chat.prefix");
	}

	@Override
	public String getSuffix(String uuid) {
		return APIUtils.getNodeHandler().getSNodeValue(uuid, "anvil.chat.suffix");
	}

	@Override
	public void setPrefix(String uuid, String prefix) {
		APIUtils.getNodeHandler().setNode(uuid, "anvil.chat.prefix", prefix);
	}

	@Override
	public void setSuffix(String uuid, String suffix) {
		APIUtils.getNodeHandler().setNode(uuid, "anvil.chat.suffix", suffix);
	}

}
