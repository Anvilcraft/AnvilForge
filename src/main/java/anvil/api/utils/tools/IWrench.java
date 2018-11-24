package anvil.api.utils.tools;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

public interface IWrench {
	
	boolean canWrench(ItemStack item, EntityLivingBase player, EnumHand hand, BlockPos pos);
	
	boolean canWrench(ItemStack item, EntityLivingBase player, EnumHand hand, Entity entity);
	
	void useWrench(ItemStack item, EntityLivingBase player, EnumHand hand, BlockPos pos);
	
	void useWrench(ItemStack item, EntityLivingBase player, EnumHand hand, Entity entity);

}
