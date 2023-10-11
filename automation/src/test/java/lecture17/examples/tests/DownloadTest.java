package lecture17.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

public class DownloadTest extends BaseTest {

    @Test
    public void downloadTest() throws InterruptedException {
        driver.get("https://demoqa.com/upload-download");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        wait.until(ExpectedConditions.elementToBeClickable(downloadButton));
        downloadButton.click();
        String name = "sampleFile.jpeg";
        File file = new File(DOWNLOADS_DIR.concat(name));
        Assert.assertTrue(waitFileDownloaded(file, 30));
    }

    public Boolean waitFileDownloaded(File file, int timeoutSec) throws InterruptedException {
        for (int i = 1; i <= timeoutSec; i++) {
            if (file.exists()) {
                return true;
            } else {
                Thread.sleep(1000);
            }
        }
        return false;
    }

}
