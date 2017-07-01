package his.hyperion.doctors.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import his.hyperion.doctors.models.Doctor;
import his.hyperion.doctors.models.Patient;
import his.hyperion.doctors.repositories.DoctorRepository;
import his.hyperion.doctors.repositories.PatientRepository;

@RestController
@CrossOrigin
public class PatientController {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@RequestMapping(value = "/patients", method = RequestMethod.GET)
	public List<Patient> getDoctors() {
		return patientRepository.findAll();
	}
}
