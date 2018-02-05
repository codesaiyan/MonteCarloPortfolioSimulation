# MonteCarloPortfolioSimulation
This java project compares two sample portfolios and simulates their performance over a period of 20 years using the Monte Carlo Simulation technique. An excellent description of the technique can be found at : https://www.youtube.com/watch?v=Q5Fw2IRMjPQ 

| Portfolio Type | Return (Mean) | Risk ( Standard Deviation)  |
| ------------- |:-------------:| -----|
| Aggressive      | 9.4324% | 15.675 |
| Very Conservative | 6.189% | 6.3438 |

Assuming the user allocated $100,000 to each portfolio, we run 10,000 simulations over a projected time period of 20 years assuming an adjusted inflation rate of 3.5% each year.

The goal of the project is to obtain the Median 20 Year, 10% Best case (90th Percentile value among the 10,000 simulations) and the 10% worst case (10th Percentile value among the 10,000 simulations) values of the two portfolios.

## Assumptions
1. We would like to use a random number generator to ensure Gaussian distribution of random numbers that are generated.
2. 20th Year future value should be inflation adjusted at the rate of 3.5% each year. Ie. Year 1 value of 103.5 is equivalent to 100 at Year 0.

## Getting Started
Kindly execute the SimulationDriver.java main file to run the simulations and check the results in the console.

### Prerequisites
 - JDK    
- Maven  

## Running the tests

Run the test by executing the SimulationDriver.java file. 

## Built With

* [Spring Boot](https://projects.spring.io/spring-boot/)
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Pranav Rao** - *Initial work*

