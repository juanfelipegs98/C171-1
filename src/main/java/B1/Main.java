package B1;

import java.sql.Wrapper;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Primitivos
        short valores=-32768;
        int num1=9; //primitivo
        double num3=3.4;
        boolean esVerdad=false;
        char caracter='A';

        //Wrapper
        Short valor= 32767;
        Integer num2 = 10; //Wrapper int
        Double num10=3.4; //double
        Boolean esFalso=true;
        Character caraterW='T';

        String text= "hola mundo"; //texto
        Date date = new Date(); //fechas

        System.out.println("" + text);


    }
}
