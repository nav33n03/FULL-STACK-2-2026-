import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository) {
        this.repository = repository;
    }

    public List<Appointment> searchByDoctor(String doctorName) {
        return repository.findByDoctorNameIgnoreCase(doctorName);
    }
}