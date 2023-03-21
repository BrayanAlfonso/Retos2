import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        int cantNotas;
        double promedio=0;
        double suma=0;


        Scanner lectura= new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de notas");
        cantNotas = lectura.nextInt();

            double notas[]=new double[cantNotas];
        
        for(int i=0;i<cantNotas;i++){
            System.out.println("Ingrese la nota "+(i+1));
            notas[i]=lectura.nextDouble();
        }

        for(int i=0;i<cantNotas;i++){
            suma += notas[i];
        }
        System.out.println("El resultado de las notas sumadas es:  "+suma);
        
        promedio = suma / notas.length;
        System.out.println("El promedio de las notas es: "+promedio);
            if(promedio<3.0){
                System.out.println("Usted ha reporbado la materia");
            }else if(promedio>3.0 & promedio<4.0){
                System.out.println("Usted ha pasado la materia raspando");
            }else{
                System.out.println("Usted ha aprobado la materia con buenos resultados");
            }
            lectura.close();
    }
}
