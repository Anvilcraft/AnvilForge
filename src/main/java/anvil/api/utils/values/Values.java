package anvil.api.utils.values;

import net.minecraft.item.ItemStack;

public class Values implements IValue {

	@Override
	public void setItemValue(ItemStack item, long value) {
		ValueRegistry.setItemValue(item, value);
	}

	@Override
	public long getItemValue(ItemStack item) {
		return ValueRegistry.getItemValue(item);
	}

	@Override
	public boolean hasItemValue(ItemStack item) {
		return ValueRegistry.hasItemValue(item);
	}

}
