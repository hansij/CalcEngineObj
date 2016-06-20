package com.pluralsight.calcengineobj;

public class Main {

    public static void main(String[] args) {

//        MathEquation testEquation = new MathEquation();
//        testEquation.execute();
//        System.out.print("test = ");
//        System.out.println(testEquation.getResult());

        System.out.println();
        System.out.println("Using Method execute()");
        System.out.println();

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtracter(225.0d, 17.0d),
                new Multiplier(11.0d, 3.0d)
        };

        for (CalculateBase calculator:calculators) {
            calculator.calculate();
            System.out.print("result = ");
            System.out.println(calculator.getResult());

        }
    }
}
