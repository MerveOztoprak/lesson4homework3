package lesson4homework3;

public class OyuncuManager {
	
	
	public void add(Oyuncu oyuncu)
	{
		OyuncuKontrol kontrol= new OyuncuKontrol();
		if(kontrol.isValid(oyuncu))
		{
			
			System.out.println( oyuncu.ad + " Adlý oyuncu eklendi " );
		}
		
		else
		{
			System.out.println("kiþi bilgileri geçersizdir. ");
		}
		
		
	}
	
	

	public void delete(Oyuncu oyuncu)
	{
		OyuncuKontrol kontrol= new OyuncuKontrol();
		
		if(kontrol.isValid(oyuncu))
		{
			
			System.out.println( oyuncu.ad + " Adlý oyuncu silindi " );
		}
		
		else
		{
			System.out.println("Böyle bir oyuncu yok ");
		}
		
	
	}
	
	

	public void update (Oyuncu oyuncu)
	{
		OyuncuKontrol kontrol= new OyuncuKontrol();
		
		if(kontrol.isValid(oyuncu))
		{
			System.out.println( oyuncu.ad + " Adlý oyuncu bilgileri güncellendi " );

		}
		
		else
		{
			System.out.println("Böyle bir oyuncu yok ");
		}
		
	}

}
