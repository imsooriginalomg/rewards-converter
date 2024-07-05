public class RewardValue{

    private int miles_value;
    private double cash_value;

    public RewardValue(int miles_value){
        this.miles_value = miles_value;
        this.cash_value = miles_value * 0.0035;
    }

    public RewardValue(double cash_value){
        this.cash_value = cash_value;
        this.miles_value = (int)(cash_value/0.0035);
    } 

    public double getCashValue(){
        return cash_value;
    }

    public int getMilesValue(){
        return miles_value;
    }
}