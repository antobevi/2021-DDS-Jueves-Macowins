import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Venta {
    List<Prenda> prendasVendidas = new ArrayList();
    MetodoDePago metodoPago;
    Date fecha;

    public void agregarPrenda(Prenda prenda) {
        prendasVendidas.add(prenda);
    }

    public int cantidadPrendas() {
        return prendasVendidas.size();
    }

    public float montoTotalVenta() {
        return listaPrecios().stream()
                .reduce(0f,(elementoA,elementoB) -> elementoA + elementoB);
    }

    public List <Float> listaPrecios() {
        return prendasVendidas.stream().map(prenda -> this.precioFinalPrenda(prenda)).collect(Collectors.toList());
    }

    public Float precioFinalPrenda(Prenda prenda) {
        return metodoPago.recargo(prenda) + prenda.precioVenta(); // al precio de la prenda segun su estado se la suma el recargo si corresponde
    }
}