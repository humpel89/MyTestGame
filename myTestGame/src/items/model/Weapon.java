package items.model;

import items.model.resources.Quality;
import items.model.resources.WeaponType;
import items.model.utilities.ItemNameTool;

public class Weapon extends Equipment {
	
	private String name;
	private int level;
	private Quality quality;
	private WeaponType type;
	private Stat mainStat;
	
	public Weapon(int level, Quality quality, WeaponType type){
		this.level = level;
		this.quality = quality;
		this.type = type;
		this.name = generateWeaponName();
		this.mainStat = type.getMainStat();
	}
	
	
	
	private String generateWeaponName() { 
		return ItemNameTool.constructRandomWeaponName(quality, type);
	}
	
	@Override
	public String toString(){
		return name;
	}
}
