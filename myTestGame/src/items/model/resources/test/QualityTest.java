package items.model.resources.test;

import static org.junit.Assert.*;
import java.awt.Color;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import items.model.resources.Quality;

public class QualityTest {
	
	private Quality common;
	private Quality uncommon;
	private Quality rare;
	private Quality epic;
	private Quality legendary;
	
	@Before
	public void setUp() throws Exception {
		common = Quality.COMMON;
		uncommon = Quality.UNCOMMON;
		rare = Quality.RARE;
		epic = Quality.EPIC;
		legendary = Quality.LEGENDARY;
	}

	@After
	public void tearDown() throws Exception {
		common = null;
		uncommon = null;
		rare = null;
		epic = null;
		legendary = null;
	}

	@Test
	public void testQuality() {
		assertEquals(Quality.COMMON, common);
		assertEquals(Quality.UNCOMMON, uncommon);
		assertEquals(Quality.RARE, rare);
		assertEquals(Quality.EPIC, epic);
		assertEquals(Quality.LEGENDARY, legendary);
	}

	@Test
	public void testGetStatMultiplier() {
		assertEquals(1.0, common.getStatMultiplier(), 0.001);
		assertEquals(1.2, uncommon.getStatMultiplier(), 0.001);
		assertEquals(1.4, rare.getStatMultiplier(), 0.001);
		assertEquals(1.6, epic.getStatMultiplier(), 0.001);
		assertEquals(2.0, legendary.getStatMultiplier(), 0.001);
	}

	@Test
	public void testGetItemThemeColor() {
		assertEquals(Color.WHITE, common.getItemColor());
		assertEquals(Color.GREEN, uncommon.getItemColor());
		assertEquals(Color.BLUE, rare.getItemColor());
		assertEquals(Color.MAGENTA, epic.getItemColor());
		assertEquals(Color.ORANGE, legendary.getItemColor());
	}
	
	@Test
	public void testGetDropChanceMultiplier(){
		assertEquals(1.0, common.getDropChanceMultiplier(), 0.001);
		assertEquals(0.20, uncommon.getDropChanceMultiplier(), 0.001);
		assertEquals(0.05, rare.getDropChanceMultiplier(), 0.001);
		assertEquals(0.01, epic.getDropChanceMultiplier(), 0.001);
		assertEquals(0.001, legendary.getDropChanceMultiplier(), 0.001);
	}

}
