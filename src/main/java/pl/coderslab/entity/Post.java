package pl.coderslab.entity;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private User Author;
    private String content; // html witch links(queries) to pictures
//    private Pictures;
//    private likes userId;
//    private comments commentId;
}
