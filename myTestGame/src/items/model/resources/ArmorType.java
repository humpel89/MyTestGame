package items.model.resources;

import items.model.Stat;

public enum ArmorType {
	HEAVYLEATHER(2.0, Stat.STRENGTH),
	LIGHTLEATHER(1.4, Stat.AGILITY),
	CLOTH(1.1, Stat.MAGIC);
	
	private final double armorMultiplier;
	private final Stat mainStat;
	
	ArmorType(double armorMultiplier, Stat mainStat) {
	this.armorMultiplier = armorMultiplier;
	this.mainStat = mainStat;
	}
	
	public double getArmorMultiplier(){
		return armorMultiplier;
	}
	
	public Stat getMainStat(){
		return mainStat;
	}
}
