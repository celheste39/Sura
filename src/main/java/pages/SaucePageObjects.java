package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class SaucePageObjects extends PageObject {

    private By txtUserName = By.xpath("//input[@id='user-name']");
    private By txtContra = By.xpath("//input[@id='password']");
    private By btnLogin = By.xpath("//input[@id='login-button']");
    private By btnAddPr1 = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
    private By btnAddPr2 = By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']");
    private By btnCarrito = By.xpath("//a[@class='shopping_cart_link']");
    private By btnCheckout = By.xpath("//button[@id='checkout']");
    private By txtFName = By.xpath("//input[@id='first-name']");
    private By txtLName = By.xpath("//input[@id='last-name']");
    private By txtZipCode = By.xpath("//input[@id='postal-code']");
    private By btnContinue = By.xpath("//input[@id='continue']");
    private By btnFinish = By.xpath("//button[@id='finish']");
    private By lblFinal = By.xpath("//div[@class='complete-text']");

    public By getTxtUserName() {
        return txtUserName;
    }
    public By getTxtContra() {
        return txtContra;
    }
    public By getBtnLogin() {
        return btnLogin;
    }
    public By getBtnAddPr1() {
        return btnAddPr1;
    }
    public By getBtnAddPr2() {
        return btnAddPr2;
    }
    public By getBtnCarrito() {
        return btnCarrito;
    }
    public By getBtnCheckout() {
        return btnCheckout;
    }
    public By getTxtFName() {
        return txtFName;
    }
    public By getTxtLName() {
        return txtLName;
    }
    public By getTxtZipCode() {
        return txtZipCode;
    }
    public By getBtnContinue() {
        return btnContinue;
    }
    public By getBtnFinish() {
        return btnFinish;
    }
    public By getLblFinal() {
        return lblFinal;
    }
}
