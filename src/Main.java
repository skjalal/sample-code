import java.util.List;

public class Main {
  public static void main(String[] args) {
//    ArithmaticClass arithmaticClass = new ArithmaticClass(10, 20);
//    System.out.println(arithmaticClass.add());
//    System.out.println(arithmaticClass.multiply());
//    System.out.println(arithmaticClass.substract());
//
//    StringOprtation stringOprtation = new StringOprtation();
//    System.out.println(stringOprtation.toUppercase("java"));

    ArithmaticClass[] arrays = {new ArithmaticClass(10, 20), new ArithmaticClass(30, 20), new ArithmaticClass(40, 20)};
//    for(int i=0;i<arrays.length;i++) {
//      ArithmaticClass obj = arrays[i];
//      System.out.println(obj.add());
//    }
    for(ArithmaticClass obj : arrays) {
      //System.out.println(obj.add());
    }

    int[] numbers = {10, 20, 40};
    for(Integer num : numbers) {
      //System.out.println(num);
    }

    List.of(arrays).forEach(o -> System.out.println(o.add()));
  }
}
