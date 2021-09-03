package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CategorySteamPage {
private SelenideElement pageMenu = $x("//*[@class = 'popup_body popup_menu_twocol_new']");


    public void waitUntilPageMenuVisible() {
pageMenu.shouldBe(Condition.visible);
    }
}
