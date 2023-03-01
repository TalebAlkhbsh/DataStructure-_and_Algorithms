package Homework1;

public class Home1_4 {
    static class Complex {

        private double re, im;

        public Complex(double re, double im) {
            this.re = re;
            this.im = im;
        }

        @Override
        public boolean equals(Object o) {

            if (o == this) {
                return true;
            }
            if (!(o instanceof Complex)) {
                return false;
            }

            Complex c = (Complex) o;

            return Double.compare(re, c.re) == 0
                    && Double.compare(im, c.im) == 0;
        }
    }
}

