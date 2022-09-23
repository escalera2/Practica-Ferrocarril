public class Locomotor {
    int codigo;
    Tren tren;




    public Locomotor(int codigo) {
        this.codigo = codigo;
        this.tren = tren;
    }



    @Override
    public String toString() {
        return "Locomotor{" +
                "codigo=" + codigo +
                ", tren=" + tren +
                '}';
    }
}
