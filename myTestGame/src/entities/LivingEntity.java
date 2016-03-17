package entities;

import items.model.Stat;

public class LivingEntity {

	private final String name;
	private Stat strength;
	private Stat agility;
	private Stat magic;
	private double HEALTH_POINTS_FULL;
	private double health;
	private double attackPower;
	private double critChance;
	private double spellCritChance;
	
	
	public LivingEntity(String name){
		this.name = name;
		this.strength = Stat.STRENGTH;
		this.agility = Stat.AGILITY;
		this.magic = Stat.MAGIC;
	}
}
