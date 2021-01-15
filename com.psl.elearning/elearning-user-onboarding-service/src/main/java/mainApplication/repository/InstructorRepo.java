package mainApplication.repository;

import org.springframework.data.repository.CrudRepository;

import mainApplication.model.InstructorModel;

public interface InstructorRepo extends CrudRepository<InstructorModel, Integer>{

}
