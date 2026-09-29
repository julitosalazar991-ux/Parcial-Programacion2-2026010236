public class Main {
    public static void main(String[] args) {
        Empleado e = new Vendedor("Julio César", 5000);
           e.cambiarEstrategia(new ComisionEstandar()); // comision por defecto
        e.mostrarDetalle();
    }
}
