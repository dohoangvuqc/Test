import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Test001 {

    static WebDriver driver;
    static List<String> chnResult = new ArrayList<String>();
    @Test(enabled = true)
    public static void test(){
        chnResult.clear();
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.get("http://gamek.vn/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Tổng số link là: " + links.size());
        for (int i = 0; i < links.size(); i++) {
            String chnLink = links.get(i).getAttribute("href");
            if(chnLink.contains(".chn")){
                System.out.println(chnLink);
                chnResult.add("OK" + i);
            }
        }
        driver.quit();
        System.out.println("So luong link có chứa từ khóa chn là: " + chnResult.size());


    }

    @Test(enabled = false)
    public static void test1(){

        System.out.println(chnResult.size());
    }

}
