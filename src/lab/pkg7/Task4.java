/*
 *4.	Написать два метода: print(int) и print(String). (Перегрузка методов)
        Автор: Бредихин А.И.
 */
package lab.pkg7;


public class Task4 {
    
    public static void print(int a) {
        System.out.println("Число: "+a);
    }
    
    public static void print(String s) {
        System.out.println("Строка: "+s);
    }
    
    public static void main(String[] args) {
        int a=25;
        String s="Senek";
        print(a);
        print(s);
    }
    
}
