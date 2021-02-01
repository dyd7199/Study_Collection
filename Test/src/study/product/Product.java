package study.product;

public class Product implements ProductInterface{
	// member field
	protected String model;
	protected int price;
	
	public Product(String model, int price) {
		this.model = model;
		this.price = price;
		
	}
	@Override
	public void out() {
		// TODO Auto-generated method stub
		
	}
	

	//getter setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	
	
}
