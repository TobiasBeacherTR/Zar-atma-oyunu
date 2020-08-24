package zar;

import java.util.Random;
import java.util.Scanner;

public class zar {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner=new Scanner(System.in);
		
		int i=0;
		int fark;
		System.out.print("Kaç liralýk oynuyosunuz ? :");
		int tl=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Ýlk oyuncunun bakiyesini giriniz : ");
		int o1=scanner.nextInt();
		scanner.nextLine();
		System.out.print("2.oyuncunun bakiyesini giriniz : ");
		int o2=scanner.nextInt();
		scanner.nextLine();
		
		
			while(o1>0 && o2>0) {
				i++;
				Thread.sleep(2000);
				System.out.println("Þu anda " + i + ". turdayýz.");
				Thread.sleep(2000);
				Random random=new Random();
				int r1=random.nextInt(6)+1;
				int r2=random.nextInt(6)+1;
				System.out.println("1.oyuncu : " + r1);
				Thread.sleep(2000);
				System.out.println("2.oyuncu : " + r2);
				Thread.sleep(2000);
				System.out.println("Durmak için s tuþuna basýnýz.");
				String stop=scanner.nextLine();
				
			   if(r1>r2) {
					o1=o1+tl;
					o2=o2-tl;
					System.out.println("1.oyuncu : " + o1 + " tl.");
					System.out.println("2.oyuncu : " + o2 + " tl. ");
					if(stop.equals("s")) {
						System.out.println("Oyun duruyor.....");
						return;
					}
					Thread.sleep(5000);
					
				}
				else if(r1<r2) {
					o1=o1-tl;
					o2=o2+tl;
					System.out.println("1.oyuncu bakiye : " + o1 + " tl.");
					System.out.println("2.oyuncu bakiye : " + o2 + " tl. ");
					if(stop.equals("s")) {
						System.out.println("Oyun duruyor.....");
						return;
					}
					Thread.sleep(5000);
					
				}
				else {
					System.out.println("Zarlar eþit.Tekrar atalým.");
					if(stop.equals("s")) {
						System.out.println("Oyun duruyor.....");
						return;
					}
					Thread.sleep(5000);
					
				}
				
	            
	        }
	        if(o1<=0){
	            System.out.println("2.oyuncu "+i+" .turda oyunu kazandý.");    
	        }
	        else {
	            System.out.println("1.oyuncu "+i+" .turda oyunu kazandý.");
	        }
			
		}
		
	}

