
public class HotMocha extends Product {

	public HotMocha() {
		super("ÇÖ¸ðÄ«",4000);
	}
	@Override
	public boolean make() {
		if((stock.getMilk()>=1)&&(stock.getEspresso()>=1)&&(stock.getSyrup()>=1)) {
			stock.milkMinus();
			stock.espressoMinus();
			stock.syrupMinus();
			return true;
		}
		return false;
	}
	
	public void cancleCart() {
		stock.milkPlus();
		stock.espressoPlus();
		stock.syrupPlus();
	}
}
