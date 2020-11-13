package dz.ibnrochd.Master14;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Master14Tp10Application implements CommandLineRunner {
	
	@Autowired
	private PatientRepository patientRepository;
	
			
	public static void main(String[] args) {
		SpringApplication.run(Master14Tp10Application.class, args);
		
	
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	List<patients> Patients=patientRepository.findAll();
	for (patients P : Patients) {
	System.out.println(P.toString());
		
	}		
	}
	
	

}
