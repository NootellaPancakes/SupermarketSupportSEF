
public class product {
	private int prodID;
	private double pricePerUnit;
	private String prodName;
	private int quantityRequiredForDiscount;
	private int discountAmount;
	private int stock;
	private double weight;
	

		public product(int prodID, double pricePerUnit, String prodName, int quantityRequiredForDiscount,
				int discountAmount, int stock, double weight) {
			super();
			this.prodID = prodID;
			this.pricePerUnit = pricePerUnit;
			this.prodName = prodName;
			this.quantityRequiredForDiscount = quantityRequiredForDiscount;
			this.discountAmount = discountAmount;
			this.stock = stock;
			this.weight = weight;
		}
	
	

	public int getProdID() {
		return prodID;
	}

	public void setProdID(int prodID) {
		this.prodID = prodID;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int checkStock(int stock) {
		return stock;
	}

}
