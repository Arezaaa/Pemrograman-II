package Praktikum100;

import java.util.Scanner;

public class PRAK105_2210817210016_AhmadRezaAlfayiet {

	public static void main(String[] args) {
		
		final double PHI = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan jari-jari: ");
		double jari = input.nextDouble();
		System.out.println("Masukkan tinggi: ");
		double tinggi = input.nextDouble();
		
		double volume = PHI * (jari*jari) * tinggi;
		
		System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", jari, tinggi, volume);
	}
}