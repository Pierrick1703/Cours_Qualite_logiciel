package Exo2.utils;

import Exo2.Model.*;



public class UtilsVector {

    public static Vector unionSet(Vector a, Vector b){
        Vector result = new Vector();

        int[] values = new int[0];

        if(a.getValues().length>0 && b.getValues().length>0){
            values = new int[a.getValues().length + b.getValues().length];
        }
        else{
            throw new Error("Manque un minimum de une valeur");
        }
        result.setValues(values);
        return result;
    }
}
