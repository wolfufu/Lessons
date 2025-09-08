package complex;

import java.util.Objects;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComplexNumber other = (ComplexNumber) obj;
        return Double.compare(other.re, re) == 0 &&
                Double.compare(other.im, im) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long reBits = Double.doubleToLongBits(re);
        long imBits = Double.doubleToLongBits(im);
        result = 31 * result + (int) (reBits ^ (reBits >>> 32));
        result = 31 * result + (int) (imBits ^ (imBits >>> 32));
        return result;
    }
}
