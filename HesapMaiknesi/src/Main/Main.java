package Main;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		int select;
		
		Scanner ınp=new Scanner(System.in);
		System.out.println("Lütfen Bir Sayı Giriniz: ");
		a=ınp.nextDouble();
		System.out.println("Lütfen Bir Sayı Giriniz: ");
		b=ınp.nextDouble();
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		select=ınp.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("Toplam: "+(a+b));
			break;
		case 2:
			System.out.println("Sonuc: "+(a-b));
			break;
			
		case 3:
			System.out.println("Çarpım: "+(a*b));
			break;
		case 4:
			
			if(b!=0) {
				System.out.println("sonuc: "+(a/b));
				
			}else {
				System.out.println("Bir sayı sıfıra bölünemez!!");
			}
			break;
			
		default:
			System.out.println("Hatalı Giriş!");
			

		}
		
		

	}

}
