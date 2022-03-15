package com.backend.portafoliobackend.security.entity;



import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @NonNull
    private String nombre;
    @NonNull
    @Column(unique = true)
    private String nombreUsuario;
    @NonNull
    private String email;
    @NonNull
    private String password;

    /*Relacion muchos a muchos*/
    @NonNull
    @ManyToMany
    @JoinTable(name = "usuario_rol",joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles= new HashSet<>();

    /*Constructores*/
    public Usuario() {
    }

    public Usuario(@NonNull String nombre, @NonNull String nombreUsuario, @NonNull String email, @NonNull String password) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }

    /*getters and setters*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getNombre() {
        return nombre;
    }

    public void setNombre(@NonNull String nombre) {
        this.nombre = nombre;
    }

    @NonNull
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(@NonNull String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    @NonNull
    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(@NonNull Set<Rol> roles) {
        this.roles = roles;
    }
}
