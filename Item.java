package main;
public class Item {
	protected String name;
	protected String category;
	protected int price
	public Item() {
	}
	public Item(String itemName, String itemCategory, int itemPrice) {
		this.name = itemName;
		this.category = itemCategory;
		this.price = itemPrice;
	}
	public void setPrice(int itemPrice) {
		this.price = itemPrice;
	}
	public void setName(String itemName) {
		this.name = itemName;
	}
	public void setCategory(String itemCategory) {
		this.category = itemCategory;
	}
	public int getPrice() {
		return this.price;
	}
	public String getName() {
		return this.name;
	}
	public String getCategory() {
		return this.category;
	}
}
