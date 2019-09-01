package pl.sda.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.spring.model.Donation;

public interface DonationRepository extends JpaRepository <Donation, Long> {
}
