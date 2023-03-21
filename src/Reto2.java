import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        int cantCompetidores;
        int ganador=0;


        Scanner lectura = new Scanner(System.in);
        System.out.println("¿Cuantos competidores participaran en la competencia?");
        cantCompetidores=lectura.nextInt();

        String[] nombres = new String[cantCompetidores];
        double[] tiempos = new double[cantCompetidores];


        for( int i=0;i<cantCompetidores;i++){

            
            System.out.println("Nombre del competidor "+(i+1)+" :");
            nombres[i]=lectura.next();

            System.out.println("Tiempo del competidor"+(i+1)+" :");        
            tiempos[i]=lectura.nextDouble();
        }

        System.out.println("Los competidores son: ");

        for(int i=0;i<cantCompetidores;i++){
            System.out.println(nombres[i]+": "+tiempos[i]+" segundos");
        }

        for( int i=0;i<cantCompetidores;i++){
            if(tiempos[i]<tiempos[ganador]){
                ganador=i;
            }
        }
        System.out.println("El ganador ha sido "+nombres[ganador]+" con un tiempo de "+tiempos[ganador]+" segundos");
        lectura.close();
    }
}
