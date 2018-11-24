package anvil.api.utils.power;

import net.minecraft.util.EnumFacing;

public interface IPowerHandler {

	int getStoredPower(EnumFacing from);
	
	int getCapacity(EnumFacing from);
	
	int getMaxExtract(EnumFacing from);
	
	int getMaxInsert(EnumFacing from);
	
	boolean canConnect(EnumFacing from);
	
	IPowerType getPowerType();
	
	boolean canReceive(EnumFacing from);
	
	boolean canProvide(EnumFacing from);
	
	int insertPower(EnumFacing from, int maxInsert, boolean simulate);
	
	int extractPower(EnumFacing from, int maxExtract, boolean simulate);
}
