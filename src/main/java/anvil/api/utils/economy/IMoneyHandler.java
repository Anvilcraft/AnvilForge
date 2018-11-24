package anvil.api.utils.economy;

public interface IMoneyHandler {

	int getPlayerMoney(String uuid);
	
	void setPlayerMoney(String uuid, int money);
	
	void addPlayerMoney(String uuid, int money);
	
	void removePlayerMoney(String uuid, int money);
}
