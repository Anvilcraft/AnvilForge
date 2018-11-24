package anvil.api.utils.values;

import net.minecraft.item.ItemStack;

public interface IValue {

	void setItemValue(ItemStack item, long value);
	
	long getItemValue(ItemStack item);
	
	boolean hasItemValue(ItemStack item);
	
	
}
