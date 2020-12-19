package tests;

import weightlifting.WeightLifter;
import weightlifting.Championship;
import java.io. *;
import utest. *;

import java.util.Arrays;

public class Part2 extends Testable {
    public void assertion () throws Exception {
        Championship cs1 = new Championship ("badfilename.txt");
        check ("Championship constructor: in case of incorrect filename, initialized the competitors with an empty list.", cs1.numberOfWeightLifters () == 0);
        Championship cs2 = new Championship ("weightlifters.txt");
        check ("Championship constructor: read the wrong amount of data.", cs2.numberOfWeightLifters () == 5);
        check ("Chanpionship.show: displays the object incorrectly if there are no competitors.", cs1.show (). equals (""));
        check ("Chanpionship: either the constructor rogzit erroneous data or the show method displays them incorrectly.", cs2.show (). equals ("Ivan Ivanov - 120 kg \ nFoldi Imre - 137 kg \ nPablo Lara - 25 kg \ nAleksey Petrov - 9 kg \ nKoji Miki - 137 kg "));
    }

    public String description () {return "2nd res"; }
    public String className () {return "weightlifting.Championship"; }

    public Object [] expectedMethods () throws Exception {
        return new Object []
            {constructor (className (), new Class [] {String.class})
            , method (className () + ".numberOfWeightLifters")
            , method (className () + ".show")
            , optionalMethod (className () + ".strongerThan", weightlifting.WeightLifter.class)
            , optionalMethod (className () + ".average")
            , optionalMethod (className () + ".round")
            , optionalMethod (className () + ".championship")
            };
    }

    public static void main (String ... args) {
        Test.main (new Part2 ());
    }
}