package world.objects;

import java.util.ArrayList;

import actions.Lootable;
import items.model.Item;

public class LootCrate extends ItemContainer implements Lootable {	

	public ArrayList<Item> getLoot() {
		return super.getAll();
	}

}
