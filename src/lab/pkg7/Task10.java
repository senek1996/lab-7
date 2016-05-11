/*
 * Создать абстрактный класс Pet c полями age, name, hungry, voice. Создать классы:
    Shake, PatrolDog, Dog, Cat, Fish (от Pet).
 */
package lab.pkg7;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import static lab.pkg7.Ppet.readln;

abstract class Ppet {
    String voice;
    int hungry;
    
    public void voise() {
        System.out.println(voice);
    }
    
    public void hungry() {
        if (hungry<5) System.out.print("\nСлушай, ЧМО, когда ты меня кормить будешь?");
        else if ((hungry>=5) && (hungry<20)) System.out.print("\nНу когда же ЖРАТЬ?");
        else if ((hungry>=20) && (hungry<40)) System.out.print("\nКогда я буду есть?");
        else if ((hungry>=40) && (hungry<60)) System.out.print("\nПожрать бы");
        else if ((hungry>=60) && (hungry<80)) System.out.print("\nЯ пока сыт");
        else if ((hungry>=80) && (hungry<95)) System.out.print("\nЯ сытой - погуляй пока что");
        else if ((hungry>=95) && (hungry<=100)) System.out.print("\nНажрался");
    }
    
    public static String readln() {
        String s="";
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        try {
            System.out.print("напиши что-нибудь и нажми Enter");
            s = bufferedReader.readLine(); //читаем строку с клавиатуры
        }
        catch (Exception ex) {
            System.out.println("\nОшибка считывания.");
        }
        
        return s;
    }
}

class Dogge extends Ppet {//собака
    Dogge() {
        double d=Math.random()*101-1;
        
        voice="\nРРРРРРРРРР-АВ-АВ";
        hungry=(int) d;
        System.out.print("Поговори с собачкой");
        String s = readln();
    }    
}

class PatrolDog extends Ppet {
    PatrolDog() {
        double d=Math.random()*101-1;
        
        voice="\nААААААРРРРРРРР-УАВ-УАВ-РРРРРРРРР";
        hungry=(int) d;
        System.out.print("Поговори с патрульной собачкой");
        String s = readln();
    }
}

class SongShake extends Ppet {
    SongShake() {
        double d=Math.random()*101-1;
        
        voice="\nШ-Ш-Ш-Ш-ШАЛАВЬИ ПАЮТ, ШААЛИВАЮТСЯ";
        hungry=(int) d;
        System.out.print("Поговори с поющей змейкой");
        String s = readln();
    }
}

class Fish extends Ppet {
    Fish() {
        voice="\nА рыбы не разговаривают((((((";
        double d=Math.random()*101-1;
        hungry=(int) d;
        System.out.print("Поговори с рыбкой");
        String s = readln();
    }
}

class Ccat extends Ppet {
    Ccat() {
        voice="\nNONONONONO";
        double d=Math.random()*101-1;
        hungry=(int) d;
        System.out.print("\nПоговори с котейкой");
        String s = readln();
    }
}



public class Task10 {
   
    
    public static void main(String[] args) {
        Dogge dogge = new Dogge();
        dogge.hungry();
        dogge.voise();
        PatrolDog patrol = new PatrolDog();
        patrol.hungry();
        patrol.voise();
        SongShake shake = new SongShake();
        patrol.hungry();
        patrol.voise();
        Ccat cat = new Ccat();
        cat.hungry();
        cat.voise();
        Fish fish = new Fish();
        patrol.voise();
    }
}
