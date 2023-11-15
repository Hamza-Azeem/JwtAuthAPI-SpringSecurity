package hamza.learning.com.springSecurityv2.repository;

import hamza.learning.com.springSecurityv2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
