package com.plazoleta.usuarios.application.port.out;

public interface RestauranteOwnershipPort {
	void verificarPropiedad(Long restauranteId, Long propietarioId, String bearerToken);
}
