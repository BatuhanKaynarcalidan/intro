package intro;

import java.util.Iterator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		String internetSubeButonu = "Internet Subesi";
		double dolarDun = 2.30;
		double dolarBugun = 2.30;
		int vade = 36; 
		boolean dustuMu = false; 
		System.out.println(internetSubeButonu);
		if (dolarBugun < dolarDun) 
		{
			System.out.println("Dolar Dustu Resmi");
		}
		else if (dolarBugun > dolarDun) 
		{
			System.out.println("Dolar Yukseldi Resmi");
		} 

		else 
		{
			System.out.println("Dolar Esit Resmi");
		}
		
		String kredi1 = "Hizli Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Ciftci Kredisi";
		String kredi5 = "Msb Kredisi";
		String kredi6 = "Meb Kredisi";

		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);

		String[] krediler = 
			{
				"Hizli Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Ciftci Kredisi",
				"Msb Kredisi",
				"Meb Kredisi"
			};
		
		for (String kredi : krediler) 
		{
			System.out.println(kredi);
		}

		for(int i = 0;i<krediler.length;i++)
		{
			System.out.println(krediler[i]);

		}
		
	}

}
