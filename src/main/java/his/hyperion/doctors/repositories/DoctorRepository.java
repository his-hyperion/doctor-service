package his.hyperion.doctors.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import his.hyperion.doctors.models.Doctor;

public interface DoctorRepository extends MongoRepository<Doctor, String> {

}
