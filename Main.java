public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 5;
        int resultado = suma(a, b, c);
        System.out.println(resultado);

        Coche miCoche = new Coche();

        miCoche.AñadirPuertas();
        System.out.println(miCoche.puertas);



       }

        public static int suma(int a, int b, int c){

        return a+b+c;



        }

    }

    class Coche {
    public int puertas=3;
    public void AñadirPuertas() {this.puertas++;}
    }





