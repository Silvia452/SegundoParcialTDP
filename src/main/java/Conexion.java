public class Conexion {
    private Puerto puertoA;
    private Puerto puertoB;
    private int distancia;

    public Conexion(Puerto puertoA, Puerto puertoB, int distancia) {
        this.puertoA = puertoA;
        this.puertoB = puertoB;
        this.distancia = distancia;
    }

    public Puerto getPuertoA() {
        return puertoA;
    }

    public Puerto getPuertoB() {
        return puertoB;
    }

    public int getDistancia() {
        return distancia;
    }
}

