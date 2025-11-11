package com.ourique.usuario.business;


import com.ourique.usuario.business.converter.UsuarioConverter;
import com.ourique.usuario.business.dto.UsuarioDTO;
import com.ourique.usuario.infrastructure.entity.Usuario;
import com.ourique.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
