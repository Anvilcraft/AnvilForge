package anvil.api.utils.power.alt;

import anvil.api.utils.power.IPowerHandler;
import anvil.api.utils.power.IPowerType;
import anvil.api.utils.power.PowerType;
import net.minecraft.util.EnumFacing;

public interface IKineticHandler extends IPowerHandler {
	final IPowerType type = PowerType.KINETIC;
	int getSpeed(EnumFacing from);
	int getTorque(EnumFacing from);
}
