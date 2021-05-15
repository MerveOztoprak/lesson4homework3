package lesson4homework3;

public class OyuncuManager {
	
	
	public void add(Oyuncu oyuncu)
	{
		OyuncuKontrol kontrol= new OyuncuKontrol();
		if(kontrol.isValid(oyuncu))
		{
			
			System.out.println( oyuncu.ad + " Adl� oyuncu eklendi " );
		}
		
		else
		{
			System.out.println("ki�i bilgileri ge�ersizdir. ");
		}
		
		
	}
	
	

	public void delete(Oyuncu oyuncu)
	{
		OyuncuKontrol kontrol= new OyuncuKontrol();
		
		if(kontrol.isValid(oyuncu))
		{
			
			System.out.println( oyuncu.ad + " Adl� oyuncu silindi " );
		}
		
		else
		{
			System.out.println("B�yle bir oyuncu yok ");
		}
		
	
	}
	
	

	public void update (Oyuncu oyuncu)
	{
		OyuncuKontrol kontrol= new OyuncuKontrol();
		
		if(kontrol.isValid(oyuncu))
		{
			System.out.println( oyuncu.ad + " Adl� oyuncu bilgileri g�ncellendi " );

		}
		
		else
		{
			System.out.println("B�yle bir oyuncu yok ");
		}
		
	}

}
