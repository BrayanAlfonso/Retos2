public class Reto3 {
    public static void main(String[] args) {
        String [][] teclado ={{"Esc"," ","F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12","ImprPant","BloqDesp","Pause"," "," "," "," "},
                            {"°","1","2","3","4","5","6","7","8","9","0","?","¿","<----","Insert","Inicio","RePag","BloqNum","/","*","-"},
                            {"Tab","Q","W","E","R","T","Y","U","I","O","P","´","+"," Enter","Supr","Fin","AvPag","7","8","9","+"},
                            {"Mayus","A","S","D","F","G","H","J","K","L","Ñ","{","}","  ","  ","  ","  ","4","5","6"," "},
                            {"Shift","<","Z","X","C","V","B","N","M",",",".","-","RightShift ","","↑","","1","2","3","Intro",""},
                            {"CTRL","Windows","Alt"," "," "," "," "," "," "," ","AltGr","Fn","RB","CTRL","←","↓","→","0","  ",".","  "}};
    
    
    for(int fila=0;fila<6;fila++){
        for(int columna=0;columna<21;columna++){
            System.out.print(teclado[fila][columna]+"\t");
        }
        System.out.println("  ");
    }
    
    
    }
}
