package proje;

public class arrayDEmo {

	public static void main(String[] args) {
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "engin";
		ogrenciler[1] = "derin";
		ogrenciler[2] = "pelin";
		ogrenciler[3] = "ahmet";
		//ogrenciler[4] = "mehmet";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("_------------------------------");
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
		
		
		
		

	}

} 
