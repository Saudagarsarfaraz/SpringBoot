package in.synerzip.beans;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReport implements Ireport{
    public ExcelReport(){
    	System.out.println("Constructor :: Excel");
    }
    
	@Override
	public void generate() {
		System.out.println("Excel Report");
	}
}
