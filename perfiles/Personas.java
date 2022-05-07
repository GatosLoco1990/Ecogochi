package perfiles;

public class Personas {
    private boolean estado;
    private String nombre;
    private String contrasena;
    private String correo;
    private int meta;
    private int puntos;
    private int i;

    public Personas[] persona = new Personas[100];

    public Personas() {

    }

    public Personas(String nombre, String contra, String correo, int i) {
        setEstado(true);
        setNombre(nombre);
        setContrasena(contra);
        setCorreo(correo);
        setMeta(0);
        setPuntos(10);
        setI(i);

    }

    public void Registrar() {

    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public int getI() {
        return i;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void desbloquearMascotas() {

    }

    public Personas[] getPersonas() {
        persona[0] = new Personas("Ricardo", "tuki", "ricardogandica@hotmail.com", 0);
        persona[1] = new Personas("Jose", "retuki", "correo", 1);

        return persona;
    }

}