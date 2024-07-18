
public class RewardValue {
	private double cashValue;
	private double miles;
	
	public RewardValue(double cashValue) {
		this.cashValue = cashValue;
		this.miles = cashToMiles(cashValue);
	
	}
	
	public RewardValue(double milesValue, boolean isMiles) {
        this.miles = milesValue;
        this.cashValue = milesToCash(milesValue);
    }
	
	public double getCashValue() {
		return cashValue;
	}
	
	public double getMilesValue() {
		return miles;	
	}
	
	public double cashToMiles(double cashValue) {
		return cashValue / 0.0035;
	}
	
	public double milesToCash(double miles) {
		return miles * 0.0035;
	}

}
