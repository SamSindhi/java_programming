package tests;

import weightlifting.WeightLifter;
import utest. *;

import java.util.Arrays;

public class Part1 extends Testable {
    public void assertion () {
        check ("WeightLifter.getStrongestWeightLifter: the method must return null if no WeightLifter object was created.", WeightLifter.getStrongestWeightLifter () == null);
        WeightLifter wl1 = WeightLifter.make ("A", 15);
        check ("WeightLifter.make: also creates the object for the name tul rovid.", wl1 == null);
        wl1 = WeightLifter.make ("ABC", -5);
        check ("WeightLifter.make: also creates the object with a negative weight.", wl1 == null);
        wl1 = WeightLifter.make ("ABC", 0);
        check ("WeightLifter.make: also creates the object with a zero value weight.", wl1 == null);
        wl1 = WeightLifter.make ("ABC", 301);
        check ("WeightLifter.make: creates the object with a very large weight.", wl1 == null);
        wl1 = WeightLifter.make ("AB, C", 200);
        check ("WeightLifter.make: also creates the object with a name that contains an illegal character.", wl1 == null);
        wl1 = WeightLifter.make ("Ivan Ivanov", 120);
        check ("WeightLifter.make: does not create the object with the correct parameters.", wl1! = null);
        check ("WeightLifter.getWeight: method does not return correct data.", wl1.getWeight () == 120);
        WeightLifter wl2 = WeightLifter.make ("Foldi Imre", 137);
        check ("WeightLifter.strongerThan: method does not return correct data.",! wl1.strongerThan (wl2));
        check ("WeightLifter.strongerThan: method does not return correct data.", wl2.strongerThan (wl1));
        check ("WeightLifter.show: the method does not return correct data with a three-digit weight.", wl1.show (). equals ("Ivan Ivanov - 120 kg"));
        WeightLifter wl3 = WeightLifter.make ("Pablo Lara", 25);
        check ("WeightLifter.show: the method does not return correct data with a two-digit weight.", wl3.show (). equals ("Pablo Lara - 25 kg"));
        WeightLifter wl4 = WeightLifter.make ("Aleksey Petrov", 9);
        check ("WeightLifter.show: the method does not return correct data with a one-digit weight.", wl4.show (). equals ("Aleksey Petrov - 9 kg"));
        check ("WeightLifter.getStrongestWeightLifter: the method does not return the strongest WeightLifter object ever created.", WeightLifter.getStrongestWeightLifter (). show (). equals (wl2.show ()));
        WeightLifter wl5 = WeightLifter.make ("Koji Mickey", 137);
        check ("WeightLifter.strongerThan: the method does not return correct data with weights of equal strength.",! wl5.strongerThan (wl2));
        check ("WeightLifter.strongerThan: the method does not return correct data with weights of equal strength.",! wl2.strongerThan (wl5));
        check ("WeightLifter.getStrongestWeightLifter: if it has the same strength as the strongest weightlift ever created, the method should return the earliest one created.", WeightLifter.getStrongestWeightLifter (). show (). equals (l) ;
    }

    public String description () {return "1st res"; }
    public String className () {return "weightlifting.WeightLifter"; }

    public Object [] expectedMethods () throws Exception {
        return new Object []
            {constructor (className (), new Class [] {String.class, Integer.TYPE})
            , staticMethod (className () + ".make", String.class, Integer.TYPE)
            , method (className () + ".getWeight")
            , method (className () + ".strongerThan", weightlifting.WeightLifter.class)
            , method (className () + ".show")
            , staticMethod (className () + ".getStrongestWeightLifter")
            };
    }

    public static void main (String ... args) {
        Test.main (new Part1 ());
    }
}