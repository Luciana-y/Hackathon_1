package com.llanta.hackathon1.Limite;

import com.llanta.hackathon1.Restriccion.Restriccion;
import com.llanta.hackathon1.Usuario.Usuario;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Limite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int limitePorModelo;
    private int ventanaTiempo;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "restriccion_id")
    private Restriccion restriccion;
}

