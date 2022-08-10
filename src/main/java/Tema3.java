public class Tema3 {

    public static void main(String[] args){
        int sumado = sumar(2,4,6);
        System.out.println("Resultado: "+sumado);

        Coche miCoche = new Coche(3);
        miCoche.addPuerta(1);
        System.out.println("Cantidad de puertas: "+miCoche.getPuertas());
    }

    public static int sumar(int a, int b, int c){
        return a+b+c;
    }

}
