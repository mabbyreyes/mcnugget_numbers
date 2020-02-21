package edu.cnm.deepdive;

public class Frobenius {

  /* Pack sizes are 6, 9, and 20. */
  public static boolean isMcNugget(int value) {
    // TODO Return true if value can be expressed as the sum of integral multiples (including
    //  multiplication by zero) of the 3 original McNugget pack sizes; return false otherwise.
      return (value >= 0)
          && (
              value == 0
                  || isMcNugget(value - 6)
                  || isMcNugget(value - 9)
                  || isMcNugget(value - 20)
      );
  }

  /**
   * Return true if the stated value can be formed as a sum of non-negative integral multiples of
   * the elements of packSizes.
   * @param value target/goal number.
   * @param packSizes array of distinct, positive pack sizes, in descending order.
   * @return true if value is a McNugget number using the specific pack sizes, false otherwise.
   */
  public static boolean isGeneralMcNugget(int value, int[] packSizes) {
    return false; // TODO Complete implementation for extra credit. Worth 15 points. More points for 5 tests, unit tests.
  }

}
