import java.util.Scanner;

public class PUIRechner {

	public static void main(String[] args)
	{
	int auswahl;
	auswahl = 0;
	System.out.println("Waehlen sie bitte die Rechenoperation aus: ");
	Scanner sc = new Scanner(System.in);
	System.out.println("1: Widerstand aus Spannung und Stromstaerke");
	System.out.println("2: Spannung aus Widerstand und Stromstaerke");
	System.out.println("3: Stromstaerke aus Spannung und Widerstand");
	auswahl = sc.nextInt();
	sc.close();
	}
	
	public static void var1()
	{
		Double u,i,p;
		Scanner Sc1 = new Scanner(System.in);
		System.out.println("Bitte geben sie den Widerstand(R) an: ");
		p = Sc1.nextDouble();
		System.out.println("Bitte geben sie die Stromstaerke(A) an: ");
		i = Sc1.nextDouble();
	}

}
