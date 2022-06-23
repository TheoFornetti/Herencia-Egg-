public class Main {
    public static void main(String[] args) {

        Animal p1 = new Perro("Pirulo", "Croquetas", "Golden", 20);
        p1.Alimentarse();
        p1.Datos();
        Animal g1 = new Gato("Mishi", "Pescado", "Egipcio", 3);
        g1.Alimentarse();
        g1.Datos();
        Animal c1 = new Caballo("Fortuna", "Manzana", "Persa", 5);
        c1.Alimentarse();
        c1.Datos();
    }
}
