package items.model.resources;

import java.awt.Color;

/**
 * This enum handles stats relative to an item quality, and is used together with items
 * to calculate varios drop chances and stats, and also what "colour" a weapon should be.
 * @author Hampus
 *
 */
public enum Quality{
	COMMON(1.0, 1.0, Color.WHITE), 
	UNCOMMON(1.2, 0.2, Color.GREEN), 
	RARE(1.4, 0.05, Color.BLUE), 
	EPIC(1.6, 0.01, Color.MAGENTA), 
	LEGENDARY(2.0, 0.001, Color.ORANGE);
	
	private final double statMultiplier;
	private final double dropChanceMultiplier;
	private final Color itemThemeColor;
	
	Quality(double statMultiplier, double dropChanceMultiplier, Color itemThemeColor){
		this.statMultiplier = statMultiplier;
		this.dropChanceMultiplier = dropChanceMultiplier;
		this.itemThemeColor = itemThemeColor;
	}
	
	public double getStatMultiplier(){
		return statMultiplier;
	}

	public Color getItemColor() {
		return itemThemeColor;
	}

	public double getDropChanceMultiplier() {
		return dropChanceMultiplier;
	}

}
