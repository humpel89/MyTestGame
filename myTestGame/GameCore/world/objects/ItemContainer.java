package world.objects;

import java.util.ArrayList;

import items.model.Item;

public abstract class ItemContainer {

	private ArrayList<Item> itemList = new ArrayList<>();

	public void addItem(Item item){
		itemList.add(item);
	}

	protected Item remove(int number) throws Exception{
		if (numberDoesNotExits(number))
			throw new Exception();
		return itemList.remove(number);
	}

	protected ArrayList<Item> getAll(){
		ArrayList<Item> newItemList = itemList;
		itemList = null;
		return newItemList;
	}

	private boolean numberDoesNotExits(int number) {
		return (number < 0 || number > itemList.size());
	}

	public Item view(int number) {
		if (isEmpty())
			return null;
		return itemList.get(number);
	}

	public boolean isEmpty(){
		return itemList.isEmpty();
	}

	public int size(){
		return itemList.size();
	}

	protected void clear(){
		itemList.clear();
	}

}
