package lesson4homework3;

public class KampanyaManager {

	public void add(Kampanya kampanya)
	{
		System.out.println("Yeni kampanya eklendi " + kampanya.kampanyaAdi);
		
	}
	
	
	public void delete(Kampanya kampanya)
	{
		System.out.println("Kampanya silindi " + kampanya.kampanyaAdi);
		
	}
	
	
	public void update(Kampanya kampanya)
	{
		System.out.println("Kampanya güncellendi, Yeni Fiyat : " + kampanya.getYeniFiyat());
		
	}
	
	
	
}
