package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.turnOn();
        boolean b1 = televisor.showStatus();
        System.out.println(b1);

        televisor.turnOff();
        boolean b2 = televisor.showStatus();
        System.out.println(b2);
    }
}
