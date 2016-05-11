/*
 * 8.	Написать public static методы: int max(int, int), long max (long, long), 
        double max (double, double). Каждый метод должен возвращать максимальное 
        из двух переданных в него чисел.

        Автор: Бредихин А.И.
 */
package lab.pkg7;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class Task8 {
    
    public static String readln() {
        String s="";
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        try {
            System.out.print("\nВведите число (первые 2 - int, вторые 2 - long, 3-е 2 - float, 4-е 2 - double): ");
            s = bufferedReader.readLine(); //читаем строку с клавиатуры
        }
        catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
        }
        
        return s;
    }
    
    public static int max(int a, int b) {
        if (a<b) return b;
        else if (a==b) {System.out.print("Числа равны. "); return -1;}
        else return a;
    }
    
    public static long max(long a, long b) {
        if (a<b) return b;
        else if (a==b) {System.out.print("Числа равны. "); return -1;}
        else return a;
    }
    
    public static double max(double a, double b) {
        if (a<b) return b;
        else if (a==b) {System.out.print("Числа равны. "); return -1;}
        else return a;
    }
    
    public static float max(float a, float b) {
        if (a<b) return b;
        else if (a==b) {System.out.print("Числа равны. "); return -1;}
        else return a;
    }
    
    public static void main(String[] args) {
        int a=Integer.parseInt(readln()), b=Integer.parseInt(readln());
        long c=Long.parseLong(readln()), d=Long.parseLong(readln());
        float e=Float.parseFloat(readln()), f=Float.parseFloat(readln());
        double g=Double.parseDouble(readln()), h=Double.parseDouble(readln());
        a=max(a,b);
        c=max(c,d);
        e=max(e,f);
        g=max(g,h);
        System.out.print("Максимумы: "+a+" "+c+" "+e+" "+g);
    }
}
