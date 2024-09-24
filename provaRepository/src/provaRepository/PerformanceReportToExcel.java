package provaRepository;

public class PerformanceReportToExcel implements iRelatory {
	
	@Override
	public void generatePerformanceReport(String content) {
		System.out.println("Relatório gerado em arquivo Excel em: relatory.xlsx" + content.toString() );
	}
}

