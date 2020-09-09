
public class IceAmericano extends Product {

	public IceAmericano() {
		super("아이스아메리카노",2000);
	}
	@Override
	public boolean make() {
		if((stock.getWater()>=1)&&(stock.getEspresso()>=1)&&(stock.getIce()>=1)) {
			stock.waterMinus();
			stock.espressoMinus();
			stock.iceMinus();
			return true;
		}
		return false;
	}
	
	public void cancleCart() {
		stock.waterPlus();
		stock.espressoPlus();
		stock.icePlus();
	}
	
}
