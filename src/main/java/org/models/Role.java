package org.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Role {

	TANK, SUPPORT, SOLDIER, MAGE, DAMAGE;

	private static Map<Role, List<Hero>> roles = new HashMap<Role, List<Hero>>();

	static {
		Role[] values = Role.values();
		int ammountValues = values.length;

		if (roles.isEmpty()) {
			for (int i = 0; i < ammountValues; i++) {
				roles.put(values[i], new ArrayList<Hero>());
			}
		}

	}

	public static Map<Role, List<Hero>> getRolesMap() {
		return roles;
	}
}
