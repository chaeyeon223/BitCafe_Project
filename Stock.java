
public class Stock {

	private int water;
	private int milk;
	private int espresso;
	private int syrup;
	private int ice;
	private int spakling;
	private int cake;
	private int bread;
	private int macaron;

	
	//생성자
	public Stock() {
		this.water = 0;
		this.milk = 0;
		this.espresso=0;
		this.syrup=0;
		this.ice=0;
		this.spakling=0;
		this.cake=0;
		this.bread=0;
		this.macaron=0;
	}

	
	public void waterMinus() {
		this.water--;
	}
	public void milkMinus() {
		this.milk--;
	}
	public void espressoMinus() {
		this.espresso--;
	}
	public void syrupMinus() {
		this.syrup--;
	}
	public void iceMinus() {
		this.ice--;
	}
	public void spaklingMinus() {
		this.spakling--;
	}
	public void cakeMinus() {
		this.cake--;
	}
	public void breadMinus() {
		this.bread--;
	}
	public void macaronMinus() {
		this.macaron--;
	}

	
	public void waterPlus() {
		this.water++;
	}
	public void milkPlus() {
		this.milk++;
	}
	public void espressoPlus() {
		this.espresso++;
	}
	public void syrupPlus() {
		this.syrup++;
	}
	public void icePlus() {
		this.ice++;
	}
	public void spaklingPlus() {
		this.spakling++;
	}
	public void cakePlus() {
		this.cake++;
	}
	public void breadPlus() {
		this.bread++;
	}
	public void macaronPlus() {
		this.macaron++;
	}
	
	
	//getter
	public int getWater() {
		return water;
	}
	public int getMilk() {
		return milk;
	}
	public int getEspresso() {
		return espresso;
	}
	public int getSyrup() {
		return syrup;
	}
	public int getIce() {
		return ice;
	}
	public int getSpakling() {
		return spakling;
	}
	public int getCake() {
		return cake;
	}
	public int getBread() {
		return bread;
	}
	public int getMacaron() {
		return macaron;
	}
	
	//restock
	public boolean restock(int choiceStock,int amount) {
		switch(choiceStock){
		case 1: this.water+=amount;
		break;
		case 2: this.milk+=amount;
		break;
		case 3: this.espresso+=amount;
		break;
		case 4: this.syrup+=amount;
		break;
		case 5: this.ice+=amount;
		break;
		case 6: this.spakling+=amount;
		break;
		case 7: this.cake+=amount;
		break;
		case 8: this.bread+=amount;
		break;
		case 9: this.macaron+=amount;
		break;
		default: System.out.println("번호를 다시 선택해주세요");
		break;
		}
		return false;
	}




}

	


