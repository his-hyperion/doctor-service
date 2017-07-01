package his.hyperion.doctors.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import his.hyperion.doctors.models.Patient;

public interface PatientRepository extends MongoRepository<Patient, String> {
	
}
