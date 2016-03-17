package world.objects;

import actions.Lootable;
import items.model.Item;

public class LootCrate extends ItemContainer implements Lootable {
	
private static final int FIRST_ITEM = 0;	
	
	@Override
	public Item getLoot() throws Exception {
		return super.remove(FIRST_ITEM);
	}
	

}
