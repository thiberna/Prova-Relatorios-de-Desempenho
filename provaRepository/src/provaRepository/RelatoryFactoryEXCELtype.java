package provaRepository;

public class RelatoryFactoryEXCELtype extends RelatoryFactory {
	
	@Override
	public iRelatory generate() {
		return new PerformanceReportToExcel();
	}
}

