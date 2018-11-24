package anvil.api.utils.values;

import java.util.LinkedHashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;


public class ValueRegistry {

	private static Map<Object, Long> valueRegistry = new LinkedHashMap();

	public static void setItemValue(ItemStack item, long value) {
		valueRegistry.put(item, value);
		
	}

	public static long getItemValue(ItemStack item) {
		return valueRegistry.get(item);
	}

	public static boolean hasItemValue(ItemStack item) {
		return valueRegistry.containsKey(item);
	}

}
