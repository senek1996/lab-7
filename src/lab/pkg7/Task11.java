/*
    Реализовать два интерфейса PassangersAuto(описать метод перевозки пассажиров) 
    и CargoAuto (описать метод перевозки груза). Написать классы Truck, Sedan, 
    Pickup реализующие эти интерфейсы.
 */
package lab.pkg7;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import static lab.pkg7.Kamaz5320.readln;


class Kamaz5320 implements CargoAuto {
    int rasxod;
    int km;
    int ves;
    
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
    
    public void pilim(int ves,int km,int rasxod) {
        double rasx=rasxod*(1+0.01*ves/200);//расход растет на 1% при погрузке 200 кг груза
        
        System.out.print("\nПроехали "+this.km+" км. Отвезли "+this.ves+" кг груза. Сожгли "+rasx*(km/100)+" л соляры. При расходе "+rasx+"л.");

    }
    
    Kamaz5320 () {//конструктор
        this.rasxod=40;
        System.out.println("\nВведите расстояние: ");
        this.km=Integer.parseInt(readln());
        System.out.println("\nВведите массу груза: ");
        this.ves=Integer.parseInt(readln());;
    }
    
}

class Pazik implements PassangersAuto {
    int pass;
    int km;
    int rasxod;
    
    public void edemedem() {
        double rasx=rasxod*(1+0.006*pass);//расход растет на 0.6% при посадке 1 пассажира
        
        System.out.print("\nПроехали "+this.km+" км. Отвезли "+this.pass+" человек. Сожгли "+rasx*(km/100)+" л соляры. При расходе "+rasx+"л.");
    }
    
    Pazik () {
        this.rasxod=25;
        System.out.println("\nВведите расстояние: ");
        this.km=Integer.parseInt(readln());
        System.out.println("\nВведите кол-во пассажиров: ");
        this.pass=Integer.parseInt(readln());;
    }
    
}

public class Task11 {
   
    public static void main(String[] args) {
        Kamaz5320 x340ap186 = new Kamaz5320();
        x340ap186.pilim(x340ap186.ves, x340ap186.km, x340ap186.rasxod);
        
        Pazik x999ax123 = new Pazik();
        x999ax123.edemedem();
    }
    
}
