package recapDemo_classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int toplama = dortIslem.Topla(5, 4);
		int cikarma = dortIslem.Cikar(5, 4);
		int carpma = dortIslem.Carp(3, 4);
		int bolme = dortIslem.Bol(4, 4);

		System.out.println(toplama);
		System.out.println(cikarma);
		System.out.println(carpma);
		System.out.println(bolme);

	}

}
