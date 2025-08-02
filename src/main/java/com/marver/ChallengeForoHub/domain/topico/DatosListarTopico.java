package com.marver.ChallengeForoHub.domain.topico;

public record DatosListarTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechaCreacion,
        String estatus,
        Long autor,
        String curso) {

    public DatosListarTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(),
                topico.getEstatus().toString(), topico.getAutor(), topico.getCurso().toString());
    }
}
