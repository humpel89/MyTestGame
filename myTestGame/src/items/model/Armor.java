package items.model;

import items.Equippable;
import items.model.resources.ArmorType;
import items.model.resources.Quality;
import items.model.utilities.ItemNameTool;

public class Armor extends Item implements Equippable {
	
	
	private int level;
	private Quality quality;
	private ArmorType type;
	private String name;
	
	public Armor(int level, Quality quality, ArmorType type){
		this.level = level;
		this.quality = quality;
		this.type = type;
		this.name = generateArmorName();
	}
	
	public int getItemLevel(){
		return level;
	}
	
	private String generateArmorName() { 
		return ItemNameTool.constructRandomArmorName(quality, type);
	}
	
	@Override
	public void equip() {
		// TODO Auto-generated method stub
	}

	@Override
	public void unEquip() {
		// TODO Auto-generated method stub
	}
	@Override
	public String toString(){
		return name;
	}

}
