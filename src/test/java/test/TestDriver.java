package test;


import Pages.*;
import org.junit.jupiter.api.Test;

public class TestDriver extends BaseTest {

    @Test
    public void theSteamTesting() {
        NavigatorSteam navigatorSteam = new NavigatorSteam();
        CategorySteamPage categorySteamPage = new CategorySteamPage();
        Action action = new Action();

        FirstGame firstGame = new FirstGame();
        navigatorSteam.checkStoreArea();
        navigatorSteam.clickCategories();
        categorySteamPage.waitUntilPageMenuVisible();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        action.containsAction();
        firstGame.clickFirstPageMenu();
        firstGame.clickFirstGamePage();
        firstGame.containsAction();
    }


}
