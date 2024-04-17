package section3exercise;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
//@Component
@Service
public class BusinessCalculationService {
	DataService ds;
	
	BusinessCalculationService(DataService ds)
	{
		this.ds = ds;
	}
	public int findMax()
	{
	return Arrays.stream(ds.retrieveData()).max().orElse(0);
	}
}



