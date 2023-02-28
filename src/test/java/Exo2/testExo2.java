package Exo2;

import Exo2.Model.Vector;
import Exo2.utils.UtilsVector;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testExo2{

        static Vector a = new Vector();
        static Vector b = new Vector();
        static Vector unionVector = new Vector();
        static String resultA = "";
        static String resultB = "";
        static String resultUnion = "";

        @BeforeAll
        static void beforeAll(){
            a.setValues(new int[]{1,2,3});
            b.setValues(new int[]{4,5,6});
        }

        /**
         * Test de l'union de deux vecteurs
         * //TODO : A compléter 🚨
         */
        @Test
        @DisplayName("Test de l'union de deux vecteurs")
        void testUnionSet(){
            unionVector = UtilsVector.unionSet(a, b);
            //-
            for(int i=0; i<a.getValues().length; i++)
                if(resultA.equals(""))
                    resultA += a.getValues()[i];
                else
                    resultA += " / " + a.getValues()[i];
            for(int i=0; i<b.getValues().length; i++)
                if(resultB.equals(""))
                    resultB += b.getValues()[i];
                else
                    resultB += " / " + b.getValues()[i];
            //-
            if(unionVector.getValues().length>0) {
                for(int i=0; i<unionVector.getValues().length; i++)
                    if(resultUnion.equals(""))
                        resultUnion += unionVector.getValues()[i];
                    else
                        resultUnion += " / " + unionVector.getValues()[i];
            }
        }

        @AfterAll
        static void afterAll(){
            System.out.println("Fin des tests");
            System.out.println("Vecteur A : " + resultA);
            System.out.println("Vecteur B : " + resultB);
            System.out.println("Vecteur Union : " + resultUnion);
        }
}