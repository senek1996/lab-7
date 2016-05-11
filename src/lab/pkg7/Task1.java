/*
 *1.	Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала: 
        "Я не корова, Я – кит."

        Автор Бредихин А.И.
 */
package lab.pkg7;


class Cow {
    public void printAll() {
        printColor();
        printName();
    }
     
    public void printColor() {
        System.out.println("Я - белая");
    }
    
    public void printName() {
        System.out.println("Я - корова");
    }

}

class Whale extends Cow {
    
    @Override
    public void printColor() {
        System.out.println("Я - синий, а не голубой!");
    }
    
    @Override
    public void printName() {
        System.out.println("Сам ты корова! Я кит");
    }
}


public class Task1 {
    public static void main (String[] args) {
        Whale obj = new Whale();
        obj.printName();
        obj.printColor();
    }
}
