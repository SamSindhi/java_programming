class ComplexMain {
    public static void main(String[] args) {
        Complex initialNumber = new Complex(2, 3);
        Complex additionalNumber = new Complex(4,5);
        String number = initialNumber.getComplex();
        System.out.println(number);
        initialNumber.WriteLineComplex();
        initialNumber.add(additionalNumber);
        initialNumber.WriteLineComplex();
        initialNumber.div(additionalNumber);
        initialNumber.WriteLineComplex();

        Complex divide = new Complex(2,3);
        Complex divider = new Complex(4,0);
        divide.div(divider);
        divide.WriteLineComplex();

        Complex reciprocate = new Complex(4,3);
        reciprocate.reciprocate();
        reciprocate.WriteLineComplex();
    }
}
