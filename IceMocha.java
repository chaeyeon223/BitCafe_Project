
public class IceMocha extends Product {

	public IceMocha() {
		super("���̽���ī",4000);
	}
	@Override
	public boolean make() {
		if((stock.getMilk()>=1)&&(stock.getEspresso()>=1)&&(stock.getIce()>=1)&&(stock.getSyrup()>=1)) {
			stock.milkMinus();
			stock.espressoMinus();
			stock.iceMinus();
			stock.syrupMinus();
			return true;
		}
		return false;
	}
	
	public void cancleCart() {
		stock.milkPlus();
		stock.espressoPlus();
		stock.icePlus();
		stock.syrupPlus();
	}

}
