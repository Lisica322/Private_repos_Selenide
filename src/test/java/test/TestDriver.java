package test;


import Pages.*;
import org.junit.jupiter.api.Test;

public class TestDriver extends BaseTest {

    @Test
    public void theSteamTesting() {
        NavigatorSteam navigatorSteam = new NavigatorSteam();
        CategorySteamPage categorySteamPage = new CategorySteamPage();
        Action action = new Action();

        GamePage gamePage = new GamePage();
        navigatorSteam.checkStoreArea();
        navigatorSteam.clickCategories();
        categorySteamPage.waitUntilPageMenuVisible();


        action.containsAction();
        gamePage.clickFirstPageMenu();
        gamePage.clickFirstGamePage();
        gamePage.containsAction();
    }


}
