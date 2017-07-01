package his.hyperion.doctors.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import his.hyperion.doctors.models.Doctor;
import his.hyperion.doctors.repositories.DoctorRepository;

@RestController
@CrossOrigin
public class DoctorController {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@RequestMapping(value = "/doctors", method = RequestMethod.POST)
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	
	@RequestMapping(value = "/doctorsbulk", method = RequestMethod.POST)
	public List<Doctor> addDoctors(@RequestBody List<Doctor> doctor) {
		return doctorRepository.save(doctor);
	}
	
	@RequestMapping(value = "/doctors", method = RequestMethod.GET)
	public List<Doctor> getDoctors() {
		return doctorRepository.findAll();
	}
}
