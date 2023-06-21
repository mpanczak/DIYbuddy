package pl.coderslab.entity;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name = "pictures")
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private Blob picture;
}
