import org.springframework.stereotype.Component;

@Component
public class mySQLDataService implements DataService {
	public int[] retrieveData()
	{
		return new int[] {1,2,3,4,5};
	}
}


