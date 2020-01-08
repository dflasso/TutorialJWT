package ec.edu.espe.jwt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.jwt.models.RoleDTO;
import ec.edu.espe.jwt.models.RoleName;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleDTO, Long> {
    Optional<RoleDTO> findByName(RoleName roleName);
}