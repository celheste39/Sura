package stepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import pages.SaucePageObjects;
import steps.SauceSteps;

public class SauceStepDefinition {
    SaucePageObjects drive;
    @Steps
    SauceSteps pasos;
    @Dado("^que me encuentro en la pagina web https://www\\.saucedemo\\.com/$")
    public void queMeEncuentroEnLaPaginaWebHttpsWwwSaucedemoCom() {
        pasos.abrirNavegador();
    }
    @Cuando("^agrego productos al carrito$")
    public void agregoProductosAlCarrito() {
        pasos.accion();
    }
    @Entonces("^confirmo la compra de mis productos\\.$")
    public void confirmoLaCompraDeMisProductos() {
        drive.getDriver().quit();
    }
}
