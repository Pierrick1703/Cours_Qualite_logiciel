package Money;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class MoneyBag {

    private int mAmount;
    private Map<String, Double> mCurrency = new HashMap<>(){
        {
            put("EUR", 1.06);
            put("USD", 1.00);
            put("CHF", 1.07);
            put("GBP", 1.20);
        }};

    public MoneyBag(){
    }
    public MoneyBag(int amount){
        this.mAmount = amount;
    }

    public void setmAmount(int amount){
        this.mAmount = amount;
    }

    public int getmAmount(){
        return this.mAmount;
    }


    public int converter(int amount, String currency){
        int resultAmount = 0;
        if(this.mCurrency.containsKey(currency)){
            resultAmount = (int) (amount*mCurrency.get(currency));
        }
        return resultAmount;
    }

    public int add(Money money){
        int resultAmount;
        resultAmount = converter(money.amount(),money.currency()) + this.mAmount;
        return resultAmount;
    }

    public int sub(Money money){
        int resultAmount;
        resultAmount = converter(money.amount(),money.currency()) - this.mAmount;
        return resultAmount;
    }
}
