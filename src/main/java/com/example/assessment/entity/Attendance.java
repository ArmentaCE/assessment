package com.example.assessment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    //Configuración para que esta entidad tenga el id del participante de la entidad participant
    //private Participant participant

    //Configuración para que esta entidad tenga el id de la sesión de la entidad session
    //private Session session
}
