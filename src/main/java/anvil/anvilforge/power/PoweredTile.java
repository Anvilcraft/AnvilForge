package anvil.anvilforge.power;

import anvil.api.utils.power.IPowerHandler;
import anvil.api.utils.power.IPowerType;
import anvil.api.utils.power.PowerType;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;

public class PoweredTile extends TileEntity implements IPowerHandler {

	protected PowerStorage storage;
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {

		super.readFromNBT(nbt);
		storage.readFromNBT(nbt);
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {

		super.writeToNBT(nbt);
		storage.writeToNBT(nbt);
		return nbt;
	}
	
	@Override
	public int getStoredPower(EnumFacing from) {
		return storage.getStoredPower();
	}

	@Override
	public int getCapacity(EnumFacing from) {
		return storage.getCapacity();
	}

	@Override
	public boolean canConnect(EnumFacing from) {
		return true;
	}

	@Override
	public IPowerType getPowerType() {
		return PowerType.POWER;
	}

	@Override
	public boolean canReceive(EnumFacing from) {
		return true;
	}

	@Override
	public boolean canProvide(EnumFacing from) {
		return true;
	}

	@Override
	public int insertPower(EnumFacing from, int maxInsert, boolean simulate) {
		return storage.insertPower(maxInsert, simulate);
	}

	@Override
	public int extractPower(EnumFacing from, int maxExtract, boolean simulate) {
		return storage.extractPower(maxExtract, simulate);
	}

	@Override
	public int getMaxExtract(EnumFacing from) {
		return storage.getMaxExtract();
	}

	@Override
	public int getMaxInsert(EnumFacing from) {
		return storage.getMaxInsert();
	}

}
