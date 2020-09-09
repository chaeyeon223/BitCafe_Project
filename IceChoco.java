
public class IceChoco extends Product {

	public IceChoco() {
		super("아이스초코",3000);
	}
	@Override
	public boolean make() {
		if((stock.getMilk()>=1)&&(stock.getIce()>=1)&&(stock.getSyrup()>=1)) {
			stock.milkMinus();
			stock.iceMinus();
			stock.syrupMinus();
			return true;
		}
		return false;
	}
	
	public void cancleCart() {
		stock.milkPlus();
		stock.icePlus();
		stock.syrupPlus();
	}
}
