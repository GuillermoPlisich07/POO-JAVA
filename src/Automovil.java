public class Automovil {

    // Atributos de la clase
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque = 40;

    // Metodos para atributos, principio de ocultacion
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this.setFabricante(fabricante);
        this.setModelo(modelo);
        this.setColor(color);
        this.setCilindrada(cilindrada);
        this.setCapacidadTanque(capacidadTanque);
    }

    // Metodos principio de encapsulacion
    public String detalle(){
        StringBuilder sb = new StringBuilder();

        sb.append("auto.fabricante = " + this.getFabricante());
        sb.append("\nauto = " + this.getModelo());
        sb.append("\nauto.color = " + this.getColor());
        sb.append("\nauto.cilindrada = " + this.getCilindrada());

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
