package alquieventos;

import java.util.ArrayList;
import java.util.List;

public class GestorEventos {
    private List<Persona> usuarios;
    private List<Evento> eventos;

    public GestorEventos() {
        this.usuarios = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public void registrarUsuario(Persona usuario) {
        usuarios.add(usuario);
    }

    public Persona iniciarSesion(String email, String contraseña) {
        for (Persona usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getContraseña().equals(contraseña)) {
                return usuario;
            }
        }
        return null;
    }

    public void crearEvento(Evento evento) {
        eventos.add(evento);
    }
}
