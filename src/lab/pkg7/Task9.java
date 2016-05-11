/*
 * Сделать класс Dog (из лаб. 6) абстрактным
 */
package lab.pkg7;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


abstract class Pet {
    int age;
    int sex;
    double weight;
    String name;
    
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    
    Pet() {
        String s1;
        try {
            System.out.print("\nВведите имя: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.name=s1;
            System.out.print("\nВведите возраст: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.age=Integer.parseInt(s1);
            
            System.out.print("\nВведите пол (0 или 1): ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.sex=Integer.parseInt(s1);
            
            while (!(this.sex==0 || this.sex==1)) {
                System.out.print("\nВведите пол (0 или 1): ");
                s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
                this.sex=Integer.parseInt(s1);
            }
            
            System.out.print("\nВведите вес: ");
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            this.weight=Double.parseDouble(s1); 
        } 
        catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
            return;
        }
    }
    
    public void vivod() {
        if (sex==0) System.out.print("Собака "+this.name+". "+this.age+" years. Ves "+this.weight+" kg.");
        else if (sex==1) System.out.print("Пес "+this.name+". "+this.age+" years. Ves "+this.weight+" kg.");
    }
}

class Doge extends Pet {
    
}

public class Task9 {
    public static void main(String[] args) {
        Doge doge = new Doge();
        System.out.print("\n");
        doge.vivod();
    }
}
