package id.fannan.sendemail.repository;

import id.fannan.sendemail.entity.Confirmation;
import id.fannan.sendemail.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmationRepository extends JpaRepository<Confirmation, Long> {
    Confirmation findByToken(String token);
}
