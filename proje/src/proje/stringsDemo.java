package proje;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "bugün hava çok güzel.";
		System.out.println(mesaj);
		/*System.out.println("Eleman sayısı" + mesaj.length());

		System.out.println("5.eleman : " + mesaj.charAt(4));// 01234 yani 5 . elemanın ne olduğunu sorar
		System.out.println(mesaj.concat("Yaşasın!"));// mesajın sonuna yaşasını ekle
		System.out.println(mesaj.startsWith("b")); // b harfi ile başlıyormu
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);

		System.err.println(karakterler);
		
		System.out.println(mesaj.indexOf("av"));*/
		System.out.println(mesaj.replace(" ","-"));
	}

}
