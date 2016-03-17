package items.model;

import items.model.resources.FoodType;
import items.model.resources.Quality;

public class Consumable extends Item  {

	private int level;
	private Quality quality;
	private FoodType type;
	
	public Consumable(int level, Quality quality, FoodType type){
		this.level = level;
		this.quality = quality;
		this.type = type;
	}
	
}
