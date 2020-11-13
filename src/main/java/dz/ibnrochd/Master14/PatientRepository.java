package dz.ibnrochd.Master14;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<patients,String>{
	
	

}
