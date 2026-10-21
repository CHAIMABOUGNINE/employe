
package ma.ensias.employe.repository;

import ma.ensias.employe.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeRepository extends JpaRepository<Employe, Integer> {

    @Query(value = "SELECT * FROM employe WHERE name = :name", nativeQuery = true)
    Employe findByNameSafe(@Param("name") String name);
}
