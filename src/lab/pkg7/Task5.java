/*
 *5.	Написать два метода: print(int) и print(Integer).Написать такой 
        код в методе main, чтобы вызвались они оба.
 */
package lab.pkg7;


public class Task5 {
    
    public static void print(Integer a) {
        System.out.print("\nЗначение объекта типа Integer: "+a.intValue());
    }
    
    public static void print(int a) {
        System.out.print("\nЧисло: "+a);
    }
    
    public static void main(String[] args) {
        Integer obj = 5;
        int a=12;
        print(obj);
        print(a);
    }
}
