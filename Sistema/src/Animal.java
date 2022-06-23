public class Animal {
    String nombre, alimento, raza;
    int edad;

    public void Alimentarse(){
        System.out.println(nombre + " se alimenta de " + alimento);
    };
    public void Datos(){
        System.out.println(nombre + " es de raza " + raza + " y tiene " + edad + " años" );
    }
}
