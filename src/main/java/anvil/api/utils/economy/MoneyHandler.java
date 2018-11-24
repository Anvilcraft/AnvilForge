package anvil.api.utils.economy;

import anvil.api.utils.APIUtils;

public class MoneyHandler implements IMoneyHandler {

	@Override
	public int getPlayerMoney(String uuid) {
		// TODO Auto-generated method stub
		return APIUtils.getNodeHandler().getINodeValue(uuid, "anvil.economy.money");
	}

	@Override
	public void setPlayerMoney(String uuid, int money) {
		APIUtils.getNodeHandler().setNode(uuid, "anvil.economy.money", money);
	}

	@Override
	public void addPlayerMoney(String uuid, int money) {
		APIUtils.getNodeHandler().setNode(uuid, "anvil.economy.money", APIUtils.getNodeHandler().getINodeValue(uuid, "anvil.economy.money") + money);
	}

	@Override
	public void removePlayerMoney(String uuid, int money) {
		APIUtils.getNodeHandler().setNode(uuid, "anvil.economy.money", APIUtils.getNodeHandler().getINodeValue(uuid, "anvil.economy.money") - money);
	}

}
