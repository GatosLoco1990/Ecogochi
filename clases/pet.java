package clases;

import perfiles.Personas;

public class pet {
    private int id;
    private String nombre;
    private String imagen;
    private String nivelRiesgo;
    private String descripcion;

    private int salud;
    private int hambre;
    private int sueno;

    public pet[] masco = new pet[100];

    public pet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public pet(int id, String nombre, String imagen, String nivelRiesgo, String descripcion, int salud, int hambre,
            int sueno) {
        this.setId(id);
        this.nombre = nombre;
        this.imagen = imagen;
        this.nivelRiesgo = nivelRiesgo;
        this.descripcion = descripcion;
        this.salud = salud;
        this.hambre = hambre;
        this.sueno = sueno;

    }

    // Métodos set
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

    // Métodos get
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

    // Métodos
    public void visualizarMascota() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Imagen: " + getImagen());
        System.out.println("Nivel de riesgo: " + getNivelRiesgo());
        System.out.println("Descripcion: " + getDescripcion());
        System.out.println("Hambre: " + getHambre() + "%");
        System.out.println("Sueno: " + getSueno() + "%");
        System.out.println("Salud: " + getSalud() + "%");
    }

    public void subirsalud(int salud) {
        this.salud += 5;
    }

    public void publicarMascota() {

    }

    public pet[] getMasco() {
        masco[0] = new pet(0, "Oso de anteojos (Tremarctos ornatus)", "img/pets/ante.png", "Vulnerable",
                "También es conocido como oso andino porque habita los bosques andinos\n localizados a más de 2.000 m.s.n.m. Es el único oso de Suramérica (Venezu\nela, Ecuador, Perú, Bolivia y Colombia) y en el país se estima una población\n cercana a los 8.000 individuos. Se alimenta en gran medida de frutas\n silvestres, rizomas, bulbos y bromelias, aunque también llega a consumir\n carcasas de animales muertos.",
                60, 60, 60);

        masco[1] = new pet(1, "Delfín rosado (Inia geoffrensis)", "img/pets/delfin.png", "En peligro",
                "El delfín gris (Sotalia fluviatilis) y el delfín rosado son las dos especies que habitan en la Amazonía y Orinoquía. Enfrentan amenazas como la pesca incidental, cacería, pérdida de hábitat, contaminación, cambio climático y perturbaciones acústicas.",
                70, 70, 70);

        masco[2] = new pet(0, "Tortugas carey (Eretmochelys imbricata)", "img/pets/perezoso.png", "En peligro crítico",
                "La contaminación, la utilización de su caparazón para la fabricación de artesanías, el consumo de huevos y la destrucción de su hábitat son sus mayores amenazas. Su presencia en los océanos es un indicador de la salud de los ecosistemas.",
                100, 100, 100);
        return masco;

    }
}
