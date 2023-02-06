package day12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_FileUpload extends TestBase {

    //Tests packagenin altina bir class oluşturun : C05_UploadFile
    //https://the-internet.herokuapp.com/upload adresine gidelim
    //chooseFile butonuna basalim
    //Yuklemek istediginiz dosyayi secelim.
    //Upload butonuna basalim.
    //"File Uploaded!" textinin goruntulendigini test edelim.

    @Test
    public void fileUploadTest(){

        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFileButton = driver.findElement(By.id("file-upload"));

        String dosyaYolu = System.getProperty("user.home")+"\\OneDrive\\Masaüstü\\logo.jpeg";

        // chooseFileButton una yuklemek istedigim dosyanin path ini gondererek dosyayi secdim
        chooseFileButton.sendKeys(dosyaYolu);

        driver.findElement(By.id("file-submit")).click();

        String uploadedYazisi = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("File Uploaded!",uploadedYazisi);
    }
}