package br.com.hospital.mapper;

import br.com.hospital.dto.RemedioDTO;
import br.com.hospital.model.Remedio;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-01T19:10:04-0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class RemedioMapperImpl implements RemedioMapper {

    @Override
    public RemedioDTO toDTO(Remedio entity) {
        if ( entity == null ) {
            return null;
        }

        RemedioDTO remedioDTO = new RemedioDTO();

        remedioDTO.setIdRemedio( entity.getIdRemedio() );
        remedioDTO.setNome( entity.getNome() );
        remedioDTO.setDescricao( entity.getDescricao() );

        return remedioDTO;
    }

    @Override
    public Remedio toEntity(RemedioDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Remedio remedio = new Remedio();

        remedio.setIdRemedio( dto.getIdRemedio() );
        remedio.setNome( dto.getNome() );
        remedio.setDescricao( dto.getDescricao() );

        return remedio;
    }
}
