package computerStore;

public class Main {

	public static void main(String[] args) {
		GraghicCard gk1=new GraghicCard();
		gk1.name="Nvidia rtx 3060";
		gk1.memory=16;
		gk1.bit=256;
		gk1.hdmi=false;
		gk1.vga=false;
		gk1.marka="Vatan";
		GraghicCard gk2=new GraghicCard();
		gk2.name="GeForce gtx 1050";
		gk2.memory=32;
		gk2.bit=384;
		gk2.hdmi=false;
		gk2.vga=true;
		gk2.marka="Uğur";								
		gk1.printInfo();
		gk2.printInfo();
		gk2.printHdmi();
		
		
		
		
		
		
		
		
		Processor pr1=new Processor();
		pr1.name="İntel Core i7";
		pr1.core=8;
		pr1.ghz=4.90;
		pr1.frekans=1.80;
		pr1.cache=8;
		pr1.gt=4;
		pr1.tdp=15;		
		Processor pr2=new Processor();
		pr2.name="AMD Ryzen 9 5950X";
		pr2.core=16;
		pr2.ghz=4.90;
		pr2.frekans=3.40 ;
		pr2.cache=64;
		pr2.gt=4;
		pr2.tdp=15; 
		pr1.printInf();
		pr2.printInf();
	}

}
