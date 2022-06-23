import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Electrodomesticos {
    Scanner read = new Scanner(System.in);
    String color, consumo;
    double peso, precio, pc, pp;

    public Electrodomesticos(){
        this.precio=1000;
        Peso();
       ComprobarColor();
       ComprobarConsumo();
       PrecioFinal();

        }

    private void PrecioFinal() {
        double total= pc+pp+precio;
        System.out.println("El precio Final es de: " + total);
    }

    private void Peso() {
        System.out.println("Cual es el peso del electrodomestico?");
        this.peso=read.nextDouble();

        if (peso>=80){
            pp=1000;
        } else if (peso>50 && peso<79) {
            pp=800;
        } else if (peso>20 && peso<49) {
            pp=500;
        }else if (peso>1 && peso<19) {
            pp = 100;
        }

    }

    private void ComprobarConsumo() {
        System.out.println("Cual es el consumo de su electrodomestico?. De la A a la F");
        this.consumo= read.next();

        switch (consumo){
            case "a":
                this.consumo = "a";
                pc=1000;
                break;

            case "b":
                this.consumo="b";
                pc=800;
                break;
            case "c":
                this.consumo="c";
                pc=600;
                break;
            case "d":
                this.consumo="d";
                pc=500;
                break;
            case "e":
                this.consumo="e";
                pc=300;
                break;
            case "f":
                this.consumo="f";
                pc=100;
                break;
            default:
                System.out.println("Su letra no existe");
                this.consumo = "f";
                break;
        }
    }

    public void ComprobarColor(){
        System.out.println("Cual es el color?");
        this.color= read.next();

        switch (color){
            case "blanco":
                System.out.println("blanco");
                this.color="blanco";
                break;
            case"negro":
                System.out.println("negro");
                this.color="negro";
                break;
            case "azul":
                System.out.println("azul");
                this.color="azul";
                break;
            case "rojo":
                System.out.println("rojo");
                this.color="rojo";
                break;
            default:
                System.out.println("Por default su electrodomestico es blanco!");
                break;
        }
    }
}
