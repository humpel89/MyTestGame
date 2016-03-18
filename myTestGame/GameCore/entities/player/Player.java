package entities.player;

import entities.LivingEntity;
import entities.player.objects.Backpack;
import items.model.Armor;
import items.model.Weapon;

public class Player extends LivingEntity {

	Backpack bag;
	Weapon weapon;
	Armor armor;
	
	
	//@Override
	public Player(String name) {
		super(name);
		bag = new Backpack();
	}

}
