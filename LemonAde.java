
public class LemonAde extends Product {

	public LemonAde() {
		super("레몬에이드",5000);
	}
	@Override
	public boolean make() {
		if((stock.getSpakling()>=1)&&(stock.getIce()>=1)&&(stock.getSyrup()>=1)) {
			stock.spaklingMinus();
			stock.iceMinus();
			stock.syrupMinus();
			return true;
		}
		return false;
	}
	
	public void cancleCart() {
		stock.spaklingPlus();
		stock.icePlus();
		stock.syrupPlus();
	}
}
