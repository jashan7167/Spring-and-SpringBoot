package section3exercise;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class mySQLDataService implements DataService {
	public int[] retrieveData()
	{
		return new int[] {1,2,3,4,5};
	}
}


