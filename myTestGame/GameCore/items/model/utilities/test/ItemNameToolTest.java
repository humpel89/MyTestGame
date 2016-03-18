package items.model.utilities.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import items.model.resources.Quality;
import items.model.resources.WeaponType;
import items.model.utilities.ItemNameTool;

public class ItemNameToolTest {

	int amountOfNames = 5;

	@Test
	public void testConstructRandomWeaponName() {
		System.out.println(ItemNameTool.constructRandomWeaponName(Quality.COMMON, WeaponType.AXE));
		System.out.println(ItemNameTool.constructRandomWeaponName(Quality.UNCOMMON, WeaponType.BROADSWORD));
		System.out.println(ItemNameTool.constructRandomWeaponName(Quality.RARE, WeaponType.BROADSWORD));
		System.out.println(ItemNameTool.constructRandomWeaponName(Quality.EPIC, WeaponType.DAGGER));
		System.out.println(ItemNameTool.constructRandomWeaponName(Quality.LEGENDARY, WeaponType.BOW));
	}

	@Test
	public void testConstructRandomArmorName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRandomFoodName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRandomBeverageName() {
		fail("Not yet implemented");
	}

	@Test
	public void testTrimToStartWithCapital() {
		fail("Not yet implemented");
	}

}
