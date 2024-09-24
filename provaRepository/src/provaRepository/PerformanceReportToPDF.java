package provaRepository;

public class PerformanceReportToPDF implements iRelatory {
	
	@Override
	public void generatePerformanceReport(String content) {
		System.out.println("Relatório gerado em formato PDF em: relatory.pdf" + content.toString() );
	}
}

