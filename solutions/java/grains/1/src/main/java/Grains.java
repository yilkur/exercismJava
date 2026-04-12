import java.math.BigInteger;

class Grains {
    BigInteger grainsOnSquare(final int square) {
        if (square > 0 && square <= 64) {
            return BigInteger.TWO.pow(square - 1);
        }

        throw new IllegalArgumentException("square must be between 1 and 64");
    }

    BigInteger grainsOnBoard() {
        BigInteger result = BigInteger.TWO.pow(64);
        return result.subtract(BigInteger.ONE);
    }
}
