package javacore.introducao.dominio.Treino.Ex01;

public class Main {
    public static void main(String[] args) {
        Clock brlClock = new BRLClock();
        brlClock.setSecond(0);
        brlClock.setMinute(0);
        brlClock.setHour(25);

        System.out.println(brlClock.getTime());

        System.out.println(new USClock().convert(brlClock).getTime());
    }
}
