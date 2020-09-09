
public class IceLatte extends Product {

	public IceLatte() {
		super("¾ÆÀÌ½º¶ó¶¼",3000);
	}
	@Override
	public boolean make() {
		if((stock.getMilk()>=1)&&(stock.getEspresso()>=1)&&(stock.getIce()>=1)) {
			stock.milkMinus();
			stock.espressoMinus();
			stock.iceMinus();
			return true;
		}
		return false;
	}
	
	public void cancleCart() {
		stock.milkPlus();
		stock.espressoPlus();
		stock.icePlus();
	}

}
