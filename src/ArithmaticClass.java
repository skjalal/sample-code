public class ArithmaticClass {

  private final int num1;
  private final int num2;

  public ArithmaticClass(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  public int add() {
    return num1 + num2;
  }

  public int multiply() {
    return num1 * num2;
  }

  public int substract() {
    return num1 - num2;
  }
}
