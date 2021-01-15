package mainApplication.repository;

import org.springframework.data.repository.CrudRepository;

import mainApplication.model.StudentModel;

public interface StudentRepo extends CrudRepository<StudentModel, Integer>{

}
