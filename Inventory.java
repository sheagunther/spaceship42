import java.util.*;


public class Inventory {

	ArrayList<Item> inventory = new ArrayList<Item>();
	int numberOfItemsInInventory = inventory.size();
	
	public ArrayList<Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}

	public int getNumberOfItemsInInventory() {
		return numberOfItemsInInventory;
	}

	public void setNumberOfItemsInInventory(int numberOfItemsInInventory) {
		this.numberOfItemsInInventory = numberOfItemsInInventory;
	}

	public Inventory(){
	}
	
	public void addToInventory(Item itemToAdd){
		inventory.add(itemToAdd);
	}
	
	public boolean isInInventory(Item itemToAdd){
		return inventory.contains(itemToAdd);
	}
	
	public void removeFromInventory(Item itemToRemove){
		inventory.remove(itemToRemove);
	}
	
	
}
