package anvil.anvilforge.power;

import anvil.api.utils.power.IPowerStorage;
import net.minecraft.nbt.NBTTagCompound;

public class PowerStorage implements IPowerStorage {

	protected int power;
	protected int capacity;
	protected int maxExtract;
	protected int maxInsert;
	
	public PowerStorage(int capacity) {
		this(capacity, capacity, capacity);
	}
	
	public PowerStorage(int capacity, int maxTransfer) {
		this(capacity, maxTransfer, maxTransfer);
	}
	
	public PowerStorage(int capacity, int maxInsert, int maxExtract) {
		this.capacity = capacity;
		this.maxInsert = maxInsert;
		this.maxExtract = maxExtract;
	}
	
	public PowerStorage readFromNBT(NBTTagCompound nbt) {
		this.power = nbt.getInteger("Power");
		 if (power > capacity) {
			 power = capacity;
		 }
		 return this;
	}
	
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		if (power < 0) {
			power = 0;
		}
		nbt.setInteger("Power", power);
		return nbt;
	}
	
	public int getMaxInsert() {
		return maxInsert;
	}
	
	public int getMaxExtract() {
		return maxExtract;
	}
	
	public PowerStorage setMaxInsert(int maxInsert) {
		this.maxInsert = maxInsert;
		return this;
	}
	
	public PowerStorage setMaxExtract(int maxExtract) {
		this.maxExtract = maxExtract;
		return this;
	}
	
	public PowerStorage setCapacity(int capacity) {
		this.capacity = capacity;
		if (power > capacity) {
			power = capacity;
		}
		return this;
	}

	@Override
	public int insertPower(int maxInsert, boolean simulate) {
		int energyInserted = Math.min(capacity - power, Math.min(this.maxInsert, maxInsert));

		if (!simulate) {
			power += energyInserted;
		}
		return energyInserted;
	}

	@Override
	public int extractPower(int maxExtract, boolean simulate) {
		int energyExtracted = Math.min(power, Math.min(this.maxExtract, maxExtract));

		if (!simulate) {
			power -= energyExtracted;
		}
		return energyExtracted;
	}

	@Override
	public int getStoredPower() {
		return power;
	}

	@Override
	public int getCapacity() {
		return capacity;
	}

}
