package com.homework.lesson14;

import java.util.LinkedHashMap;
import java.util.Map;

public class PolynomialSum {


   private Map<Integer, Integer> map = new LinkedHashMap<>();

   public void addCoefAndDegree(int degree, int coef) {

       map.put(degree,coef);


   }

    public String toString(){

       StringBuilder stb = new StringBuilder();

       for (Map.Entry<Integer, Integer> pair : map.entrySet()) {

          stb.append(pair.getValue()).append("x^").append(pair.getKey().toString());

       }

       return stb.toString();
   }


    public static void main(String[] args) {



      PolynomialSum polyOne = new PolynomialSum();
      PolynomialSum polyTwo = new PolynomialSum();
      polyOne.addCoefAndDegree(3,-5);
      polyOne.addCoefAndDegree(2,-1);

      polyTwo.addCoefAndDegree(1,3);
      polyTwo.addCoefAndDegree(2,3);

        System.out.println(polyOne);

        addPolynominal(polyOne,polyTwo);

    }



    public static void addPolynominal (PolynomialSum one, PolynomialSum two) {

        System.out.println(one + " + " + two);


    }

}
