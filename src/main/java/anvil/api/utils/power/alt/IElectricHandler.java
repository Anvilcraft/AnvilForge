package anvil.api.utils.power.alt;

import anvil.api.utils.power.IPowerHandler;
import anvil.api.utils.power.IPowerType;
import anvil.api.utils.power.PowerType;
import net.minecraft.util.EnumFacing;

public interface IElectricHandler extends IPowerHandler{
	final IPowerType type = PowerType.ELECTRIC;
	int getVoltage(EnumFacing from);
	int getAmperage(EnumFacing from);
}
