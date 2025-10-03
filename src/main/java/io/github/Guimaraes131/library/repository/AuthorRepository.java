package io.github.Guimaraes131.library.repository;

import io.github.Guimaraes131.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<Author, UUID> {
}
