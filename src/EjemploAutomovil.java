public class EjemploAutomovil {
    public static void main(String[] args) {

        Rueda[] ruedasSubaru = new Rueda[5];
        ruedasSubaru[0] = new Rueda("Yokohama", 16,7.5);
        ruedasSubaru[1] = new Rueda("Yokohama", 16,7.5);
        ruedasSubaru[2] = new Rueda("Yokohama", 16,7.5);
        ruedasSubaru[3] = new Rueda("Yokohama", 16,7.5);
        ruedasSubaru[4] = new Rueda("Yokohama", 16,7.5);
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Persona conductor = new Persona("Guillermo","Plisich");
        Estanque estanqueSubaru = new Estanque();
        Automovil subaru = new Automovil("Subaru","Impreza",Color.BLANCO);
        subaru.setMotor(motorSubaru);
        subaru.setConductor(conductor);
        subaru.setEstanque(estanqueSubaru);
        subaru.setRuedas(ruedasSubaru);
        subaru.setTipoAutomovil(TipoAutomovil.SEDAN);



//        System.out.println("auto.fabricante = " + auto.fabricante);
//        System.out.println("auto = " + auto.modelo);
//        System.out.println("auto.color = " + auto.color);
//        System.out.println("auto.cilindrada = " + auto.cilindrada);

//        System.out.println(auto.acelarar(1250));
//        System.out.println(auto.frenar());
//        System.out.println(auto.acelerarFrenar(4000));

        System.out.println(subaru.detalle());
        TipoAutomovil tipoSubaru = subaru.getTipoAutomovil();

        System.out.println("Tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("Tipo desc. subaru: " + tipoSubaru.getDescripcion());


        switch(tipoSubaru){
            case CONVERTIBLE ->
                System.out.println("El automovil es deportivo y descapotable de dos puertas ");
            case COUPE ->
                System.out.println("El automovil es pequenio de dos puertas y tipicamente deportivo ");
            case FURGON ->
                System.out.println("El automovil es utilitario de transporte, de empresas ");
            case HATCHBACK ->
                System.out.println("El automovil mediano compacto, aspecto deportivo ");
            case PICKUP ->
                System.out.println("El automovil es doble cabina o camioneta ");
            case SEDAN ->
                System.out.println("Es un automovil mediano ");
            case STATION_WAGON ->
                System.out.println("Es un automovil mas grande, con maleta grande ");
        }

    }
}
