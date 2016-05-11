/*
 * 7.	Написать public static методы: int min(int, int), long min(long, long), 
        double min(double, double). Каждый метод должен возвращать минимальное 
        из двух переданных в него чисел.

        Автор: Бредихин А.И.
 */
package lab.pkg7;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class Task7 {
    
    public static String readln() {
        String s="";
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        try {
            System.out.print("\n\nВведите число (первые 2 - int, вторые 2 - long, 3-е 2 - float, 4-е 2 - double): ");
            s = bufferedReader.readLine(); //читаем строку с клавиатуры
        }
        catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
        }
        
        return s;
    }
    
    public static int min(int a, int b) {
        if (a<b) return a;
        else if (a==b) {System.out.print("Числа равны. "); return a;}
        else return b;
    }
    
    public static long min(long a, long b) {
        if (a<b) return a;
        else if (a==b) {System.out.print("Числа равны. "); return a;}
        else return b;
    }
    
    public static double min(double a, double b) {
        if (a<b) return a;
        else if (a==b) {System.out.print("Числа равны. "); return a;}
        else return b;
    }
    
    public static float min(float a, float b) {
        if (a<b) return a;
        else if (a==b) {System.out.print("Числа равны. "); return a;}
        else return b;
    }
    
    public static void main(String[] args) {
        int a=Integer.parseInt(readln()), b=Integer.parseInt(readln());
        long c=Long.parseLong(readln()), d=Long.parseLong(readln());
        float e=Float.parseFloat(readln()), f=Float.parseFloat(readln());
        double g=Double.parseDouble(readln()), h=Double.parseDouble(readln());
        a=min(a,b);
        c=min(c,d);
        e=min(e,f);
        g=min(g,h);
        System.out.print("Минимумы: "+a+" "+c+" "+e+" "+g);
    }
    
}
