package entities.player.objects.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import entities.player.objects.Backpack;
import items.model.Armor;
import items.model.Item;
import items.model.Weapon;
import items.model.resources.ArmorType;
import items.model.resources.Quality;
import items.model.resources.WeaponType;

public class BackpackTest {
	
	Backpack bag;
	ArrayList<Item> testItem;
	
	
	@Before
	public void setUp() throws Exception {
		bag = new Backpack();
		testItem = new ArrayList<>();
		testItem.add(new Weapon(12, Quality.COMMON, WeaponType.AXE));
		testItem.add(new Weapon(4, Quality.UNCOMMON, WeaponType.BROADSWORD));
		testItem.add(new Weapon(16, Quality.EPIC, WeaponType.DAGGER));
		testItem.add(new Armor(13, Quality.EPIC, ArmorType.CLOTH));
		testItem.add(new Armor(5, Quality.RARE, ArmorType.LIGHTLEATHER));
		testItem.add(new Armor(56, Quality.LEGENDARY, ArmorType.HEAVYLEATHER));

	}

	@After
	public void tearDown() throws Exception {
		bag = null;
	}

	@Test
	public void testAddItem() {
		bag.addItem(testItem.get(0));
		bag.addItem(testItem.get(2));
		bag.addItem(testItem.get(4));
		assertEquals(3, bag.size());
	}

	@Test
	public void testViewAndRemoveItemAtSlot() throws Exception {
		bag.addItem(testItem.get(0));
		bag.addItem(testItem.get(1));
		bag.addItem(testItem.get(2));
		bag.removeItemAtSlot(1);
		assertEquals(testItem.get(0), bag.view(0));
		assertEquals(testItem.get(2), bag.view(1));
		bag.clearBackPack();
		assertTrue(bag.isEmpty());
	}

	@Test
	public void testIsEmpty() throws Exception {
		assertTrue(bag.isEmpty());
		bag.addItem(testItem.get(5));
		bag.removeItemAtSlot(0);
		assertTrue(bag.isEmpty());
		bag.addItem(testItem.get(4));
		assertFalse(bag.isEmpty());
	}

	@Test
	public void testSize() throws Exception {
		bag.addItem(testItem.get(0));
		bag.addItem(testItem.get(1));
		bag.addItem(testItem.get(2));
		assertEquals(3, bag.size());
		bag.addItem(testItem.get(3));
		bag.addItem(testItem.get(4));
		bag.addItem(testItem.get(2));
		assertEquals(6, bag.size());
		bag.removeItemAtSlot(0);
		assertEquals(5, bag.size());
	}

}
