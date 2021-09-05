package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NavigatorSteam {
    private SelenideElement genreTab = $("#genre_tab");
    private SelenideElement storeArea = $x("//*[@class = 'popup_menu_subheader popup_genre_expand_header responsive_hidden'][@data-genre-group = 'action']//*");

    public void checkStoreArea() {
       genreTab.click();

    }

    public void clickCategories() {

        storeArea.click();
    }

}
