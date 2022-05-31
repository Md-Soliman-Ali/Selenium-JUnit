import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHover extends DriverSetup {

    @Test
    public void mouseHover() throws InterruptedException {
        driver.get("https://green.edu.bd/");
        WebElement mainMenu = driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='About Us']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).perform();
        Thread.sleep(3000);

        WebElement subMenu = driver.findElement(By.xpath("(//a[normalize-space()='Vision & Mission'])[2]"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        Thread.sleep(3000);
    }
}
