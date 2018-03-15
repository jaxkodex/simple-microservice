package io.github.jaxkodex.examples.simplemicroservice.data.repository;

import io.github.jaxkodex.examples.simplemicroservice.data.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<Orden, Long> {
}
