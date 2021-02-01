package study.product;

public class Person  {
	private String name;
	private int money;
	Product prod;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
		
	
	}
	
	
	public void buy(Product prod) {
		this.prod = prod;
		this.money -= prod.getPrice();
		
		if(this.money<0) {
			System.out.println("error!! ÀÜµ·ºÎÁ·");
			return;
		}
		
		System.out.println("model: "+ prod.getModel()+"\nÀÜ¾×: "+this.money);
		
	}
	
	
	
}
