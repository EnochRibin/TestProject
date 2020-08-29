package BillGeneration26;

public class BillGeneration {
	private int[] itemsArray = new int[5];
	private int[] priceArray = new int[5];
	private int noOfProducts;

	public int getNoOfProducts() {
		return noOfProducts;
	}

	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}

	public BillGeneration() {
//		productEntry();
	}

	public BillGeneration(int[] itemsArray, int[] priceArray, int noOfProducts) {
		super();
		this.itemsArray = itemsArray;
		this.priceArray = priceArray;
		this.noOfProducts = noOfProducts;
	}

	public int[] getItemsArray() {
		return itemsArray;
	}

	public int[] getPriceArray() {
		return priceArray;
	}

	public void setItemsArray(int[] itemsArray) {
		this.itemsArray = itemsArray;
	}

	public void setPriceArray(int[] priceArray) {
		this.priceArray = priceArray;
	}

//	private void productEntry() {
//		itemsArray[0] = 5001;
//		priceArray[0] = 10_000;
//		itemsArray[1] = 5002;
//		priceArray[1] = 100_000;
//		itemsArray[2] = 5003;
//		priceArray[2] = 500_000;
//		itemsArray[3] = 5004;
//		priceArray[3] = 600_000;
//		itemsArray[4] = 5005;
//		priceArray[4] = 1000;
//	}

//	public void displayItems() {
//		System.out.println("____________________________");
//		System.out.println("ItemID                 Price");
//		System.out.println(itemsArray[0] + "                 " + priceArray[0]);
//		System.out.println(itemsArray[1] + "                 " + priceArray[1]);
//		System.out.println(itemsArray[2] + "                 " + priceArray[2]);
//		System.out.println(itemsArray[3] + "                 " + priceArray[3]);
//		System.out.println(itemsArray[4] + "                 " + priceArray[4]);
//	}
	public void displayItems() {
		System.out.println("___________________");
		System.out.println("ItemID            Price");
		for (int i = 0; i < noOfProducts; i++)
			System.out.println(itemsArray[i] + "         " + priceArray[i]);
	}

	public boolean isInItems(int itemID) {
		for (int i = 0; i < noOfProducts; i++) {
			if (itemsArray[i] == itemID)
				return true;
		}
		return false;

	}

	public int calculateBill(double discount, int quantity, int itemID) {
		int productPrice = 0;
		for (int i = 0; i < noOfProducts; i++) {
			if (itemsArray[i] == itemID) {
				productPrice = priceArray[i];
			}
		}
		int discountedPrice = (int) ((quantity) * discount);
		return ((productPrice * quantity) - discountedPrice);
	}

}
