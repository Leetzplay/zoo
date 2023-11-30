package dwbe.zoologico.controller;

import dwbe.zoologico.DAO.UsuarioDAO;
import dwbe.zoologico.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioDAO userDAO;

    public void gravarServiceUsuario(Usuario user) {
        userDAO.gravarUsuarioDAO(user);
    }

    public ArrayList<Usuario> listarServiceUsuario() {
        return userDAO.buscarUsuariosDAO();
    }
}