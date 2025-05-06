package com.llanta.hackathon1.Restriccion;
import com.llanta.hackathon1.Empresa.Empresa;
import jakarta.persistence.*;

@Entity
public class Restriccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoModelo;
    private int limiteUso;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
}
