package pr.montecarlosimulation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class PortfolioSimulator {

	private ArrayList<PortfolioStats> portfolios;
	private Map<PortfolioStats, SimulatorSavedState> simulatedPortfolioData;
	private double inflation;
	private long numberOfSimulations;
	private int numberOfYears;

	// Giving the option to change the simulation settings if desired via getter and
	// setters
	public double getInflation() {
		return inflation;
	}

	public void setInflation(double inflation) {
		this.inflation = inflation;
	}

	public long getNumberOfSimulations() {
		return numberOfSimulations;
	}

	public void setNumberOfSimulations(long numberOfSimulations) {
		this.numberOfSimulations = numberOfSimulations;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public PortfolioSimulator(ArrayList<PortfolioStats> portfolios) {
		this.portfolios = portfolios;
		// default values for this simulation
		this.inflation = 0.035;
		this.numberOfYears = 20;
		this.numberOfSimulations = 10000;

		// initialize the SimulatorSavedState with the existing data in the portfolios
		this.simulatedPortfolioData = new LinkedHashMap<PortfolioStats, SimulatorSavedState>();
		for (PortfolioStats portfolioStat : portfolios) {
			SimulatorSavedState simulatorSavedState = new SimulatorSavedState(portfolioStat.getMeanReturn(),
					portfolioStat.getRiskStandardDeviation());
			simulatedPortfolioData.put(portfolioStat, simulatorSavedState);
		}

	}

	public void runSimulator() {
		for (int i = 0; i < numberOfSimulations; i++) {
			for (PortfolioStats portfolioStat : portfolios) {
				double investment = portfolioStat.getInitialInvestment();
				for (int j = 0; j < numberOfYears; j++) {
					// get next random gaussian distributed value for the portfolio mean and
					// standard deviation
					double r = simulatedPortfolioData.get(portfolioStat).getRandomGaussianDistributedValue();

					// End of year value of investment after accounting for the inflation
					investment = investment * (1 + r) * (1 - inflation);

				}
				// Save the simulation result
				simulatedPortfolioData.get(portfolioStat).saveSimulationState(investment);
			}
		}

		// Updates the portfolio data after all simulations have run
		for (PortfolioStats portfolioStat : portfolios) {
			SimulatorSavedState simulatorSavedState = simulatedPortfolioData.get(portfolioStat);
			portfolioStat.setMedianInflationAdjustedValue(simulatorSavedState.getPercentile(50));
			portfolioStat.setWorstCase10pcInflationAdjustedValue(simulatorSavedState.getPercentile(10));
			portfolioStat.setBestCase10pcInflationAdjustedValue(simulatorSavedState.getPercentile(90));
		}
	}
}
