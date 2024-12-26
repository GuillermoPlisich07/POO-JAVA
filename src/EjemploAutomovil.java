public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru","Impreza",Color.BLANCO,2.0);
        subaru.setTipoAutomovil(TipoAutomovil.SEDAN);



//        System.out.println("auto.fabricante = " + auto.fabricante);
//        System.out.println("auto = " + auto.modelo);
//        System.out.println("auto.color = " + auto.color);
//        System.out.println("auto.cilindrada = " + auto.cilindrada);

        System.out.println(subaru.detalle());
//        System.out.println(auto.acelarar(1250));
//        System.out.println(auto.frenar());
//        System.out.println(auto.acelerarFrenar(4000));

        TipoAutomovil tipoSubaru = subaru.getTipoAutomovil();

        System.out.println(" Tipo subaru: " + tipoSubaru.getNombre());
        System.out.println(" Tipo desc. subaru: " + tipoSubaru.getDescripcion());


        switch(tipoSubaru){
            case
        }

    }
}
