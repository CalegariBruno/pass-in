package rocketseat.com.passin.repostories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.ckeckin.Checkin;

public interface CheckinRepository extends JpaRepository<Checkin, Integer> {
}
