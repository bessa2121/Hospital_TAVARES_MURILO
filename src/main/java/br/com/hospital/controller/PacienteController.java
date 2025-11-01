package br.com.hospital.controller;
import br.com.hospital.model.Paciente;
import br.com.hospital.dto.PacienteDTO;
import br.com.hospital.mapper.PacienteMapper;
import br.com.hospital.service.PacienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/api/paciente")
public class PacienteController {
    private final PacienteService service;
    private final PacienteMapper mapper;
    public PacienteController(PacienteService service, PacienteMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
    @GetMapping
    public List<Paciente> listar(){return service.listarTodos();}
    @GetMapping("/{id}")
    public ResponseEntity<Paciente> get(@PathVariable Integer id){return service.buscarPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
    @PostMapping
    public ResponseEntity<Paciente> criar(@RequestBody Paciente obj){Paciente saved = service.salvar(obj); return ResponseEntity.created(URI.create("/api/paciente/"+saved.getIdPaciente())).body(saved);}
    @PutMapping("/{id}")
    public ResponseEntity<Paciente> atualizar(@PathVariable Integer id, @RequestBody Paciente obj){obj.setIdPaciente(id); return ResponseEntity.ok(service.salvar(obj));}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){service.deletar(id); return ResponseEntity.noContent().build();}
}
