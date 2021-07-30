package zw.co.fyah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import zw.co.fyah.domain.Player;

@RestResource(path = "players", rel = "player")
public interface PlayerRepository extends JpaRepository<Player,Long> {
}
