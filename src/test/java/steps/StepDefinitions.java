package steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.regex.Pattern;

public class StepDefinitions {

    public AndroidDriver driver;
    public WebDriverWait wait;

    //Elements

    By kategoriButtonBy = By.xpath("//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.ImageView");

    By kategoriBy = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout");

    By altKategoriBy = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout");

    By filterButtonBy = By.id("com.solidict.ebebek:id/linearLayout_ProductFilter");

    By priceRangeButtonBy = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout");

    By priceRangeCheckBy = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout");

    By applyButtonBy = By.id("com.solidict.ebebek:id/btApplyFilter");

    By seeProductsButtonBy = By.id("com.solidict.ebebek:id/btApplyFilter");

    By sortButtonBy = By.id("com.solidict.ebebek:id/linearLayout_ProductSorting");

    By highlyRevieweCheckdBy = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout");

    By addToChartBy = By.xpath("//android.widget.Button[@resource-id='com.solidict.ebebek:id/btAddToCart_'][1]");

    By addToChartMainBy = By.id("com.solidict.ebebek:id/textView_ButtonAddToCart");

    By myChartBy = By.id("com.solidict.ebebek:id/navMyCarts");

    By plusButtonBy = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView");

    By priceTextBy = By.id("com.solidict.ebebek:id/textView_CartProduct_Price");

    By completedButtonBy = By.id("com.solidict.ebebek:id/tvCompleteOrder");

    By uyeTextBy = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView");

    String price;

    @Before

    public void setup () {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 4 API 34");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "14.0");
        caps.setCapability("skipUnlock", "true");
        caps.setCapability("appPackage", "com.solidict.ebebek");
        caps.setCapability("appActivity", "com.ebebek.android.view.MainActivity");
        caps.setCapability("noReset", "false");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(30L));

    }

    @Given("Testi başlat")
    public void baslat (){
        setup();
    }

    @When("Kategoriler butonuna tıklanır.")
    public void kategoriButtonClick() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(kategoriButtonBy)).click();
    }

    @And("Bez & Mendil kategorisi seçilir.")
    public void kategoriClick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(kategoriBy)).click();
    }

    @And("Bebek Bezi alt kategorisi seçilir.")
    public void altKategoriClick() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(altKategoriBy)).click();
    }

    @And("Filtrele butonuna tıklanır.")
    public void filtreleButonunaTıklanır() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(filterButtonBy)).click();
    }

    @And("Fiyat Aralığı filtresine tıklanır.")
    public void fiyatAralıgıFiltresineTıklanır() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(priceRangeButtonBy)).click();
    }

    @And("Fiyat aralığı 50-100 TL seçilir.")
    public void fiyatAralıgıSecilir() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(priceRangeCheckBy)).click();
    }

    @And("Uygula butonuna tıklanır.")
    public void uygulaButonunaTıklanır() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(applyButtonBy)).click();
    }

    @And("Ürünleri Gör butonuna tıklanır.")
    public void urunleriGorButonunaTıklanır() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(seeProductsButtonBy)).click();
    }

    @And("Sırala butonuna tıklanır.")
    public void sıralaButonunaTıklanır() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortButtonBy)).click();
    }

    @And("Çok Değerlendirilenler seçeneği seçilir.")
    public void cokDegerlendirilenlerSecenegiSecilir() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(highlyRevieweCheckdBy)).click();
    }

    @And("Listelenen ilk üründe Sepete Ekle butonuna tıklanır.")
    public void sepeteEkle() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToChartBy)).click();
    }

    @And("Açılan Pop-up'ta Sepete Ekle butonuna tıklanır.")
    public void sepeteEkleButonunaTıklanır() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToChartMainBy)).click();
    }

    @And("Sepetim butonuna tıklanır.")
    public void sepetimButonunaTıklanır() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(myChartBy)).click();
    }

    @And("Artı butonuna tıklanır.")
    public void artıButonunaTıklanır() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(plusButtonBy)).click();
    }


    @And("Ürün fiyatı kontrol edilir ve yazdırılır.")
    public void urunFiyatıKontrol() {
        price = wait.until(ExpectedConditions.visibilityOfElementLocated(priceTextBy)).getText();
        System.out.println("Ürün Fiyatı=" + price);
    }

    @And("Alış Verişi Tamamla butonuna tıklanır.")
    public void alısVerisiTamamlaButonunaTıklanır() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(completedButtonBy)).click();
    }

    @Then("Üye Girişi sayfasının açıldığı görülür.")
    public void uyeGiris() {

        ExpectedConditions.textMatches(uyeTextBy, Pattern.compile("Üye Girişi"));
    }

    @After
    public void teardown() {
        driver.quit();
    }



}
