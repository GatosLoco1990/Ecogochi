public class Mascota {
    private String nombre;
    private String imagen;
    private String nivelRiesgo;
    private String descripcion;

    private int salud;
    private int hambre;
    private int sueno;

    public Mascota(){
        salud = 100;
        hambre = 100;
        sueno = 100;
    }

    //Métodos set
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setHambre(int hambre) {
        this.hambre = hambre;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }
    public void setSueno(int sueno) {
        this.sueno = sueno;
    }
    //Métodos get
    public String getDescripcion() {
        return descripcion;
    }
    public String getImagen() {
        return imagen;
    }
    public String getNivelRiesgo() {
        return nivelRiesgo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getHambre() {
        return hambre;
    }
    public int getSalud() {
        return salud;
    }
    public int getSueno() {
        return sueno;
    }
    //Métodos
    public void visualizarMascota(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Imagen: "+getImagen());
        System.out.println("Nivel de riesgo: "+getNivelRiesgo());
        System.out.println("Descripcion: "+getDescripcion());
        System.out.println("Hambre: "+getHambre()+"%");
        System.out.println("Sueno: "+getSueno()+"%");
        System.out.println("Salud: "+getSalud()+"%");
    }
    public void cuidarMascota(int salud, int hambre, int sueno){
        
    }
    public void publicarMascota(){
        
    }
}
