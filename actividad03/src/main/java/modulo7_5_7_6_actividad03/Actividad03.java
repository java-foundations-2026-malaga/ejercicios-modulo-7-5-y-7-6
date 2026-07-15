package modulo7_5_7_6_actividad03;

public class Actividad03 {
  static class Prisoner {
    int bookingNumber = 1;

    static void display() {
      System.out.println("Reserva: " + bookingNumber);
    }
  }

  public static void main(String[] args) {
    Prisoner.display();
  }
}
