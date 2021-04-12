import java.util.ArrayList;
import java.util.List;

public class Macowins {
    List <Venta> ventasDelDia = new ArrayList();

    public void registrarVenta(Venta venta) {
        ventasDelDia.add(venta);
    }

    public float gananciasDelDia() {
        return ventasDelDia.stream().map(unaVenta -> unaVenta.montoTotalVenta())
                .reduce(0f,(elementoA,elementoB) -> elementoA + elementoB);
    }
}
