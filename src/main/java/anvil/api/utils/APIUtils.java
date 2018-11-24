package anvil.api.utils;

import anvil.api.utils.chat.ChatHandler;
import anvil.api.utils.chat.IChatHandler;
import anvil.api.utils.economy.IMoneyHandler;
import anvil.api.utils.economy.MoneyHandler;
import anvil.api.utils.node.INodeHandler;
import anvil.api.utils.permissions.IPermissionHandler;
import anvil.api.utils.permissions.PermissionHandler;
import anvil.api.utils.values.IValue;
import anvil.api.utils.values.Values;

public class APIUtils {

	public static IValue getValue() {
		return new Values();
	}
	
	public static INodeHandler getNodeHandler() {
		return null;	
	}
	
	public static IMoneyHandler getMoneyHandler() {
		return new MoneyHandler();
	}
	
	public static IPermissionHandler getPermissionHandler() {
		return new PermissionHandler();
	}
	
	public static IChatHandler getChatHandler() {
		return new ChatHandler();
	}
}
