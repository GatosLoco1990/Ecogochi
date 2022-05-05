package clases;

import perfiles.Personas;

public class tasks {
    private String descripcion;
    private int cantidadPuntos;
    private boolean completado;

    public tasks(String descripcion, int cantidadPuntos) {
        this.setDescripcion(descripcion);
        this.setCantidadPuntos(cantidadPuntos);
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public int getCantidadPuntos() {
        return cantidadPuntos;
    }

    public void setCantidadPuntos(int cantidadPuntos) {
        this.cantidadPuntos = cantidadPuntos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void sumarPuntos(Personas[] usuario) {
        usuario[0].setPuntos(usuario[0].getPuntos() + getCantidadPuntos());
    }

    public void aumentarImpacto() {

    }

    public void tiempoRealizacion() {

    }

    public void completarTarea() {

    }
}
