package computerStore;

public class GraghicCard {
	public String name;
	public int memory;
	public int bit;
	public boolean hdmi;
	public boolean vga;
	public String marka;
	public void printInfo() {
		System.out.print(this.name.toUpperCase());
		System.out.print(" "+this.memory+" GByte ");
		System.out.print (" "+this.bit+"BİT "+" "+(this.vga?"VDA":" "));
		System.out.println(this.marka);		
	}
	public void printHdmi() {
		System.out.println(this.hdmi?"var":"yok");
	}
}
