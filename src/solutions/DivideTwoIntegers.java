package solutions;

public class DivideTwoIntegers {

    public static void main(String[] args) {
        DivideTwoIntegers sut = new DivideTwoIntegers();
        sut.divide(234343924, 3242);
    }

    public int divide(int dividend, int divisor) {
        int sign = ((divisor < 0 && dividend > 0) || (dividend < 0 && divisor >0)) ? -1 : 1;
        long lDividend = (long) Math.abs(dividend);
        long lDivisor = (long) Math.abs(divisor);

        if (lDivisor == 0) return Integer.MAX_VALUE;
        if (lDividend == 0 || lDividend < lDivisor) return 0;
        long val = ldivide(lDividend, lDivisor);
        if (val > Integer.MAX_VALUE) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return (int) (sign == 1 ? val : -val);
    }

    private long ldivide(long ldividend, long ldivisor) {
        if (ldividend < ldivisor) return 0;
        long sum = ldivisor;
        long mul = 1;
        while ((sum + sum) <= ldividend) {
            sum += sum;
            mul += mul;
        }

        return mul + ldivide(ldividend - sum, ldivisor);
    }


}
