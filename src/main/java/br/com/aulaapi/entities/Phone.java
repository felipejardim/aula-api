package br.com.aulaapi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "telefone")
public class Phone {

    @Id
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "DESCRICAO")
    private String description;

    @Basic
    @Column(name = "NUMERO")
    private String number;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_USUARIO")
    @JsonBackReference
    private User user;

}
