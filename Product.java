

public abstract class Product {
	String name;
	int price;
	boolean ispublish;
	Stock stock=new Stock();
	
	public Product(String name,int price){
		this.name=name;
		this.price=price;
		this.ispublish=false;
	}
	
	protected abstract boolean make();
	
}
