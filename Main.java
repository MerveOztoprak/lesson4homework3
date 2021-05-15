package lesson4homework3;

public class Main {

	public static void main(String[] args) {
		
		KampanyaManager kampanyaSatis= new KampanyaManager();
		Kampanya kampanya= new Kampanya();
		kampanya.kampanyaAdi="yýlbaþý özel kampanyasý";
		kampanya.oyunFiyati=500;
		kampanya.indirimOraný=12;
		kampanya.getYeniFiyat();
		
		kampanyaSatis.add(kampanya);
		kampanyaSatis.update(kampanya);
		
		Oyun oyun= new Oyun();
		oyun.oyunAdi="cs";
		
		
		OyuncuManager oyuncuM= new OyuncuManager();
		Oyuncu oyuncu= new Oyuncu();
		
		oyuncu.id=1;
		oyuncu.ad="Merve";
		oyuncu.soyadi="Öztoprak";
		oyuncu.dogumTarihi="1997.09.11";
		oyuncu.kimlikNo="12345678902";
		
		oyuncuM.add(oyuncu);		
		oyuncuM.delete(oyuncu);
		oyuncuM.update(oyuncu);
		
		OyunSatisManager oyunSatisManager= new OyunSatisManager();
		oyunSatisManager.add();
		
		
		
	}

}
