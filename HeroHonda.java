package Absrtaction;

public class HeroHonda extends Bike{
	
	@Override
	public void engine() {
		System.out.println("Bikes have Engine");
		
	}

	@Override
	public void wheels() {
		System.out.println("Bikes have Wheels");
		
	}
	public static void main(String[] args) {
		// Create Object
		HeroHonda objHH = new HeroHonda();
		objHH.engine();
		objHH.handle();
		objHH.seat();
		objHH.wheels();

}
}