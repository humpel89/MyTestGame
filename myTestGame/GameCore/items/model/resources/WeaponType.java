package items.model.resources;

import items.model.Stat;

public enum WeaponType {
	AXE(2.0, Stat.STRENGTH),
	BROADSWORD(1.4, Stat.STRENGTH),
	DAGGER(0.6, Stat.AGILITY),
	BOW(1.1, Stat.AGILITY),
	SPELLSWORD(1.1, Stat.MAGIC),
	STAFF(1.8, Stat.MAGIC);
	
	private final double attackSpeed;
	private Stat mainStat;
	
	
	WeaponType(double attackSpeed, Stat mainStat){
		this.attackSpeed = attackSpeed;
		this.mainStat = mainStat;
	}

	public double getAttackSpeed() {
		return attackSpeed;
	}
	
	public Stat getMainStat(){
		return mainStat;
	}
	
}
