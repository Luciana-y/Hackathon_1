package com.llanta.hackathon1.Usuario;

import com.llanta.hackathon1.Empresa.Empresa;
import com.llanta.hackathon1.Limite.Limite;
import com.llanta.hackathon1.Solicitud.Solicitud;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @OneToMany(mappedBy = "usuario")
    private List<Límite> limites;

    @OneToMany(mappedBy = "usuario")
    private List<Solicitud> solicitudes;
}
