public class Principal {
    public static void main(String[] args) {
        Figura figura1 = new Circulo("vermelho", 5); 
        Figura figura2 = new Retangulo("roxo", 3, 4);
        System.out.println("A área do Círculo é: " + figura1.area() );
        System.out.println("A área do Retângulo é: " + figura2.area() );
        System.out.println("A cor do Círculo é: " + figura1.cor);
        System.out.println("A cor do Retângulo é: " + figura2.cor);
    }
}
