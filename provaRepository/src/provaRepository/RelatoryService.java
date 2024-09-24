package provaRepository;

public class RelatoryService {

	public void generateRelatory(RelatoryFactory factory, String content) {
		iRelatory relatory = factory.generate();
		relatory.generatePerformanceReport(content);
	}
	
}
