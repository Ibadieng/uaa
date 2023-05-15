package com.groupeisi.uaa.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity implements Serializable {
    @Id
    private long id;
    @Column(length = 150, nullable = false)
    private String firstName;
    @Column(length = 100, nullable = false)
    private String lastName;
    @Column(length = 150, nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @ManyToMany
    private List<RoleEntity> roleEntities = new ArrayList<>();


}
