package com.homework.lesson14;

import java.util.LinkedHashMap;
import java.util.Map;

/*
*
*Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в двух объектах HashMap в виде:
*Ключ: номер степени
*Значение: значение множителя
*Вывести результирующий многочлен в виде строки: ax^6 + bx^4 + cx^3 + dx + 8
*
* */
public class PolynomialSum {


   private Map<Integer, Integer> map = new LinkedHashMap<>();

   public void addCoefAndDegree(int degree, int coef) {

       map.put(degree,coef);


   }

    public  String toString() {
        StringBuilder sb = new StringBuilder();
       for (Map.Entry<Integer, Integer> pair : map.entrySet()) {


            if (pair.getValue() == 0) continue;
            else if (pair.getValue() > 0) {
                sb.append("+");
            }
            else sb.append("-");


            if (pair.getKey() == 0) {
                sb.append(Math.abs(pair.getValue()));
            }
            else {

                if (Math.abs(pair.getValue()) != 0) {
                    sb.append(Math.abs(pair.getValue()));
                }


                if (pair.getKey() == 0 ) {
                    sb.append("x");
                }
                else {
                    sb.append("x^").append(pair.getKey());
                }
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {



      PolynomialSum polyOne = new PolynomialSum();
      PolynomialSum polyTwo = new PolynomialSum();
      polyOne.addCoefAndDegree(3,-5);
      polyOne.addCoefAndDegree(2,-1);

      polyTwo.addCoefAndDegree(1,3);
      polyTwo.addCoefAndDegree(2,3);


        addPolynominal(polyOne,polyTwo);

    }



    public static void addPolynominal (PolynomialSum one, PolynomialSum two) {

        System.out.println(one + "" + two);


    }

}
