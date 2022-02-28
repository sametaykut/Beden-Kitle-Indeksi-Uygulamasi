package bki;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Boyunuzu Giriniz:");
		double boy = scanner.nextDouble();
		System.out.print("Kilonuzu Giriniz:");
		int kilo = scanner.nextInt();
		double bki = kilo / (boy*boy);
		
	System.out.println(bki);
		
		if (bki < 18.5) {
			
			System.out.println("Zayýfsýnýz");
		}
		
		else if (18.5 <= bki && bki < 25 ) {
			System.out.println("Normalsiniz");
		}
		
		else if (25 <= bki && bki < 30 ) { 
			System.out.println("Fazla Kilolusunuz");
	
			
		}
		
		else {
			System.out.println("Obezsiniz");
		}
	}
	

}