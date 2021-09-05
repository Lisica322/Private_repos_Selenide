package test;

import com.codeborne.selenide.Selenide;
import consts.SteamsURL;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void setUp() {
        Selenide.open(SteamsURL.BASE_URL.getBaseUrl());
    }

    @AfterEach
    public void tearDown() {
       Selenide.closeWebDriver();
    }
}
