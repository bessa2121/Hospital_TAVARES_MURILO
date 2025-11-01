package br.com.hospital.mapper;

import br.com.hospital.dto.PacienteDTO;
import br.com.hospital.model.Paciente;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-01T19:10:04-0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class PacienteMapperImpl implements PacienteMapper {

    @Override
    public PacienteDTO toDto(Paciente e) {
        if ( e == null ) {
            return null;
        }

        PacienteDTO pacienteDTO = new PacienteDTO();

        pacienteDTO.setIdPaciente( e.getIdPaciente() );
        pacienteDTO.setNome( e.getNome() );
        pacienteDTO.setSexo( e.getSexo() );
        pacienteDTO.setTelefone( e.getTelefone() );
        pacienteDTO.setDataNascimento( e.getDataNascimento() );
        pacienteDTO.setCpf( e.getCpf() );
        pacienteDTO.setRg( e.getRg() );
        pacienteDTO.setEndereco( e.getEndereco() );
        pacienteDTO.setCep( e.getCep() );
        pacienteDTO.setUf( e.getUf() );

        return pacienteDTO;
    }

    @Override
    public Paciente toEntity(PacienteDTO d) {
        if ( d == null ) {
            return null;
        }

        Paciente paciente = new Paciente();

        paciente.setIdPaciente( d.getIdPaciente() );
        paciente.setNome( d.getNome() );
        paciente.setSexo( d.getSexo() );
        paciente.setTelefone( d.getTelefone() );
        paciente.setDataNascimento( d.getDataNascimento() );
        paciente.setCpf( d.getCpf() );
        paciente.setRg( d.getRg() );
        paciente.setEndereco( d.getEndereco() );
        paciente.setCep( d.getCep() );
        paciente.setUf( d.getUf() );

        return paciente;
    }
}
