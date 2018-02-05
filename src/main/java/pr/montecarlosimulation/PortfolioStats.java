package pr.montecarlosimulation;

public class PortfolioStats {

	// Initial data
	private String portfolioType;
	private double meanReturn;
	private double riskStandardDeviation;
	private double initialInvestment;

	// Data after running Monte Carlo Simulation over a specified time period
	private double medianInflationAdjustedValue;
	private double bestCase10pcInflationAdjustedValue;
	private double worstCase10pcInflationAdjustedValue;

	public PortfolioStats(String portfolioType, double meanReturn, double riskStandardDeviation,
			double initialInvestment) {
		this.portfolioType = portfolioType;
		this.meanReturn = meanReturn;
		this.riskStandardDeviation = riskStandardDeviation;
		this.initialInvestment = initialInvestment;
	}

	public String getPortfolioType() {
		return portfolioType;
	}

	public void setPortfolioType(String portfolioType) {
		this.portfolioType = portfolioType;
	}

	public double getMeanReturn() {
		return meanReturn;
	}

	public void setMeanReturn(double meanReturn) {
		this.meanReturn = meanReturn;
	}

	public double getRiskStandardDeviation() {
		return riskStandardDeviation;
	}

	public void setRiskStandardDeviation(double riskStandardDeviation) {
		this.riskStandardDeviation = riskStandardDeviation;
	}

	public double getInitialInvestment() {
		return initialInvestment;
	}

	public void setInitialInvestment(double initialInvestment) {
		this.initialInvestment = initialInvestment;
	}

	public double getMedianInflationAdjustedValue() {
		return medianInflationAdjustedValue;
	}

	public void setMedianInflationAdjustedValue(double medianInflationAdjustedValue) {
		this.medianInflationAdjustedValue = medianInflationAdjustedValue;
	}

	public double getBestCase10pcInflationAdjustedValue() {
		return bestCase10pcInflationAdjustedValue;
	}

	public void setBestCase10pcInflationAdjustedValue(double bestCase10pcInflationAdjustedValue) {
		this.bestCase10pcInflationAdjustedValue = bestCase10pcInflationAdjustedValue;
	}

	public double getWorstCase10pcInflationAdjustedValue() {
		return worstCase10pcInflationAdjustedValue;
	}

	public void setWorstCase10pcInflationAdjustedValue(double worstCase10pcInflationAdjustedValue) {
		this.worstCase10pcInflationAdjustedValue = worstCase10pcInflationAdjustedValue;
	}

	@Override
	public String toString() {
		return "Portfolio [portfolioType=" + portfolioType + ", meanReturn=" + meanReturn + ", riskStandardDeviation="
				+ riskStandardDeviation + ", initialInvestment=" + initialInvestment + ", medianInflationAdjustedValue="
				+ medianInflationAdjustedValue + ", bestCase10pcInflationAdjustedValue="
				+ bestCase10pcInflationAdjustedValue + ", worstCase10pcInflationAdjustedValue="
				+ worstCase10pcInflationAdjustedValue + "]";
	}

}
