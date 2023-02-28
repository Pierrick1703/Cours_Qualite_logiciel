package Money;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class testMoney{


    /*
    * assertEquals ou assertNotEquals avec minimum 2 paramètres attendu et le test
    * assertArrayEquals ou assertArrayNotEquals avec un tableau et minimum 2param résultat attendu et l'action faite
    *
    * */
    @Test
    @DisplayName("Test si un objet Money est correcte")
    void testAssertTrue(){
        Money m = new Money(100,"USD");
        assertTrue(m.currency().compareTo("EUR") == 0  || m.currency().compareTo("USD") == 0 ||
                m.currency().compareTo("CHF") == 0 || m.currency().compareTo("GBP") == 0, "Erreur de currency");
    }

    @Test
    @DisplayName("Test si la function amount ramène bien la bonne valeur")
    void testAssertEqual(){
        Money m = new Money(200,"USD");
        assertEquals(200,m.amount(),"Amount incorrect");
    }

    @Test
    @DisplayName("Test de la fonction add avec en param un objet")
    void testAssertEqual2(){
        Money m = new Money(100,"USD");
        Money n = new Money(200,"USD");
        assertEquals(300,m.add(n).amount());
        assertEquals(500,n.add(m).amount());//ajout de 200 par rapport au début a cause de la ligne 37
    }

    @Test
    @DisplayName("Test de la fonction add avec en param un objet")
    void testAssertEqual3() {
        Money m = new Money(100, "USD");
        Money n = new Money(200, "USD");
        Money o = new Money(-200, "USD");
        Money p = new Money(-200, "USD");
        assertEquals(0, o.add(n).amount());
        assertEquals(-100, p.add(m).amount());
    }

    @Test
    @DisplayName("Test de la fonction add avec en param une devise et un montant")
    void testAssertEqual4(){
        Money m = new Money(100,"USD");
        Money n = new Money(200, "USD");
        assertEquals(300,m.add(200,"USD").amount());
        assertEquals(-200,n.add(-400,"USD").amount());
    }

    @Test
    @DisplayName("Test de la conversion du moneyBag")
    void testConversionAssertEquals(){
        MoneyBag m = new MoneyBag();
        Money n = new Money(200,"GBP");
        Money o = new Money(400,"EUR");
        //Conversion en GBP
        assertEquals((int)1.20*200,m.converter(n.amount(),n.currency()));
        //Conversion en Euro
        assertEquals((int)1.06*400,m.converter(o.amount(),o.currency()));
    }

    @Test
    @DisplayName("Test add du MoneyBag")
    void testAdd(){
        MoneyBag m = new MoneyBag(200);
        Money n = new Money(200,"GBP");
        Money o = new Money(400,"EUR");
        int numTest;
        int numTest2;
        numTest = (int) (m.getmAmount()+(n.amount()*1.20));
        numTest2 = (int) (m.getmAmount()+(o.amount()*1.06));
        assertEquals(numTest,m.add(n));
        assertEquals(numTest2,m.add(o));
    }

    @Test
    @DisplayName("Test sub du MoneyBag")
    void testSub(){
        MoneyBag m = new MoneyBag(200);
        Money n = new Money(200,"GBP");
        Money o = new Money(400,"EUR");
        int numTest;
        int numTest2;
        numTest = (int) (m.getmAmount()-(n.amount()*1.20));
        numTest2 = (int) (m.getmAmount()-(o.amount()*1.06));
        assertEquals(numTest,m.sub(n));
        assertEquals(numTest2,m.sub(o));
    }
}
