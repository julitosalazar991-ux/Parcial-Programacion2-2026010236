public class Main {
    public static void main(String[] args) {
        Empleado e = new Vendedor("Julio César", 5000);
 feature/comision-personalizada
        e.cambiarEstrategia(new ComisionPersonalizada());

           e.cambiarEstrategia(new ComisionEstandar()); // comision por defecto
 main
        e.mostrarDetalle();
    }
}
