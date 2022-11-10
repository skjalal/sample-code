public class Main {
  public static void main(String[] args) {
    ArithmaticClass arithmaticClass = new ArithmaticClass(10, 20);
    System.out.println(arithmaticClass.add());
    System.out.println(arithmaticClass.multiply());

    StringOprtation stringOprtation = new StringOprtation();
    System.out.println(stringOprtation.toUppercase("java"));
  }
}
