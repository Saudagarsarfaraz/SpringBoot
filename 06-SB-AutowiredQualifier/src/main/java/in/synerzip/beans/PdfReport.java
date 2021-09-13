package in.synerzip.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfReport implements Ireport {

    public PdfReport() {
		System.out.println("constructor :: PdfReport");
	}
	
	@Override
	public void generate() {
		System.out.println("Pdf Report");

	}

}
