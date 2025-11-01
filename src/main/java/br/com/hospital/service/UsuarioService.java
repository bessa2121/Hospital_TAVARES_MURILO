package br.com.hospital.service;
import br.com.hospital.model.Usuario;
import br.com.hospital.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class UsuarioService {
    private final UsuarioRepository repo;
    private final PasswordEncoder encoder;
    public UsuarioService(UsuarioRepository repo, PasswordEncoder encoder){this.repo=repo;this.encoder=encoder;}
    public Optional<Usuario> findByUsername(String username){return repo.findByUsername(username);}
    public Usuario saveRawPassword(Usuario u) {
        u.setSenha(encoder.encode(u.getSenha()));
        u.setEnabled(true); // sempre define como ativo
        return repo.save(u);
    }

}
