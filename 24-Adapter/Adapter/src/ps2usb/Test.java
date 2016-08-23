package ps2usb;

public class Test {
	public static void main(String[] args) {
		ConectorPs2 ps2 = new ConectorPs2();
		
		Usb usb = new Adapter(ps2);
		
		usb.canal1();
		usb.canal2();
		usb.canal3();
		usb.canal4();
		usb.canal5();
		usb.canal6();
		usb.canal7();
		usb.canal8();
		
		
	}
}
