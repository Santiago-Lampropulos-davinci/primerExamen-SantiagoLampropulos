public class Cubo extends FiguraTridimensional{

    private double lado;
    final static int CARAS=6;

    public Cubo(double lado){
        this.lado = lado;
    }
    public Cubo(){
        this.lado=1;
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(lado,3);
    }

    @Override
    public double calcularArea() {
        return 6*Math.pow(lado,2);
    }

    @Override
    public String toString() {
        return "La figura es un Cubo";
    }
}
