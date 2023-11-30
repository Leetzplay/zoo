package dwbe.zoologico.view;

import dwbe.zoologico.controller.UsuarioService;
import dwbe.zoologico.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
@Component
public class Start implements CommandLineRunner {
    @Autowired
    private UsuarioService service;
    @Override
    public void run(String... args) throws Exception {

        // Gravar usuario no banco
        service.gravarServiceUsuario(new Usuario("João Silva", "jsilva", "123456"));

        // Buscar Usuario no banco
        ArrayList<Usuario> listUsuarios = service.listarServiceUsuario();
        for(Usuario usuario: listUsuarios){
            System.out.println(usuario.getNome());
            System.out.println(usuario.getUsername());
            System.out.println(usuario.getPassword());
        }
    }
}
