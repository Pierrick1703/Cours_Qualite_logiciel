package Money;

public class Money {
    private int fAmount;
    private String fCurrency;

    public Money(int Amount, String Currency){
        this.fAmount = Amount;
        this.fCurrency = Currency;
    }
    public int amount(){
        return this.fAmount;
    }
    public String currency(){
        return this.fCurrency;
    }
    public Money add(Money m){
        if(this.fCurrency.compareTo(m.currency()) == 0){
            this.fAmount = this.fAmount + m.amount();
        }else{
            throw new Error("Pas la même devise");
        }
        return this;
    }

    public Money add(int nAmount, String nCurrency){
        if(this.fCurrency.compareTo(nCurrency) == 0){
            this.fAmount = this.fAmount+nAmount;
        }else{
            throw new Error("Pas la même devise");
        }
        return this;
    }
}