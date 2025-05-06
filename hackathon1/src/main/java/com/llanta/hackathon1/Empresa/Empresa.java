package com.llanta.hackathon1.Empresa;

import com.llanta.hackathon1.Restriccion.Restriccion;
import com.llanta.hackathon1.Usuario.Usuario;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String ruc;
    private LocalDate fechaAfiliacion;
    private boolean estadoActivo;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Usuario administradorPrincipal;

    @OneToMany(mappedBy = "empresa")
    private List<Usuario> usuarios;

    @OneToMany(mappedBy = "empresa")
    private List<Restriccion> restricciones;
}

