package modulo7_5_7_6_actividad02;

public class Actividad02 {
  static class Cell {
    private boolean isOpen;

    void setIsOpen(boolean isOpen) {
      this.isOpen = isOpen;
    }
  }

  public static void main(String[] args) {
    Cell cell = new Cell();
    cell.setIsOpen(true);
    System.out.println("Abierta: " + cell.isOpen);
  }
}
