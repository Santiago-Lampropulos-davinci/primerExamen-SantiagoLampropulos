public class Main {

    public static void main(String[] args) {

        System.out.println("----------------------------------");
        FiguraTridimensional ortoedro = new Ortoedro(2,1,7);

        System.out.println(ortoedro.toString());
        System.out.println(ortoedro.calcularArea());
        System.out.println(ortoedro.calcularVolumen());

        System.out.println("----------------------------------");
        FiguraTridimensional tetraedroRegular = new TetraedroRegular(1);

        System.out.println(tetraedroRegular.toString());
        System.out.println(tetraedroRegular.calcularArea());
        System.out.println(tetraedroRegular.calcularVolumen());

        System.out.println("----------------------------------");
        FiguraTridimensional cubo = new Cubo(7);

        System.out.println(cubo.toString());
        System.out.println(cubo.calcularArea());
        System.out.println(cubo.calcularVolumen());


    }
}
