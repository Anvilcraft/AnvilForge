package anvil.api.utils.power.alt;

import anvil.api.utils.power.IPowerHandler;
import anvil.api.utils.power.IPowerType;
import anvil.api.utils.power.PowerType;

public interface IHeatHandler extends IPowerHandler {
	final IPowerType type = PowerType.HEAT;
	int getTemperature();
}
