package items.model.utilities;

import java.util.Random;

import items.model.resources.ArmorType;
import items.model.resources.Quality;
import items.model.resources.WeaponType;

public abstract class ItemNameTool {

	private static Random random = new Random();

	private static String[] equipmentEndingName = {"Frog", "Duck", "Dragon", "Wolf", "Swan", "Eagle", "Bear", "Fool"};
	private static String[] foodNames = {"Bird Stew", "Bear Steak", "Lentil's Soup", "Blueberry Pie"};
	private static String[] beverageNames = {"Batwing Tea", "Fresh Water", "Elven Coffee", "Lingonberry Juice"};

	public static String constructRandomWeaponName(Quality quality, WeaponType type){
		return createEquipmentName(quality.toString(), type.toString(), randomNameFrom(equipmentEndingName));
	}

	public static String constructRandomArmorName(Quality quality, ArmorType type){
		return createEquipmentName(quality.toString(), type.toString(), randomNameFrom(equipmentEndingName));
	}

	private static String createEquipmentName(String quality, String type, String endingName){
		String name = trimToStartWithCapital(quality) + " " + trimToStartWithCapital(type);
		if(quality.matches(Quality.COMMON.toString()))
			return name;
		name += " Of The " + endingName;
		return name;
	}

	public static String getRandomFoodName(){
		return randomNameFrom(foodNames);
	}

	public static String getRandomBeverageName(){
		return randomNameFrom(beverageNames);
	}

	private static String randomNameFrom(String[] nameList) {
		int randomInteger = random.nextInt(nameList.length);
		return nameList[randomInteger];
	}

	public static String trimToStartWithCapital(String name){
		String trimmed = name.toString().substring(0, 1).toUpperCase();
		trimmed += name.toString().substring(1).toLowerCase();
		return trimmed;
	}
}
