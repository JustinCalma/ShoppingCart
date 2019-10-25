public class ItemToPurchase {
	private String itemName;
	private int itemPrice;
	private int itemQuantity;
	
	public ItemToPurchase() {
		itemName = "None";
		itemPrice = 0;
		itemQuantity = 0;
	}
	
	public void setName(String userItemName) {
		itemName = userItemName;
	}
	
	public String getName() {
		return itemName;
	}
	
	public void setPrice(int userItemPrice) {
		itemPrice = userItemPrice;
	}
	
	public int getPrice() {
		return itemPrice;
	}
	
	public void setQuantity(int userItemQuantity) {
		itemQuantity = userItemQuantity;
	}
	
	public int getQuantity() {
		return itemQuantity;
	}
}
