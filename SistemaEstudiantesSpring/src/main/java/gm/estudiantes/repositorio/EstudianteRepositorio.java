package gm.estudiantes.repositorio;

import gm.estudiantes.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Integer> {

}
