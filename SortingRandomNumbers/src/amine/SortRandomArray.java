package amine;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SortRandomArray {

	public static void main(String[] args) {

		int boyut;
		int dizi[];
		int temp;
		int count=0;
		Random randNum = new Random();
		ArrayList list = new ArrayList();

		Scanner scan = new Scanner(System.in);
		System.out.println("Dizinin boyutunu gir_");
		boyut = scan.nextInt();

		dizi = new int[boyut];
		
		//ayni sayilarin üretilmesini engeller
		while(true) {
			
			int sayi = randNum.nextInt(100);// 0 ile 100 arasında sayi üretir
			if(list.indexOf(sayi)==-1){
				list.add(sayi);
				dizi[count]=sayi;
				++count;
			}
			if(count==boyut)
				break;
											
		}

		System.out.println("Sıralanmamış Dizi:");

		for (int i : dizi) {
			System.out.print(i + " ");
		}

		// Sıralama işlemi

		for (int i = 0; i < boyut - 1; ++i) {
			for (int j = i + 1; j < boyut; ++j) {
				if (dizi[i] > dizi[j]) {
					temp = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = temp;
				}
			}
		}

		System.out.println("\nSıralanmış Dizi:");

		for (int i : dizi) {
			System.out.print(i + " ");
		}
	}

}
