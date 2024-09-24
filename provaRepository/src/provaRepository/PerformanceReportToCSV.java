package provaRepository;

public class PerformanceReportToCSV implements iRelatory {
	
	@Override
	public void generatePerformanceReport(String content) {
		System.out.println("Relatório gerado em formato CSV em: relatory.csv" + content.toString() );
	}
}

