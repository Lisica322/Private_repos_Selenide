package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

public class GamePage {
    private ElementsCollection firstPage = $$("//*[@class = 'carousel_thumbs']");
    private ElementsCollection firstPrice = $$("//div[@class='discount_block  no_discount']/*/*");
    private ElementsCollection firstGame = $$("//div[@class='main']//div[@class='bg']");
    private SelenideElement firstGamePrice = $x("//div[@class='game_purchase_action']//div[@class='game_purchase_price price']");

    public void clickFirstPageMenu() {
        WebElement firstGamePageElementPrice =
                firstPage
                        .stream()
                        .findFirst()
                        .orElseThrow(() -> new AssertionError("Пустой список игр"));
        firstGamePageElementPrice.click();
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
