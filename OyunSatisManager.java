package lesson4homework3;

public class OyunSatisManager extends Oyun implements KampanyaSatis {

	@Override
	public void add() {
		
		System.out.println("Oyun satışı gerçekleştirildi " );
		
	}

	@Override
	public void delete() {
	
		System.out.println("Oyun silindi ");

		
	}

	@Override
	public void update() {
		
		System.out.println("Oyun güncellendi ");

		
	}

}
