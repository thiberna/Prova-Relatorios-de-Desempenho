package provaRepository;

public class RelatoryFactoryPDFtype extends RelatoryFactory {
	
	@Override
	public iRelatory generate() {
		return new PerformanceReportToPDF();
	}
}

