package cn.lcd.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;
    private String username;
    private String password;
    @Column(name = "user_email")
    private String useremail;
}
