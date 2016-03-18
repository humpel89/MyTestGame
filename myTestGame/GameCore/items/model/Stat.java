package items.model;


public enum Stat {
	STRENGTH(1.5, 1.0, 1.0),
	AGILITY(1.0, 1.5, 1.0),
	MAGIC(1.0, 1.0, 1.5);

	private final double damageBonus;
	private final double critBonus;
	private final double spellCritBonus;
	
	
	Stat(double damageBonus, double critBonus, double spellCritBonus){
		this.damageBonus = damageBonus;
		this.critBonus = damageBonus;
		this.spellCritBonus = damageBonus;
	}
	
	public double getDamageBonus(){
		return damageBonus;
	}
	public double getCritBonus(){
		return critBonus;
	}
	public double getSpellCritBonus(){
		return spellCritBonus;
	}
	
}
