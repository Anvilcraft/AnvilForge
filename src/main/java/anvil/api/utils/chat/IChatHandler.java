package anvil.api.utils.chat;

public interface IChatHandler {
	
	String getPrefix(String uuid);
	
	String getSuffix(String uuid);
	
	void setPrefix(String uuid, String prefix);
	
	void setSuffix(String uuid, String suffix);

}
