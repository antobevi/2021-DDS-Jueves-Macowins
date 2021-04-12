public class Prenda {
    String tipo;
    Estado estado;
    float precioPropio;

    public float precioPropio() {
        return precioPropio;
    }

    public float precioVenta() {
        return precioPropio - estado.precio(precioPropio);
    }
}