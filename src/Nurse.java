
import com.company.Patient;
import com.company.Purpose;
import com.company.Therapy;
import com.company.User;

public class Nurse extends User implements Purpose {

    public Nurse(int id, String name, String surname) {
        super(id, name, surname);
    }

    @Override
    public void doTherapy(Therapy rh, Patient patient) {
        patient.setTherapy(rh.name());
    }
}
