public class Coche {

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    private int puertas;

    public Coche(){
        super();
    }

    public Coche(int puertas) {
        this.puertas = puertas;
    }

    public void addPuerta(int cantidad){
        this.puertas += cantidad;
    }

}
