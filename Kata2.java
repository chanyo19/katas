package uk.ac.wlv.cs5006.kata2;
/**
 * 
 * @author Dinindu Chandimal Marasinghe 
 *
 */
public class Kata2 {
    /**
     * @param args
     */
    public static double evaluate(String statement) {
        double total = 0;

        try {
            String[] statementArray = statement.split(" ");
            if (statementArray.length != 5) {
                return total;
            }
            double numberOne = Double.parseDouble(statementArray[0]);
            double numberTwo = Double.parseDouble(statementArray[2]);
            double numberThree = Double.parseDouble(statementArray[4]);


            if (!(numberOne == 0 || numberTwo == 0 || numberThree == 0)) {
                
                total = calculate(calculate(numberOne, numberTwo, statementArray[1]), numberThree, statementArray[3]);

            }

        } catch (Exception ex) {

            System.out.println("Error :- " + ex);
        }

        return total;
    }
    private static double calculate( double numberOne, double numberTwo,String operator) {
        double total = numberOne;
        if (operator.equals("+")) {
            total += numberTwo;
        } else if (operator.equals("-")) {
            total -= numberTwo;
        } else if (operator.equals("*")) {
            total *= numberTwo;
        } else if (operator.equals("/")) {
            total /= numberTwo;
        } else {
            return 0;
        }
        return total;
    }
}
