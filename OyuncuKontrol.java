package lesson4homework3;



public class OyuncuKontrol {
	
	public boolean isValid(Oyuncu oyuncu)
	{
		
		if(!oyuncu.ad.isEmpty() && !oyuncu.dogumTarihi.isEmpty())
		{
			return true;
		}
		
		else {
			
			return false;
		}
	}

}
