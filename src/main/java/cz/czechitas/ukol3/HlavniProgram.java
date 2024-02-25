package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        Pocitac pocitacAlice = new Pocitac();
        System.out.println(pocitacAlice.toString());
        pocitacAlice.zapniSe();

        pocitacAlice.jeZapnuty();

        pocitacAlice.vypniSe();

        pocitacAlice.jeZapnuty();

        Procesor procesorAlice = new Procesor();
        procesorAlice.setRychlost( 1_800_000_000L);
        procesorAlice.setVyrobce("Asus");

        Pamet pametAlice = new Pamet();
        pametAlice.setKapacita( 8_000_000_000L);

        Disk diskAlice = new Disk();
        diskAlice.setKapacita( 476_900_000_000L);

        System.out.println("Využité místo je " + diskAlice.getVyuziteMisto());

        pocitacAlice.vytvorSouborOVelikosti(1500000);
        System.out.println("Využité místo je " + diskAlice.getVyuziteMisto());
        pocitacAlice.vymazSouboryOVelikosti(800000);
        System.out.println("Využité místo je " + diskAlice.getVyuziteMisto());

        System.out.println(pocitacAlice.toString());

        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");
    }

}
