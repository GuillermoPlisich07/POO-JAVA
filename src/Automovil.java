public class Automovil {

    // Atributos de la clase
    String fabricante;
    String modelo;
    String color;
    double cilindrada;
    int capacidadTanque = 40;

    // Metodos

    public String detalle(){
        StringBuilder sb = new StringBuilder();

        sb.append("auto.fabricante = " + this.fabricante);
        sb.append("\nauto = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindrada = " + this.cilindrada);

        return sb.toString();
    }

    public String acelarar(int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelarar = this.acelarar(rpm);
        String frenar = this.frenar();
        return acelarar + " " + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(this.capacidadTanque*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(this.capacidadTanque*(porcentajeBencina/100f));
    }
}
