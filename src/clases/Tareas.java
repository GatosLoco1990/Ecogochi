package clases;

import perfiles.Personas;

public class Tareas {
    private String descripcion;
    private int cantidadPuntos;
    private boolean completado;

    public Tareas(String descripcion, int cantidadPuntos) {
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

    }

    public void aumentarImpacto() {

    }

    public void tiempoRealizacion() {

    }

    public void completarTarea() {

    }
}
