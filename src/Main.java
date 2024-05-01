import java.util.Random;

public class Main {
    public static void main(String[] args){
        double radio;
        double base;
        double altura;

        Circulo c1;
        Rectangulo r1;

        Random random = new Random();
        for(int i = 0; i < 3; i++){
            System.out.println( "-----------" );
            radio = random.nextInt(100);
            c1 = new Circulo(radio);
            System.out.println("Creando circulo con radio: \t" + c1.getRadio());
            System.out.println("Area: \t" + c1.calcularArea());
            System.out.println("Perimetro: \t" + c1.calcularPerimetro());
        }
        System.out.println( "------------------------------------");
        for(int i = 0; i < 3; i++){
            base = random.nextInt(100);
            altura = random.nextInt(100);
            r1 = new Rectangulo(base, altura);
            System.out.println("Creando rectanculo con base: \t" + r1.getBase() + "\tAltura: " + r1.getAltura());
            System.out.println("Area: \t" + r1.calcularArea());
            System.out.println("Perimetro: \t" + r1.calcularPerimetro());
            System.out.println( "-----------" );
        }
    }
}