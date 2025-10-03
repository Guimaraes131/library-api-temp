package io.github.Guimaraes131.library.model;

import io.github.Guimaraes131.library.model.enums.Genre;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String isbn;
    private String title;

    @Column(name = "publish_date")
    private LocalDate publishDate;

    @Enumerated(EnumType.STRING)
    private Genre genre;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
