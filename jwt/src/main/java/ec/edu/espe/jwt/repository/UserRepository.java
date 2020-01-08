package ec.edu.espe.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.jwt.models.UserDTO;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Long> {
    Optional<UserDTO> findByEmail(String email);

    Optional<UserDTO> findByUsernameOrEmail(String username, String email);

    List<UserDTO> findByIdIn(List<Long> userIds);

    Optional<UserDTO> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}