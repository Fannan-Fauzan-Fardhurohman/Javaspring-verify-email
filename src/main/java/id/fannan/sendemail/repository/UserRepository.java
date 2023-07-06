package id.fannan.sendemail.repository;

import id.fannan.sendemail.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailIgnoreCase(String email);

    Boolean existsByEmail(String email);
}
