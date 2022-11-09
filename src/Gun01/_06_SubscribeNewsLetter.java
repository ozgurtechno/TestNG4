package Gun01;

/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)
 */

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _06_SubscribeNewsLetter extends BaseDriver {

    @Test
    void subscribeFunctionYes()
    {
        WebElement newsLetterLink=driver.findElement(By.linkText("Newsletter"));
        newsLetterLink.click();

        WebElement subscribeYes=driver.findElement(By.cssSelector("[type='radio'][value='1']"));
        subscribeYes.click();

        WebElement continueButton=driver.findElement(By.cssSelector("[value='Continue']"));
        continueButton.click();

        WebElement msgLabel=driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible'"));
        Assert.assertTrue(msgLabel.getText().toLowerCase().contains("success"));
    }

}
