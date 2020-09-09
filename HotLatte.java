
public class HotLatte extends Product {

	public HotLatte() {
		super("ÇÖ¶ó¶¼",3000);
	}
	@Override
	public boolean make() {
		if((stock.getMilk()>=1)&&(stock.getEspresso()>=1)) {
			stock.milkMinus();
			stock.espressoMinus();
			return true;
		}
		return false;
	}
	
	public void cancleCart() {
		stock.milkPlus();
		stock.espressoPlus();
	}
}
