package account;

public class LimitAccount extends Account {
	private Double limit;
	public LimitAccount(Double balance) {
		super(balance);
	}
	public void settingLimit() {
		this.limit = this.getBalance() / 2;
	}
	@Override
	public Boolean extracBalance(Double money) {
		
		if (money <= this.limit ) {
			super.extracBalance(money);
			return true;
		}
		return false;
	}
	public Double getLimit() {
		return this.limit;
	}
}
