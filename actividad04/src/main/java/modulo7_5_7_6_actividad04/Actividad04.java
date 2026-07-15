package modulo7_5_7_6_actividad04;

public class Actividad04 {
  static class Prisoner {
    static int prisonerCount;

    Prisoner() {
      prisonerCount++;
    }
  }

  public static void main(String[] args) {
    Prisoner p01 = new Prisoner();
    Prisoner p02 = new Prisoner();
    System.out.println("Prisioneros: " + p01.prisonerCount);
  }
}
