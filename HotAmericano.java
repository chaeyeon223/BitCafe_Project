
public class HotAmericano extends Product {

	public HotAmericano() {
		super("�Ƹ޸�ī��",2000);
	}
	@Override
	public boolean make() {
		if((stock.getWater()>=1)&&(stock.getEspresso()>=1)) {
			stock.waterMinus();
			stock.espressoMinus();
			return true;
		}
		return false;
	}
	
	public void cancleCart() {
		stock.waterPlus();
		stock.espressoPlus();
	}
}