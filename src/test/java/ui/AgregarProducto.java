package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class AgregarProducto {
    public static Target producto = Target.the("Producto Sauce Labs Backpack")
            .locatedBy("//android.widget.TextView[ @text=\"Sauce Labs Backpack\"]");
    public static Target btseleccionar= Target.the("Boton añadir al carrito")
            .located(AppiumBy.accessibilityId("Add To Cart button"));
    public static Target btCarrito = Target.the("Boton home page carrito de compras")
            .locatedBy("//android.view.ViewGroup[@content-desc=\"cart badge\"]");


}
//@content-desc="store item text" and