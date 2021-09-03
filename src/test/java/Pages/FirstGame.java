package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class FirstGame {
    private SelenideElement firstPage = $x("//*[@id='genre_large_cluster']/div[2]/div[1]");
    private ElementsCollection firstPrice = $$("//div[@class='discount_block  no_discount']/*/*");
    private ElementsCollection firstGame = $$("//div[@class='main']//div[@class='bg']");
    private SelenideElement firstGamePrice = $x("//div[@class='game_purchase_action']//div[@class='game_purchase_price price']");

    public void clickFirstPageMenu() {
        firstPage.click();
    }

    public void clickFirstGamePage() {
        WebElement firstGamePageMenuElementPrice =
                firstGame
                        .stream()
                        .findFirst()
                        .orElseThrow(() -> new AssertionError("Пустой список игр"));

        firstGamePageMenuElementPrice.click();
    }

    public String containsGameFirst() {
        return firstGamePrice.getText();
    }

    public void containsAction() {

        WebElement finalePrice = null;
        for (int i = 0; i < firstPrice.size(); i++) {
            finalePrice = firstPrice.get(0);
        }

        assert finalePrice != null;
        String actualPageHeaderText = finalePrice.getText();

        Assertions.assertEquals(containsGameFirst(), actualPageHeaderText.trim(), "Не совпадает цена в разделе с ценой на старнице игры!");
    }




}
