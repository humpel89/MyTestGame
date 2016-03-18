package world.objects.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import items.model.Armor;
import items.model.Weapon;
import items.model.resources.ArmorType;
import items.model.resources.Quality;
import items.model.resources.WeaponType;
import world.objects.LootCrate;

public class LootCrateTest {

	LootCrate bossChest;
	LootCrate emptyChest;
	LootCrate randomChest;

	int zoneLevel = 15;

	@Before
	public void setUp() throws Exception {
		bossChest = new LootCrate();
		emptyChest = new LootCrate();
		randomChest = new LootCrate();
	}

	@After
	public void tearDown() throws Exception {
		bossChest = null;
		emptyChest = null;
		randomChest = null;
	}

	@Test
	public void testAddLoot(){
		bossChest.addItem(new Weapon(zoneLevel, Quality.COMMON, WeaponType.AXE));
		bossChest.addItem(new Armor(zoneLevel, Quality.UNCOMMON, ArmorType.CLOTH));
	}

	@Test
	public void testGetLoot() {
		bossChest.addItem(new Weapon(zoneLevel, Quality.EPIC, WeaponType.AXE));
		bossChest.addItem(new Armor(zoneLevel, Quality.UNCOMMON, ArmorType.CLOTH));
		System.out.println(bossChest.getLoot());
	}

	@Test //(expected=IndexOutOfBoundsException.class)
	public void testGetLootWhenEmpty() { //throws Exception{		
		bossChest.addItem(new Weapon(zoneLevel, Quality.COMMON, WeaponType.BROADSWORD));
		bossChest.addItem(new Armor(zoneLevel, Quality.UNCOMMON, ArmorType.CLOTH));
		System.out.println(bossChest.getLoot());
		assertEquals(null, bossChest.getLoot());
	}

	@Test
	public void testIsEmpty() {
		bossChest.addItem(new Armor(zoneLevel, Quality.LEGENDARY, ArmorType.CLOTH));
		System.out.println(bossChest.getLoot());
		assertEquals(true, emptyChest.isEmpty());
	}

}
