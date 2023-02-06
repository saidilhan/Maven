package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Actions2 extends TestBase {
    /*
    MANUAL:
    Amazon home sayfasına git
    Account & List üzerinde bekle- mouse over/hover over
    Açılan pencerede Accout Linkine tıkla
    Açılan sayfanın title'ının Your Account olduğunu doğrula
     */
    @Test
    public void hoverOverTest(){
        //Amazon home sayfasına git
        driver.get("https://www.amazon.com");
        //Account & List üzerinde bekle- mouse over/hover over
        //1.Adım --Actions Classında obje
        Actions actions=new Actions(driver);
        //2.Adım Elementi Locate et
        WebElement accountList= driver.findElement(By.id("nav-link-accountList"));
        //3.Adım moveToElement() kullan
        actions.moveToElement(accountList).perform();
        //Account'a Tıkla
        driver.findElement(By.linkText("Account")).click();
        //Açılan sayfanın title'ının Your Account olduğunu doğrula
        Assert.assertTrue(driver.getTitle().contains("Your Account"));
    }
}