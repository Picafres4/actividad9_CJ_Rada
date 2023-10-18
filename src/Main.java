import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // declaración objeto Scanner
        Scanner teclado = new Scanner(System.in);

        // declaración variables para la entrada de datos
        String nombre, color, raza, sexo, tipoComida;
        int edad;
        double peso, cantidad;

        String nombre2, color2, raza2, sexo2, tipoComida2;
        int edad2;
        double peso2, cantidad2;

        // instanciación de objetos
        Perro perro1, perro2;
        perro1 = new Perro();
        perro2 = new Perro();

        try {
            // entrada de atributos del perro 1
            System.out.println("Ingresa el nombre del primer perrito ");
            nombre = teclado.nextLine();
            perro1.setNombre(nombre);

            System.out.println("Ingresa la edad del primer perrito ");
            edad = teclado.nextInt();
            perro1.setEdad(edad);

            // evitar error de formato en objeto scanner
            teclado.nextLine();

            System.out.println("Ingresa el color del primer perrito ");
            color = teclado.nextLine();
            perro1.setColor(color);

            System.out.println("Ingresa la raza del primer perrito ");
            raza = teclado.nextLine();
            perro1.setRaza(raza);

            System.out.println("Ingresa el sexo del primer perrito ");
            sexo = teclado.nextLine();
            perro1.setSexo(sexo);

            System.out.println("Ingresa el peso del primer perrito ");
            peso = teclado.nextDouble();
            perro1.setPeso(peso);

            teclado.nextLine();

            System.out.println("¿Qué comida comió " + (perro1.getNombre()) + "?");
            tipoComida = teclado.nextLine();
            perro1.setTipoComida(tipoComida);

            System.out.println("¿Cuántos gramos de comida comió " + (perro1.getNombre()) + "?");
            cantidad = teclado.nextDouble();
            perro1.setCantidad(cantidad);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresaste un valor equivocado.");
            return;
        }



        // invocación de métodos
        perro1.comer(perro1.getTipoComida(), perro1.getCantidad());
        perro1.ladrar();


        System.out.println("\n");


        try {
        // entrada de atributos del perro 2
        System.out.println("Ingresa el nombre del segundo perrito ");
        nombre2 = teclado.nextLine();
        perro2.setNombre(nombre);

        System.out.println("Ingresa la edad del segundo perrito ");
        edad2 = teclado.nextInt();
        perro2.setEdad(edad);

        // evitar error de formato en objeto scanner
        teclado.nextLine();

        System.out.println("Ingresa el color del segundo perrito ");
        color2 = teclado.nextLine();
        perro2.setColor(color);

        System.out.println("Ingresa la raza del segundo perrito ");
        raza2 = teclado.nextLine();
        perro2.setRaza(raza);

        System.out.println("Ingresa el sexo del segundo perrito ");
        sexo2 = teclado.nextLine();
        perro2.setSexo(sexo);

        System.out.println("Ingresa el peso del segundo perrito ");
        peso2 = teclado.nextDouble();
        perro2.setPeso(peso);

        teclado.nextLine();

        System.out.println("¿Qué comida comió " + (perro2.getNombre()) + "?");
        tipoComida2 = teclado.nextLine();
        perro2.setTipoComida(tipoComida);

        System.out.println("¿Cuántos gramos de comida comió " + (perro2.getNombre()) + "?");
        cantidad2 = teclado.nextDouble();
        perro2.setCantidad(cantidad);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresaste un valor equivocado.");
            return;
        }

        // invocación de métodos
        perro2.comer(perro2.getTipoComida(), perro2.getCantidad());
        perro2.ladrar();

    }
}