package tests;

import weightlifting.WeightLifter;
import weightlifting.Championship;
import java.io. *;
import java.util. *;
import utest. *;

import java.util.Arrays;

public class Part4 extends Testable {
    private boolean checkWeightLifterLists (LinkedList <WeightLifter> list1, LinkedList <WeightLifter> list2) {
        if (list1.size ()! = list2.size ()) return false;
        int i = 0;
        while (i <list1.size () && list1.get (i) .show (). equals (list2.get (i) .show ())) ++ i;
        return (i> = list1.size ());
    }
    public void assertion () throws Exception {
        Championship cs = new Championship ("weightlifters.txt");
        check ("Championship.round: the method does not return the correct weight.", cs.round (). show (). equals ("Aleksey Petrov - 9 kg"));
        check ("Championship.round: the method does not block the list.", cs.numberOfWeightLifters () == 4);
        check ("Championship.round: the method does not leave good weights in the list.", cs.show (). equals ("Ivan Ivanov - 120 kg \ nFoldi Imre - 137 kg \ nPablo Lara - 25 kg \ nKoji Miki - 137 kg "));
        cs.round (); cs.round ();
        check ("Championship.round: the method does not return the correct weight if it has the same strength as the weakest.", cs.round (). show (). equals ("Imre Foldi - 137 kg"));
        check ("Championship.round: the method shifts the appropriate weight if the weakest is the same strength.", cs.show (). equals ("Koji Miki - 137 kg"));
        check ("Championship.round: the method does not return the correct weight if there was only one competitor left.", cs.round (). show (). equals ("Koji Miki - 137 kg"));
        check ("Championship.round: the method clears the list when the competitors run out.", cs.show (). equals (""));
        check ("Championship.round: the method does not work well if there are no weights.", cs.round () == null);
        check ("Championship.round: the method does not work well if there are no weights.", cs.show (). equals (""));
        cs = new Championship ("weightlifters.txt");
        LinkedList <WeightLifter> expectedWeightLifters = new LinkedList <WeightLifter> ();
        expectedWeightLifters.add (WeightLifter.make ("Aleksey Petrov", 9));
        expectedWeightLifters.add (WeightLifter.make ("Pablo Lara", 25));
        expectedWeightLifters.add (WeightLifter.make ("Ivan Ivanov", 120));
        expectedWeightLifters.add (WeightLifter.make ("Foldi Imre", 137));
        expectedWeightLifters.add (WeightLifter.make ("Koji Miki", 137));
        check ("Championship.championship: the method returns an incorrect list.", checkWeightLifterLists (cs.championship (), expectedWeightLifters));
        check ("Championship.championship: the method does not clear the list.", cs.numberOfWeightLifters () == 0);
        check ("Championship.championship: the method does not work well if there are no weights.", cs.championship (). isEmpty ());
    }

    public String description () {return "4. resz"; }
    public String className () {return "weightlifting.Championship"; }

    public Object [] expectedMethods () throws Exception {
        return new Object []
            {constructor (className (), new Class [] {String.class})
            , optionalMethod (className () + ".numberOfWeightLifters")
            , optionalMethod (className () + ".show")
            , optionalMethod (className () + ".strongerThan", weightlifting.WeightLifter.class)
            , optionalMethod (className () + ".average")
            , method (className () + ".round")
            , method (className () + ".championship")
            };
    }

    public static void main (String ... args) {
        Test.main (new Part4 ());
    }
}