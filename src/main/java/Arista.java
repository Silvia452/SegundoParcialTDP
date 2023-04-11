public class Arista {
    private Puerto origen;
    private Puerto destino;
    private double distancia;

    public Arista(Puerto origen, Puerto destino, double distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }

    // getters y setters


    public Puerto getOrigen() {
        return origen;
    }

    public void setOrigen(Puerto origen) {
        this.origen = origen;
    }

    public Puerto getDestino() {
        return destino;
    }

    public void setDestino(Puerto destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Arista{" +
                "origen=" + origen +
                ", destino=" + destino +
                ", distancia=" + distancia +
                '}';
    }
}
