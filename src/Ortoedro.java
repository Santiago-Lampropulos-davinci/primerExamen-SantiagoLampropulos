public class Ortoedro extends FiguraTridimensional{

    private double ancho;
    private double base;
    private double altura;
    final static int CARAS = 6;

    public Ortoedro(double ancho, double base, double altura){
        this.ancho = ancho;
        this.base = base;
        this.altura = altura;
    }
    public Ortoedro(){
        this.ancho = 1;
        this.base = 1;
        this.altura = 1;
    }
    @Override
    public double calcularVolumen() {
        return ancho * base * altura;
    }

    @Override
    public double calcularArea() {
        return 2 * (ancho * base) + 2 * (ancho * altura) + 2 * ( base * altura);
    }

    @Override
    public String toString() {
        return "La figura es un Ortoedro ";
    }
}
