package proje;

public class forDongüsü {

	public static void main(String[] args) {
		// döngü bir programda birbirine benzer işlemleri tekrarlamaya yarar.

		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);

		}
		System.out.println(" For Döngüsü Bitti");
		int i = 1;
		/// while
		while (i < 10) {
			System.out.println(i);
			i++;

		}
		System.out.println(" while Döngüsü Bitti");

		// do while döngüsü
		int j = 100;
		do {
			System.out.println(j);  // do while döngüsün while dan farkı do fonksiyonu once geldiği için j yi 1 defa yazdırmasıdır
			j += 2;

		} while (j < 10);
		System.out.println(" do while Döngüsü Bitti");

	}

}
