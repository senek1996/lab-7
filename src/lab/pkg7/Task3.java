/*
 *3.	Создать два класса Cat(кот) и Dog(собака), класс Dog(собака) происходит
        от Cat(кот). Определить метод getChild в классах Cat(кот) и Dog(собака), 
        чтобы кот порождал кота, а собака – собаку.

        Автор: Бредихин А.И.
 */
package lab.pkg7;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;



class Cat {
    int age;
    int wes;
    int pokolenie=0;
    String name;
    
    public Cat getChild(int wes, String name) {
        Cat kotenok = new Cat(0,wes,this.pokolenie++,name);
        return kotenok;
    }
    
    Cat(int a, int w, int p, String n) {
        age=a;
        wes=w;
        pokolenie=p;
        name=n;
    }
    
    public void getdata () {
        if (age<2) System.out.print("Kotenok "+name+" vozr = "+age+" wes = "+wes+" pokolenie = "+pokolenie);
        else System.out.print("Koshka "+name+" vozr = "+age+" wes = "+wes+" pokolenie = "+pokolenie);
    }
}

class Dog extends Cat {
    @Override
    public Dog getChild(int wes, String name) {
        Dog shenok = new Dog(0,wes,this.pokolenie++,name);
        return shenok;
    }
    
    Dog(int a, int w, int p, String n) {
        super(a, w, p, n);//вызов конструктора в классе - родителе
//        age=a;
//        wes=w;
//        pokolenie=p;
//        name=n;
    }
    
    @Override
    public void getdata () {
        if (age<2) System.out.print("Sobaka "+name+" vozr = "+age+" wes = "+wes+" pokolenie = "+pokolenie);
        else System.out.print("Pes "+name+" vozr = "+age+" wes = "+wes+" pokolenie = "+pokolenie);
    }
}

public class Task3 {
    
    public static String readln() {
        String s="";
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        try {
            s = bufferedReader.readLine(); //читаем строку с клавиатуры
        }
        catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
        }
        
        return s;
    }
    
    public static void main (String[] args) {
        String s;
        int a,b;
        //кошки
        System.out.println("\nВведите возраст, вес и имя кота: ");
        a=Integer.parseInt(readln());
        b=Integer.parseInt(readln());
        s=readln();
        Cat cat = new Cat(a,b,0,s);//создание объекта
        cat.getdata();
        System.out.println("\nВведите вес и имя котенка: ");
        a=Integer.parseInt(readln());
        s=readln();
        Cat koten = cat.getChild(a, s);//создание объекта
        koten.getdata();
        
        //собаки
        System.out.println("\nВведите возраст, вес и имя собаки: ");
        a=Integer.parseInt(readln());
        b=Integer.parseInt(readln());
        s=readln();
        Dog dog = new Dog(a,b,0,s);//создание объекта
        dog.getdata();
        System.out.println("\nВведите вес и имя щенка: ");
        a=Integer.parseInt(readln());
        s=readln();
        Dog schen = dog.getChild(a, s);//создание объекта
        dog.getdata();
        
    }
}
