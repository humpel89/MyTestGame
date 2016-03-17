package items.model;

import java.util.HashMap;
import java.util.Map;

import items.model.resources.ItemSlot;

public class PlayerEquipment {

	Map<ItemSlot, Equipment> equipment;

	private Armor helmet;
	private Armor gloves;
	private Armor armor;

	private Weapon weapon;

	public PlayerEquipment(){
		equipment = new HashMap<>();
	}
	public void equip(Equipment gear) {
		Equipment equipped = equipment.get(gear.getItemSlot())
	}



	//		public Armor getEquipment(ItemSlot slot){
	//			return equipment[slot];
	//		}
	//
	//		public Armor unEquip(itemSlot slot) {
	//
	//			helmet = null;
	//		}

}
