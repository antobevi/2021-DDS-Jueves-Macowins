public class Tarjeta implements MetodoDePago {
    int cantCuotas;
    float coeficienteFijo;

    @Override
    public float recargo(Prenda prenda) {
        return this.valorSegunCuotas() + this.porcentajeValorPrenda(prenda);
    }

    public float valorSegunCuotas() {
        return cantCuotas * coeficienteFijo;
    }

    public float porcentajeValorPrenda(Prenda prenda) {
        return (float) (0.01 * prenda.precioVenta());
    }

}