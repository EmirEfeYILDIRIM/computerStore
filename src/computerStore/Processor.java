package computerStore;

public class Processor {
	public String name;
	public int core;
	public double ghz;
	public double frekans;
	public int cache;
	public int gt;
	public int tdp;
	public void printInf(){
		System.out.print(this.name);
		System.out.print(" "+this.core+" Çekirdek ");
		System.out.print(" "+this.ghz+"Max Frekansı");
		System.out.print(" "+this.frekans+"Temel Frekansı");
		System.out.print(" "+this.cache+"Önbellek");
		System.out.print(" "+this.gt+"GT/z");
		System.out.println(" "+this.tdp+"W");
		
	}
}
