import javax.lang.model.SourceVersion;

public class Automovil {

    // Atributos de la clase
    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipoAutomovil;

    private static Color colorPatente = Color.BLANCO;
    private static int ultimoId;

    // Constructores
    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante,modelo,color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante,modelo,color, motor);
        this.estanque=estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante,modelo,color, motor);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    // Metodos para atributos, principio de ocultacion
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    // Metodos principio de encapsulacion
    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto.id = " + this.getId());
        sb.append("\nauto.fabricante = " + this.getFabricante());
        sb.append("\nauto.tipo = " + this.getTipoAutomovil().getNombre());
        sb.append("\nauto = " + this.getModelo());
        sb.append("\nauto.color = " + this.getColor());
        sb.append("\nauto.motor  = " + this.motor.getCilindrada());
        sb.append("\nauto.estanque  = " + this.estanque.getCapacidad());
        sb.append("\nauto.conductor  = " + this.conductor.toString());
        sb.append("\nRuedas: ");
        for (Rueda r: ruedas){
            sb.append("\n"+r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho());
        }

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
        return km/(this.estanque.getCapacidad()*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(this.estanque.getCapacidad()*(porcentajeBencina/100f));
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)) {
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null && (this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo())));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + this.motor.getCilindrada() +
                ", capacidadTanque=" + this.estanque.getCapacidad() +
                '}';
    }
}


