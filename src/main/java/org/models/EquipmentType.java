package org.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum EquipmentType {
	ATTACK, MAGIC, DEFENSE, MOVEMENT, JUNGLING, ROAMING;

	static Map<EquipmentType, List<Equipment>> types = new HashMap<EquipmentType, List<Equipment>>();
	static {
		for (EquipmentType type : values())
			types.put(type, new ArrayList<Equipment>());
	}

	public static Map<EquipmentType, List<Equipment>> getTypes() {

		return types;
	}

}
