package com.edacansu.data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name="register")
public class RegisterEntity extends BaseEntity implements Serializable {

    private String username;
    private String email;
    private String passwd;
}
