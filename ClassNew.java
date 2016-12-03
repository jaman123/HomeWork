package Absrtaction;

public class ClassNew implements Interface1 {

	

	@Override
	public void engine() {
		System.out.println("Bilkes have Engine");
		
	}

	@Override
	public void wheels() {
		System.out.println("Bilkes have Wheels");
		
	}

	@Override
	public void seat() {
		
		System.out.println("Bilkes have Seat");
		
	}

	@Override
	public void handle() {
		System.out.println("Bilkes have handle ");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		ClassNew obj = new ClassNew();
		obj.seat();
		obj.engine();
		obj.wheels();
		obj.handle();
	}

}
