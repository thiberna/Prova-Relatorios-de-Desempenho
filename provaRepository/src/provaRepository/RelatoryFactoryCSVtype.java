package provaRepository;

public class RelatoryFactoryCSVtype extends RelatoryFactory {
	
	@Override
	public iRelatory generate() {
		return new PerformanceReportToCSV();
	}
}

