package bdd.web.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//h1[text()='Carrito']")
    private WebElement tituloCarrito;

    public Boolean obtengoTituloCarrito() {
        return tituloCarrito.isDisplayed();
    }
}
