package com.llanta.hackathon1.Solicitud;
import com.llanta.hackathon1.Usuario.Usuario;
import jakarta.persistence.*;


@Entity
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String consulta;
    private String respuesta;
    private int tokensConsumidos;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
