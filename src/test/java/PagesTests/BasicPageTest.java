package PagesTests;

import Driver.WDriver;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import Pages.*;

public class BasicPageTest {

    SoftAssertions softAssertions = new SoftAssertions();

    WebDriver wDriver = WDriver.getDriver();

    HomePage HomePage = new HomePage();

    SearchResult SearchResult = new SearchResult();

    ProductPage ProductPage = new ProductPage();

    Modal Modal = new Modal();

    Basket Basket = new Basket();

    PaymentPage PaymentPage = new PaymentPage();
}
