package com.bilgeadam.lesson029.okulApp;

/*
 * ogrenci sınıfımızda
 * isim notort durumu==> (geçti veya kaldı),dogumtarihi 
 * ögretmen sınımıfımız olsun==>
 * bir ismi olsun birde notlarını okudugu ogrencileri tutsun 
 * 
 * Fİle manager
 * 1- dosyadan verileri okuyalaım  ve bize bir ogrenci listesi donsun 
 * ---> gelen her degerden bir ogrenci yaratıp listeye ekleyecegiz 
 * -->en sonunda da listeyi geri doncegiz 
 * 
 *2-ogretmen dosyası olustur ==> ogretmen ismi ile bir dosya olusturp gelen 
 *listeyi bu dosyaya yazdıralım
 * 
 * 
 */
public class Uygulama {

	public static void main(String[] args) {

		Ogretmen ogretmen = new Ogretmen("Berkin");
		ogretmen.notlariOku();
		// ogretmen.getOgrenciler().forEach(System.out::println);
		ogretmen.dosyaOlustur();

		// dosyadanVeriOku("Mustafa").forEach(System.out::println);

	}

}
