package br.com.hospital.mapper;

import br.com.hospital.dto.ReceitaDTO;
import br.com.hospital.model.Receita;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-01T19:10:04-0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class ReceitaMapperImpl implements ReceitaMapper {

    @Override
    public ReceitaDTO toDto(Receita e) {
        if ( e == null ) {
            return null;
        }

        ReceitaDTO receitaDTO = new ReceitaDTO();

        receitaDTO.setIdReceita( e.getIdReceita() );
        receitaDTO.setDataEmissao( e.getDataEmissao() );
        receitaDTO.setObservacoes( e.getObservacoes() );

        return receitaDTO;
    }

    @Override
    public Receita toEntity(ReceitaDTO d) {
        if ( d == null ) {
            return null;
        }

        Receita receita = new Receita();

        receita.setIdReceita( d.getIdReceita() );
        receita.setDataEmissao( d.getDataEmissao() );
        receita.setObservacoes( d.getObservacoes() );

        return receita;
    }
}
