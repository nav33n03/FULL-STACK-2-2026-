import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @GetMapping("/search")
    public List<Appointment> searchAppointments(@RequestParam("doctor") String doctorName) {
        return service.searchByDoctor(doctorName);
    }
}