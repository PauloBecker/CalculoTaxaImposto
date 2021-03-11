package entities;

public class Company extends TaxPayer{
	
	
	private int numberOfEmploye;
	
	public Company() {
	}
	
	

	public Company(String name, Double annualIncome, int numberOfEmploye) {
		super(name, annualIncome);
		this.numberOfEmploye = numberOfEmploye;
	}


	

	public int getNumberOfEmploye() {
		return numberOfEmploye;
	}



	public void setNumberOfEmploye(int numberOfEmploye) {
		this.numberOfEmploye = numberOfEmploye;
	}



	@Override
	public Double tax() {
		if(numberOfEmploye > 10) {
			
			return getAnnualIncome() * 0.14;
			
		}else {
			
			return getAnnualIncome() * 0.16;
		}
	}

}
