package cz.czechitas.ukol3;

public class Pocitac {

   public boolean jeZapnuty;
   public Procesor cpu;
   public Pamet ram;
   public Disk pevnyDisk;
   //private long velikost;

   public Pocitac() {
      cpu = new Procesor();
      ram = new Pamet();
      pevnyDisk = new Disk();
   }

   public String toString() {
      return "Tento počítač patří Alici. " + cpu.toString() + " " + ram.toString() + " " + pevnyDisk.toString();
   }

   public boolean jeZapnuty() {
      System.out.println("Počítač je zapnutý - " + jeZapnuty);
      return jeZapnuty;
   }

   public void zapniSe() {
      if (cpu == null) {
         System.err.println("Počítači chybí procesor!");
         return;
      }

      if (ram == null) {
         System.err.println("Počítači chybí paměť!");
         return;
      }

      if (pevnyDisk == null) {
         System.err.println("Počítači chybí pevný disk!");
         return;
      }

      if (jeZapnuty) {
         System.err.println("Počítač je již zapnutý!");
         return;
      }
      jeZapnuty = true;
      System.out.println("Počítač se zapnul.");
   }

   public void vypniSe() {
      if (!jeZapnuty) {
         return;
      }
      jeZapnuty = false;
      System.out.println("Počítač se vypnul.");
   }

   public void vytvorSouborOVelikosti(long velikost) {
      if (!jeZapnuty) {
         return;
      }
      pevnyDisk.setVyuziteMisto(velikost);

   }
   public void vymazSouboryOVelikosti(long velikost) {
      if (!jeZapnuty) {
         return;
      }
      pevnyDisk.setVyuziteMisto(-velikost);
   }

   /*
   Vylepšete třídu `Pocitac` o metody:

           * `public void vytvorSouborOVelikosti(long velikost)`
           * `public void vymazSouboryOVelikosti(long velikost)`

   Metoda `vytvorSouborOVelikosti(long velikost)` zvýší proměnnou `vyuziteMisto` o `velikost` (pozor, nebude měnit přímo proměnnou `vyuziteMisto`,
   ta je privátní, takže se k ní nedostane – použije na její změnu odpovídající setter). Setter `setVyuziteMisto` zkontroluje, zda se nepokoušíme
   využít více místa, než je kapacita disku (`vyuziteMisto > kapacita`). Pokud by se už nově vytvářený soubor na disk nevešel,
   setter vypíše chybu a `vyuziteMisto` se nebude měnit. Metoda `vymazSouboryOVelikosti(long velikost)` sníží proměnnou
`vyuziteMisto` o `velikost`. Property `vyuziteMisto` nemůže klesnout pod `0`, což opět zajistí kontrola v setteru.
   ok - Metody `vytvorSouborOVelikosti` a `vymazSouboryOVelikosti` budou fungovat pouze, pokud je počítač zapnutý.

   Demonstrujte v `main(...)`, že se metody chovají, jak mají.

    */

}
