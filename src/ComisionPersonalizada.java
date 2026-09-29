public class ComisionPersonalizada implements EstrategiaComision {
    private static final String PRIMER_NOMBRE = "Julio";

    @Override
    public double calcularComision(double montoVenta) {
        int n = PRIMER_NOMBRE.length();      // 5 letras
        double porcentaje = (5 + n) / 100.0; // 10%
        return montoVenta * porcentaje;
    }
}
