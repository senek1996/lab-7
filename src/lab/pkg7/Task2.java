/*
 * 2.	Написать метод, который определяет, объект какого класса ему передали, и 
        выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.

        Автор Бредихин А.И.
 */
package lab.pkg7;

class lamp {
    boolean type;
    int power;
}

class ccccat {
    int age;
    int ves;
    String name;
}

class dog {
    
}

class bird {
    
}


public class Task2 {
    
    public static void whatisit(Object obj) {
        if (obj instanceof lamp) System.out.print("\n"+"Ето лампошке");
        else if (obj instanceof ccccat) System.out.print("\n"+"Ето кошькама");
        else if (obj instanceof dog) System.out.print("\n"+"Ето собашьке");
        else if (obj instanceof bird) System.out.print("\n"+"Ето питтса");
    }    
    
    public static void main(String[] args) {
        lamp obj1 = new lamp();
        ccccat obj2 = new ccccat();
        dog obj3 = new dog();
        bird obj4 = new bird();
        whatisit(obj1);
        whatisit(obj2);
        whatisit(obj3);
        whatisit(obj4);
    }
}
