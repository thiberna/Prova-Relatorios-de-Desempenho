package provaRepository;

public class testcontext {

	public static void main(String[] args) {
		RelatoryService service = new RelatoryService();
		
		service.generateRelatory(new RelatoryFactoryPDFtype(), "\ncompetency 1: satisfaction 0 \ncompetency 2: satisfaction 3...\n");

		service.generateRelatory(new RelatoryFactoryCSVtype(), "\ncompetency 1: satisfaction 0 \ncompetency 2: satisfaction 3...\n");

		service.generateRelatory(new RelatoryFactoryEXCELtype(), "\ncompetency 1: satisfaction 0 \ncompetency 2: satisfaction 3...\n");
	}

}
