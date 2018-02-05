package pr.montecarlosimulation;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class SimulatorSavedState {

	private NormalDistribution normalDistribution;
	private DescriptiveStatistics descriptiveStatistics;

	public SimulatorSavedState(double mean, double stdDev) {

		this.normalDistribution = new NormalDistribution(mean, stdDev);
		this.descriptiveStatistics = new DescriptiveStatistics();
	}

	public void saveSimulationState(double result) {
		this.descriptiveStatistics.addValue(result);
	}

	public double getRandomGaussianDistributedValue() {
		return this.normalDistribution.sample();
	}

	public double getPercentile(double n) {
		return this.descriptiveStatistics.getPercentile(n);
	}

}
