import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        int cant;
        int sumaFilas=0;
        int sumaColumnas=0;


        System.out.println("De que tamaño quiere que sea el sudoku(solo debe poner un numero, el cual seran el numero de filas y de columnas)");
        cant=lector.nextInt();

        int  [][] sudoku= new int [cant][cant];

        for(int fila=0;fila<cant;fila++){
            for(int columna=0;columna<cant;columna++){
                System.out.println("Ingrese el numero que  quiere poner en la fila "+(fila+1)+" y en la columna "+(columna+1));
                sudoku[fila][columna]=lector.nextInt();
            }
        }

        for(int fila=0;fila<cant;fila++){
            for(int columna=0;columna<cant;columna++){
                System.out.print(sudoku[fila][columna]+"\t");
            }
            System.out.println("  ");
        }   

        for(int fila=0;fila<cant;fila++){
            sumaFilas=0;
            sumaColumnas = 0;
            for(int columna=0;columna<cant;columna++){
                sumaFilas+=sudoku[fila][columna];
                sumaColumnas+=sudoku[columna][fila];
            }
            
            System.out.println("La suma de la fila "+(fila+1)+" es "+sumaFilas);
            System.out.println("La suma de la columna "+(fila+1)+" es "+sumaColumnas);
            
            
    }


            
            
            
    
    lector.close();
    }
}
