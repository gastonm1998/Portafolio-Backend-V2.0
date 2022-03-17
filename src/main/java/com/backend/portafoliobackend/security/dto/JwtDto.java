package com.backend.portafoliobackend.security.dto;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class JwtDto {

    private String token;
    private String bearer = "Bearer";
    private Collection<? extends GrantedAuthority> nombreUsuario;
    private Collection<? extends GrantedAuthority> authorities;

    public JwtDto(String token, String bearer, Collection<? extends GrantedAuthority> nombreUsuario) {
        this.token = token;
        this.bearer = bearer;
        this.nombreUsuario = nombreUsuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public Collection<? extends GrantedAuthority> getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(Collection<? extends GrantedAuthority> nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
}
