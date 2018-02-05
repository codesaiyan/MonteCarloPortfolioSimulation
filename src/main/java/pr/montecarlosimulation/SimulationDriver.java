package pr.montecarlosimulation;

import java.util.ArrayList;
import java.util.Arrays;

public class SimulationDriver {

	public static void main(String[] args) {
		PortfolioStats aggressive = new PortfolioStats("Aggressive", 0.094324, 0.15675, 100000);
		PortfolioStats veryConservative = new PortfolioStats("Very Conservative", 0.06189, 0.063438, 100000);

		// Making sure that the data is ordered in the list with respect to the
		// portfolio types
		ArrayList<PortfolioStats> portfolios = new ArrayList<PortfolioStats>(
				Arrays.asList(aggressive, veryConservative));

		PortfolioSimulator simulator = new PortfolioSimulator(portfolios);
		simulator.runSimulator();

		System.out.println(aggressive);
		System.out.println(veryConservative);
	}

}
