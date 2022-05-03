package lt.bit.Savaite4;

import java.awt.*;
import java.awt.event.InputEvent;

public class Keltas {
    public static void main(String[] args) throws AWTException {
        int k = 27;
        int m = 10;

        int kiekKartuPerkels = k / m;
        System.out.println("Perkels per kartu: " + kiekKartuPerkels);
        int likoNeperkelta = k % m;
//        int likoNeperkelta = k - kiekKartuPerkels * m;
        System.out.println("Liks neperkelta: " + likoNeperkelta);
    }

}
