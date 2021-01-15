package mainApplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mainApplication.model.UserClaimsModel;

@Repository
public interface UserClaimRepo extends CrudRepository<UserClaimsModel, Integer> {

	public boolean existsBysub(String string);


}
