package rocketseat.com.passin.repostories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.ckeckin.Checkin;

import java.util.Optional;

public interface CheckinRepository extends JpaRepository<Checkin, Integer> {
    Optional<Checkin> findByAttendeeId(String attendeeId);
}
