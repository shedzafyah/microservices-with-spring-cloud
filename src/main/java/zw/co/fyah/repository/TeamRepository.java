package zw.co.fyah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import zw.co.fyah.domain.Team;

@RestResource(path = "teams", rel = "team")
public interface TeamRepository extends JpaRepository<Team,Long> {

}
