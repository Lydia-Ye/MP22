public class BFCalculator {

    // +------------------+---------------------------------------------
  // | Design Decisions |
  // +------------------+
  /*
   * BFCalculator generates objects that can calculate the expressions including
   * integers and fractions.
   */

  // +--------+-------------------------------------------------------
  // | Fields |
  // +--------+

  /** The array of stored registers */
  Char[] registers[];

  /** The results that the expression evaluates to */
  BigFraction result;

  // +--------------+-------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new BFCalculator with no register and initilized result.
   * 
   */
  public BFCalculator() {
    this.registers = null;
    this.result = new BigFraction(0 , 1);
  } // BFCalculator()

  // +---------+------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Evaluate an expression given in the string, exp, ignoring priority
   */
  public BigFraction evaluate(String exp) {
    // store the elements in string into an array
    String[] expValues = exp.split(" ");

    for (int i = 0; i  < expValues.length(); i += 2) {
      // check if the values are fraction or integer
      

    } // for

    BigInteger strNum = new BigInteger(numStr[0]);
    BigInteger strDenom = new BigInteger(numStr[1]);

  } // evaluate(String exp)


  /**
   * Store the last value computed in the named register
   */
  public void store(char register) {

  } //store(char register)
} // class BFCalculator

