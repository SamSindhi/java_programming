
class Complex {
	double re = 0;
	double im = 0;

	double abs() {
		return Math.sqrt(re*re + im*im);
	}

	void add(Complex that) {
		re += that.re;
		im += that.im;
	}

	void substract(Complex that) {
		re -= that.re;
		im -= that.im;
	}

	void mul(Complex that) {
		double newRe = this.re * that.re - this.im * that.im;
		double newIm = this.re * that.im - this.im * that.re;
		re = newRe;
		im = newIm;
	}
	
}
