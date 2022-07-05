package br.com.aulaapi.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "usuario")
public class User {

    @Id
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "NOME")
    private String name;

    @Basic
    @Column(name = "IDADE")
    private Integer age;

}
