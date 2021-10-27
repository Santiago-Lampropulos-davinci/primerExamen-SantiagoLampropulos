public class TetraedroRegular extends FiguraTridimensional{

    private double arista;
    final static int CARAS =4;

    public TetraedroRegular(int arista){
        this.arista = arista;
    }
    public TetraedroRegular(){
        this.arista = 1;
    }

    @Override
    public double calcularVolumen() {
        return Math.sqrt(2) * Math.pow(arista,3) /12;
    }

    @Override
    public double calcularArea() {
        return Math.sqrt(3)*Math.pow(arista,2);
    }

    @Override
    public String toString() {
        return "``La figura es un TetraedroRegular ́ ́.";
    }
}
