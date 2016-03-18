package items.controller.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import items.controller.ItemCreator;
import items.model.Item;
import items.model.resources.ArmorType;
import items.model.resources.FoodType;
import items.model.resources.Quality;
import items.model.resources.WeaponType;

public class ItemCreatorTest {
	
	ItemCreator creator = new ItemCreator();
	int level = 10;
	WeaponType weaponType;
	ArmorType armorType;
	FoodType foodType;
	
	@Before
	public void setUp() throws Exception {
		weaponType = WeaponType.AXE;
		armorType = ArmorType.LIGHTLEATHER;
		foodType = FoodType.FOOD;
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
//	@Test
//	public void testCreateItem(){
//		Item weapon = creator.createItem(level, Quality.EPIC, );
//		
//	}
	
	@Test
	public void testCreateWeapon(){
		Item weapon = creator.createWeapon(level, Quality.COMMON, weaponType);
	}
	
	@Test
	public void testCreateArmor(){
		Item armor = creator.createArmor(level, Quality.COMMON, armorType);
	}
	
	@Test
	public void testCreateFood(){
		Item food = creator.createFood(level, Quality.COMMON, foodType);
	}
	
	@Test
	public void testNewRandomItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testNewRandomFood() {
		fail("Not yet implemented");
	}

	@Test
	public void testNewRandomWeapon() {
		fail("Not yet implemented");
	}

	@Test
	public void testNewRandomArmor() {
		fail("Not yet implemented");
	}

}
