package com.homework.lesson12;


import java.math.BigDecimal;

public class DoubleIntGenerics <I extends Number>  {


    public  Number addition (I a, I b) {
        if (a instanceof Integer && b instanceof Integer) {
            System.out.println("Отработал Int");
           return a.intValue() + b.intValue();
        }
        if (a instanceof Long || b instanceof Long) {
            System.out.println("Отработал Long");
            return a.longValue() + b.longValue();
        }
        if (a instanceof Double || b instanceof Double) {
            System.out.println("Отработал Double");
            return a.doubleValue() + b.doubleValue();
        }
        if (a instanceof Float || b instanceof Float) {
            System.out.println("Отработал Float");
            return a.floatValue() + b.floatValue();
        }

        throw new RuntimeException("Incompatible type");

    }

    public  Number subtraction (I a, I b) {
        if (a instanceof Integer && b instanceof Integer) {
            System.out.println("Отработал Int");
            return a.intValue() - b.intValue();
        }
        if (a instanceof Long || b instanceof Long) {
            System.out.println("Отработал Long");
            return a.longValue() - b.longValue();
        }
        if (a instanceof Double || b instanceof Double) {
            System.out.println("Отработал Double");
            return a.doubleValue() - b.doubleValue();
        }
        if (a instanceof Float || b instanceof Float) {
            System.out.println("Отработал Float");
            return a.floatValue() - b.floatValue();
        }

        throw new RuntimeException("Incompatible type");

    }

    public <I extends BigDecimal> Number addition (I a, I b){
        if (a instanceof BigDecimal && b instanceof BigDecimal) {
            System.out.println("Отраблтал BigDecimal");
            return a.add(b);
        }
        throw new RuntimeException("Incompatible type");
    }

    public <I extends BigDecimal> Number subtraction (I a, I b){
        if (a instanceof BigDecimal && b instanceof BigDecimal) {
            System.out.println("Отраблтал BigDecimal");
            return a.subtract(b);
        }
        throw new RuntimeException("Incompatible type");
    }
}


