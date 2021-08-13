package steps;

import net.thucydides.core.annotations.Step;
import pages.SaucePageObjects;

public class SauceSteps {
    SaucePageObjects saucePageObjects = new SaucePageObjects();
    @Step
    public void abrirNavegador () {
        saucePageObjects.open();
    }
    @Step
    public void accion(){
        saucePageObjects.getDriver().findElement(saucePageObjects.getTxtUserName()).sendKeys("standard_user");
        saucePageObjects.getDriver().findElement(saucePageObjects.getTxtContra()).sendKeys("secret_sauce");
        try {Thread.sleep(2000);}catch (Exception e){}
        saucePageObjects.getDriver().findElement(saucePageObjects.getBtnLogin()).click();
        saucePageObjects.getDriver().findElement(saucePageObjects.getBtnAddPr1()).click();
        saucePageObjects.getDriver().findElement(saucePageObjects.getBtnAddPr2()).click();
        try {Thread.sleep(2000);}catch (Exception e){}
        saucePageObjects.getDriver().findElement(saucePageObjects.getBtnCarrito()).click();
        try {Thread.sleep(2000);}catch (Exception e){}
        saucePageObjects.getDriver().findElement(saucePageObjects.getBtnCheckout()).click();
        saucePageObjects.getDriver().findElement(saucePageObjects.getTxtFName()).sendKeys("Mateo");
        saucePageObjects.getDriver().findElement(saucePageObjects.getTxtLName()).sendKeys("Moncada");
        saucePageObjects.getDriver().findElement(saucePageObjects.getTxtZipCode()).sendKeys("050001");
        try {Thread.sleep(2000);}catch (Exception e){}
        saucePageObjects.getDriver().findElement(saucePageObjects.getBtnContinue()).click();
        try {Thread.sleep(2000);}catch (Exception e){}
        saucePageObjects.getDriver().findElement(saucePageObjects.getBtnFinish()).click();
        try {Thread.sleep(2000);}catch (Exception e){}
    }
}
