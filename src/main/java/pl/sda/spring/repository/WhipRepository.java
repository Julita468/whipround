package pl.sda.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.spring.model.Whipround;

public interface WhipRepository extends JpaRepository <Whipround, Long> {
}
