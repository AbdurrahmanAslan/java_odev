package proje;

public class proje {

	public static void main(String[] args) {
		System.out.println("Java öğreniyorum !"); // sys yazıp Left ctrl space yapıp sys ile başlayan kodları görebiliriz
		System.out.println("java ödevi yapıyorum!");
		int ogrencıSayım = 10;		
		System.out.println("öğrenci sayım"+ogrencıSayım);
		System.out.println("öğrenci sayım"+ogrencıSayım);// öğrenci sayım yazısını değiştirmek istediğimizde tek tek
		                                                //değiştirmemek için onu da string atayabiliriz
		// reusebility tekrar kullanılabilirlik
		String mesaj = "öğrenci sayısı : "; // string büyük S ile yazılır
		System.out.println( mesaj + ogrencıSayım);
		// ------------------------------------------ temel veri tipleri
		int sayi =12;
		//sayi ="ankara" olarak atayamayız çümkü string ifadedir 
		sayi =1311111111; // integer(tamSayi) veri tipleri byte<short<int<long herkes genelde int kullanır
		double sayim =10.56555; // float< double en çok double kullanılır ondalıklı sayı tutar
		char karakter = 'A' ;// tek karakter tutar tek kesme işareti kullanılır
		boolean doğrumu =true; // true yada false kullanılır
		// -------------------------------------------if blokları ile çalışmak	
		int sayı1 =20;
		if (sayı1<20) { // eğer 20 den küçükse ilk parantz gerçekleşir değilse  2.
			System.out.println("Sayı 20den küçüktür");
			
		}else {
			System.out.println("Sayı 20den küçük değildir");
			
		}
		//--------
		if (sayı1<20) { 
			System.out.println("Sayı 20den küçüktür");
			
		}else if (sayı1==20) {
			System.out.println("Sayı 20 ye eşittir");
			
		}else {
			
			System.out.println("sayı 20 den büyüktür");
		}
		
		
	}

}
