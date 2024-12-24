public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();
        auto.setFabricante("Subaru");
        auto.setColor("Blanco");
        auto.setCilindrada(2.0);
        auto.setModelo("Impreza");


//        System.out.println("auto.fabricante = " + auto.fabricante);
//        System.out.println("auto = " + auto.modelo);
//        System.out.println("auto.color = " + auto.color);
//        System.out.println("auto.cilindrada = " + auto.cilindrada);

        System.out.println(auto.detalle());
        System.out.println(auto.acelarar(1250));
        System.out.println(auto.frenar());
        System.out.println(auto.acelerarFrenar(4000));
    }
}
