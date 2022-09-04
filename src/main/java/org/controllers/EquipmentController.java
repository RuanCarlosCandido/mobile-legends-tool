package org.controllers;

import java.util.List;
import java.util.Map;

import org.models.Equipment;
import org.models.EquipmentType;
import org.models.Hero;
import org.services.EquipmentService;

public class EquipmentController {

	private EquipmentService equipmentService = new EquipmentService();

	public Map<EquipmentType, List<Equipment>> getCounterEquipments() {
		return equipmentService.getCounterEquipments();

	}
	
	public void setPickedHeroes(List<Hero> pickedHeroes) {
		equipmentService.setPickedHeroes(pickedHeroes); 
	}

}
