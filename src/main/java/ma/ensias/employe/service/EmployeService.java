
package ma.ensias.employe.service;

import ma.ensias.employe.entity.Employe;
import ma.ensias.employe.reponse.EmployeReponse;
import ma.ensias.employe.repository.EmployeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {

    private final EmployeRepository employeRepository;
    private final ModelMapper mapper;

    public EmployeService(
            EmployeRepository employeRepository,
            ModelMapper mapper) {
        this.employeRepository = employeRepository;
        this.mapper = mapper;
    }

    public EmployeReponse getEmployeById(int id) {
        Employe employe = employeRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employé introuvable : " + id));

        return mapper.map(employe, EmployeReponse.class);
    }
}
