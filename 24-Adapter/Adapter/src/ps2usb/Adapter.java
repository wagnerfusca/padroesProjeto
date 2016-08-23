package ps2usb;

public class Adapter implements Usb{

	Ps2 ps2;
	
	public Adapter(Ps2 ps2){
		this.ps2 = ps2;
	}
	
	@Override
	public void canal1() {
		ps2.canal1();
		
	}

	@Override
	public void canal2() {
		ps2.canal2();
		
	}

	@Override
	public void canal3() {
		ps2.canal3();
		
	}

	@Override
	public void canal4() {
		System.out.println("canal 4 nao usado");
		
	}

	@Override
	public void canal5() {
		System.out.println("canal 5 nao usado");
		
	}

	@Override
	public void canal6() {
		System.out.println("canal 6 nao usado");
		
	}

	@Override
	public void canal7() {
		System.out.println("canal 7 nao usado");
		
	}

	@Override
	public void canal8() {
		ps2.canal4();
		
	}

}
