package package3;

import java.awt.*;

public class Main {
    public static void main(String args[]) {
        System.out.println("Nilai Nya Adalah " + Perhitungan.nilai);

        for (int i = 0; i < 5; i++) {
            new Perhitungan();
            System.out.println(Perhitungan.nilai);
        }

    }
}
