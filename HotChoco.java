
public class HotChoco extends Product {

	public HotChoco() {
		super("ÇÖÃÊÄÚ",3000);
	}
	@Override
	public boolean make() {
		if((stock.getMilk()>=1)&&(stock.getSyrup()>=1)) {
			stock.milkMinus();
			stock.syrupMinus();
			return true;
		}
		return false;
	}
	
	public void cancleCart() {
		stock.milkPlus();
		stock.syrupPlus();
	}
}
