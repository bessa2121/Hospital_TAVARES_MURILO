package br.com.hospital.web;

import br.com.hospital.model.Paciente;
import br.com.hospital.service.PacienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pacientes")
public class PacienteWebController {

    private final PacienteService pacienteService;

    public PacienteWebController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("pacientes", pacienteService.listarTodos());
        return "pacientes/list";
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "pacientes/form";
    }

    @PostMapping
    public String create(@ModelAttribute Paciente paciente) {
        pacienteService.salvar(paciente);
        return "redirect:/pacientes";
    }

    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable Integer id, Model model) {
        var opt = pacienteService.buscarPorId(id);
        if (opt.isPresent()) {
            model.addAttribute("paciente", opt.get());
        } else {
            model.addAttribute("paciente", new Paciente());
        }
        return "pacientes/form";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Paciente paciente) {
        pacienteService.salvar(paciente);
        return "redirect:/pacientes";
    }

    @PostMapping("/delete/{id}")
    public String deletePaciente(@PathVariable Integer id) {
        pacienteService.deletar(id);
        return "redirect:/pacientes";
    }
}
