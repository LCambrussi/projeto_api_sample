package br.edu.atitus.apisample.repositories;

import br.edu.atitus.apisample.models.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Long> {
}