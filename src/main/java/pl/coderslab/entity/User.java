package pl.coderslab.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String email;
    private String password;
//    private Picture profilePictureId;
//    private followings followed watching iFollow; //mayby new table to this
//    private followers ;
//    private reactions likes;

}
