package br.com.hospital.mapper;

import br.com.hospital.dto.SalaDTO;
import br.com.hospital.model.Sala;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-01T19:10:04-0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class SalaMapperImpl implements SalaMapper {

    @Override
    public SalaDTO toDTO(Sala entity) {
        if ( entity == null ) {
            return null;
        }

        SalaDTO salaDTO = new SalaDTO();

        salaDTO.setIdSala( entity.getIdSala() );
        salaDTO.setNumero( entity.getNumero() );

        return salaDTO;
    }

    @Override
    public Sala toEntity(SalaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Sala sala = new Sala();

        sala.setIdSala( dto.getIdSala() );
        sala.setNumero( dto.getNumero() );

        return sala;
    }
}
