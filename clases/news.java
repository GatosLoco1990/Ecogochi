package clases;

public class news {

    public news[] nw = new news[100];

    private String autor;
    private String titulo;
    private String descripcion;
    private String imagen;
    private String fecha;
    private String fuente;

    public news() {
    }

    public news(String autor, String titulo, String descripcion, String imagen, String fecha, String fuente) {
        this.autor = autor;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.fecha = fecha;
        this.fuente = fuente;
    }

    public String getAutor() {
        return autor;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public news[] getnw() {
        nw[0] = new news("Pedro sanchez", "Comunidad ecoamigable",
                "Todas las personas estamos interconectadas y dependemos las unas\n de las otras. Todas y todas sumamos. Todos los\n gestos suman. Todo suma, también en la defensa de nuestro\n patrimonio más ancestral: el medio \nambiente",
                "img", "10/02/2021", "f");
        nw[1] = new news();
        nw[2] = new news();
        return nw;
    }

}
