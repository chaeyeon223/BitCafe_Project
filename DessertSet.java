
public class DessertSet extends Product {

	public DessertSet() {
		super("디저트세트",15000);
	}
	@Override
	public boolean make() {
		if((stock.getCake()>=1)&&(stock.getBread()>=1)&&(stock.getMacaron()>=1)) {
			stock.cakeMinus();
			stock.breadMinus(); 
			stock.macaronMinus(); 
			return true;
		}
		return false;
	}
	
	public void cancleCart() {
		stock.cakePlus();
		stock.breadPlus(); 
		stock.macaronPlus(); 
	}
	

}
