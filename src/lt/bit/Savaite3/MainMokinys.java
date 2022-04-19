package lt.bit.Savaite3;

// Atspausdinant mokini tuo paciu prie vardo, pavardes, klases ir pazymiu atspausdinti
// jo pazymiu vidurki

public class MainMokinys {

    public static void main(String[] args) {
        // Susikurti objekta Mokinys
        Mokinys mok1 = sukurtiMokini("Andrius", "Andraitis", "3c", new int[]{4, 8, 1, 10});
        Mokinys mok2 = sukurtiMokini("Petras", "Petraitis", "5c", new int[]{4, 8, 3, 10});
        Mokinys mok3 = sukurtiMokini("Jonas", "Jonaitis", "2c", new int[]{4, 8, 5, 10});
        Mokinys mok4 = sukurtiMokini("Mantas", "Mantaitis", "3c", new int[]{4, 8, 10, 10});
        Mokinys mok5 = sukurtiMokini("Matas", "Mataitis", "8a", new int[]{4, 5, 6, 10});

        Mokinys[] mokiniai = new Mokinys[]{mok1, mok2, mok3, mok4, mok5};

        Mokinys geriausias = gautiGeriausiaiBesimokanti(mokiniai);
        System.out.println(geriausias);

//        for (Mokinys mokinys : mokiniai) {
//            System.out.println(mokinys.toString());
//            System.out.println(mokinys.getVardas() + " " + mokinys.getPavarde() + " " + mokinys.getKlase() + " " + Arrays.toString(mokinys.getPazymiai()));
//        }
    }

    public static Mokinys sukurtiMokini(
            String vardas,
            String pavarde,
            String klase,
            int[] pazymiai
    ) {
        return new Mokinys(vardas, pavarde, klase, pazymiai);
    }

    public static Mokinys sukurtiMokiniRugseji(String vardas, String pavarde, String klase) {
        return new Mokinys(vardas, pavarde, klase, new int[]{});
    }

    public static Mokinys gautiGeriausiaiBesimokanti(Mokinys[] m) {
        Mokinys geriausias;
        if (m.length > 0) {
            geriausias = m[0];
        } else {
            return null;
        }

        for (int i = 1; i < m.length; i++) {
            if(geriausias.pazymiuVidurkis() < m[i].pazymiuVidurkis()) {
                geriausias = m[i];
            }
        }
        return geriausias;
    }
}
