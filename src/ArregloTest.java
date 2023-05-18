

public class ArregloTest {
    public static void main(String ... args) {
        System.out.println("Problema 1: -------------");
        Arreglo a1 = new Arreglo(3);
        a1.print();
        
        Arreglo a2 = new Arreglo(0);
        a2.print();
        
        Arreglo a3 = new Arreglo(-1);
        a3.print();
        
        System.out.println("Problema 2: -------------");
        Arreglo a4 = new Arreglo(5);
        a4.ingresar(1);
        a4.ingresar(2);
        a4.ingresar(6);
        a4.ingresar(5);
        a4.ingresar(2);
        
        a4.ingresar(-7);
        
        a4.print();
        
        System.out.println("Problema 3: -------------");
        System.out.println("P2 sumar:" + a4.sumar() );
        
        
         System.out.println("Problema 4: -------------");
        System.out.println("P4 multiplicar:" + a4.multiplicar() );
        
        System.out.println("Problema 5: invertir -------------");
        a4.invertir();
        a4.print();
        System.out.println("Problema 6:ordenar Desendente -------------");
        a4.ordenaDesendente();
        a4.print();
        System.out.println("Problema 7:ordenar Asendente -------------");
        a4.ordenaAsendente();
        a4.print();
    }
}