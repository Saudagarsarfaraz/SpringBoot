package in.synerzip.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class IreportService {
    
	private Ireport ireport;

	@Autowired
	public IreportService(@Qualifier("excel") Ireport ireport) {

		this.ireport = ireport;
	}
	
	public void generateReport() {
		ireport.generate();
		System.out.println("Report Generated");
		
	}
	
	
	
	
}
