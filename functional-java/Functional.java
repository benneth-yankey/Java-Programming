
import java.util.function.ToIntBiFunction;

class Functional {
  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> adder = calculator("subtract");
  }

  // operations enum
  static enum Operation {
    ADD, SUBTRACT, EXPONENT, MULTIPLY,
  }

  static ToIntBiFunction<Integer, Integer> add = (a, b) -> a + b;

  static ToIntBiFunction<Integer, Integer> subtract = (a, b) -> a - b;

  static ToIntBiFunction<Integer, Integer> calculator(String op) {
    if (op.equals(Operation.ADD.name())) {
      return add;
    } else if (op.equals(Operation.SUBTRACT.name())) {
      return add;
    } else if (op.equals(Operation.MULTIPLY.name())) {
      return add;
    } else if (op.equals(Operation.EXPONENT.name())) {
      return add;
    }
    return null;
  }
}