package lesson4homework3;

public class Kampanya extends Oyun {
	

	String kampanyaAdi;
	 double indirimOranư;
	private double yeniFiyat;
	
	public Kampanya(double yeniFiyat) {
		
		this.yeniFiyat = yeniFiyat;
	}
	
		
	public Kampanya() {
		
		
	}


	public double getYeniFiyat() {
		return oyunFiyati-(oyunFiyati*indirimOranư /100) ;

	}
	

}
