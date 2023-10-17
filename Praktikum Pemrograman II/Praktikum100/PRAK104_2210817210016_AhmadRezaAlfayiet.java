package Praktikum100;

import java.util.Scanner;

public class PRAK104_2210817210016_AhmadRezaAlfayiet {

	public static void main(String[] args) {
		
		int input1 = 0, input2 = 0, skor1=0, skor2=0;
		String [] pilihan1 = new String[3];
		String [] pilihan2 = new String[3];
		
		Scanner input = new Scanner (System.in);
		System.out.println("Tangan Abu: ");
		while(input1<3) {
			pilihan1[input1]=input.next();
			input1++;
		}
		
		System.out.println("Tangan Bagas: ");
		while(input2<3) {
			pilihan2[input2]=input.next();
			input2++;
		}
		
		for(int i=0; i<3; i++) {
			if (pilihan1[i].equals(pilihan2[i])) {
				skor1++;
				skor2++;
			} 
			else if (pilihan1[i].equals("B")) {
				if (pilihan2[i].equals("G")) {
					skor1++;
				}
				else if(pilihan2[i].equals("K")) {
					skor2++;
				}
			}
			else if (pilihan1[i].equals("G")) {
				if (pilihan2[i].equals("K")) {
					skor1++;
				}
				else if(pilihan2[i].equals("B")) {
					skor2++;
				}
			}
			else if (pilihan1[i].equals("K")) {
				if (pilihan2[i].equals("B")) {
					skor1++;
				}
				else if(pilihan2[i].equals("G")) {
					skor2++;
				}
			}
		}
		
		if (skor1>skor2) {
			System.out.println("Abu");
		}
		else if (skor2>skor1) {
			System.out.println("Bagas");
		}
		else {
			System.out.println("Seri");
		}
	}
}