@run

  Feature: E bebek alış veriş işlemi

    Background:
      Given Testi başlat


      Scenario: E bebek alış veriş işleminin yapılması

        When Kategoriler butonuna tıklanır.
        And Bez & Mendil kategorisi seçilir.
        And Bebek Bezi alt kategorisi seçilir.
        And Filtrele butonuna tıklanır.
        And Fiyat Aralığı filtresine tıklanır.
        And Fiyat aralığı 50-100 TL seçilir.
        And Uygula butonuna tıklanır.
        And Ürünleri Gör butonuna tıklanır.
        And Sırala butonuna tıklanır.
        And Çok Değerlendirilenler seçeneği seçilir.
        And Listelenen ilk üründe Sepete Ekle butonuna tıklanır.
        And Açılan Pop-up'ta Sepete Ekle butonuna tıklanır.
        And Sepetim butonuna tıklanır.
        And Artı butonuna tıklanır.
        And Ürün fiyatı kontrol edilir ve yazdırılır.
        And Alış Verişi Tamamla butonuna tıklanır.
        Then Üye Girişi sayfasının açıldığı görülür.





#      2.	Kategorilerden herhangi bir kategori ve alt kategori seçilir.
#      3.	Filtrelerden “Fiyat Aralığı” “50-100 TL” seçilir.
#      4.	Sıralamadan “Çok Değerlendirilenler” seçilip ilk ürün sepete eklenir.
#      5.	Sepet gidilip ürün arttırıp fiyat kontrolü yapılır.
#      6.	“Alışverişi Tamamla” butonuna basılır.



