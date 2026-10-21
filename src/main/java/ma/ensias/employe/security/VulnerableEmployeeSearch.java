
package ma.ensias.employe.security;

import org.springframework.stereotype.Component;

@Component
public class VulnerableEmployeeSearch {

    public String buildQuery(String name) {
        return "SELECT * FROM employe WHERE name = '" + name + "'";
    }
}
