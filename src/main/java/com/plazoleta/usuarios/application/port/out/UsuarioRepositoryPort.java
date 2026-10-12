package com.plazoleta.usuarios.application.port.out;

import com.plazoleta.usuarios.domain.model.Usuario;
import java.util.Optional;

public interface UsuarioRepositoryPort {
	Usuario guardar(Usuario usuario);
	boolean existePorCorreo(String correo);
	boolean existePorDocumento(String documento);
	Optional<Usuario> buscarPorCorreo(String correo);
	Optional<Usuario> buscarPorId(Long id);
}
