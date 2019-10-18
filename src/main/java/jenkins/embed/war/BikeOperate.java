package jenkins.embed.war;

import org.springframework.data.repository.CrudRepository;

public interface BikeOperate extends CrudRepository<Bikes, Integer>
{
	
}
