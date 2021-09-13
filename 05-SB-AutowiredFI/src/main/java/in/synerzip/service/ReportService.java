package in.synerzip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.synerzip.util.DateUtil;

@Service
public class ReportService {
	
	@Autowired
	private DateUtil dateUtil;
	
	public void generateReport() {
        System.err.println("Report Generated at :"+dateUtil.date());	
	}

}
