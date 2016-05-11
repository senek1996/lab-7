/*
 * 6.	Написать пять методов print с разными параметрами. (перегрузка методов)
 */
package lab.pkg7;


public class Task6 {
    
    public static void print(int a) {
        System.out.println("Целое: "+a);         
    }
    
    public static void print(long a) {
        System.out.println("Длинное целое: "+a);         
    }
    
    public static void print(float a) {
        System.out.println("Дробное: "+a);         
    }
    
    public static void print(double a) {
        System.out.println("Дробное двойной точности: "+a);         
    }
    
    public static void print(String s) {
        System.out.println(": "+s);         
    }
    
    public static void main(String[] args) {
        int a=12;
        long b=19307236;
        float c=a*b;
        double d=c*588;
        String s="Строка: Senek "+(int)Math.sqrt(d);
        
        print(a);
        print(b);
        print(c);
        print(d);
        print(s);
    }
    
}
