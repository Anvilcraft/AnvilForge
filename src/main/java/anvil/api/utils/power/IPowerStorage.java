package anvil.api.utils.power;

public interface IPowerStorage {
	int insertPower(int maxInsert, boolean simulate);
	
	int extractPower(int maxExtract, boolean simulate);
	
	int getStoredPower ();
	
	int getCapacity ();
}
