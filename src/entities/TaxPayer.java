package entities;

public class TaxPayer {
	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;
	
	private Double salaryTax;
	private Double servicesTax;
	private Double capitalTax;
	private Double grossTax;
	private Double taxRebate;
	private Double netTax;
	
	public TaxPayer() {
	}
	
	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
	
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}
	
	public Double getSalaryTax() {
		double month = salaryIncome / 12;
		if (month >= 3000.00 && month < 5000.00) {
			return salaryTax = salaryIncome * 0.10;
		}
		else if (month >= 5000) {
			return salaryTax = salaryIncome * 0.20;
		}
		else {
			return salaryTax;
		}
	}
	
	public Double getServicesTax() {
		return servicesTax = servicesIncome * 0.15;
	}
	
	public Double getCapitalTax() {
		return capitalTax = capitalIncome * 0.20;
	}

	public Double getGrossTax() {
		return grossTax = getSalaryTax() + getServicesTax() + getCapitalTax();
	}
	
	public Double getTaxRebate() {
		Double porcentagem = grossTax * 0.3;
		if (healthSpending + educationSpending <= porcentagem) {
			return taxRebate = healthSpending + educationSpending;
		}
		else if(healthSpending + educationSpending > porcentagem){
			return taxRebate = porcentagem;
		}
		return taxRebate;
	}
	
	public Double getNetTax() {
		return netTax = getGrossTax() - getTaxRebate();
	}
	
	
	
}





















