package modulo7_5_7_6_actividad01;

public class Actividad01 {
  static class Cell {
    private String name = "A1";
    private boolean isOpen = false;

    String getName() {
      return name;
    }

    boolean getIsOpen() {
      return isOpen;
    }
  }

  public static void main(String[] args) {
    Cell cell = new Cell();
    System.out.println("Celda: " + cell.name);
    System.out.println("Abierta: " + cell.isOpen);
  }
}
