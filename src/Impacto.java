public class Impacto {
    private int aguaAhorrada;
    private int energiaAhorrada;

    public Impacto() {
        aguaAhorrada = 0;
        energiaAhorrada = 0;
    }

    public void setAguaAhorrada(int aguaAhorrada) {
        this.aguaAhorrada += aguaAhorrada;
    }

    public void setEnergiaAhorrada(int energiaAhorrada) {
        this.energiaAhorrada += energiaAhorrada;
    }

    public int getAguaAhorrada() {
        return aguaAhorrada;
    }

    public int getEnergiaAhorrada() {
        return energiaAhorrada;
    }

    public void generarEstadisticas() {
        System.out.print("Agua ahorrada: ");
        System.out.println(getAguaAhorrada() + " litros");
        System.out.print("Energía ahorrada: ");
        System.out.println(getEnergiaAhorrada() + " kWs");
    }
}
