package br.com.hospital.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Integer idPaciente;

    @Column(name = "nome", length = 100, nullable = false)
    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @Column(name = "sexo", length = 20, nullable = false)
    private String sexo;

    @Column(name = "telefone", length = 15)
    private String telefone;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "cpf", length = 11, unique = true)
    @NotBlank(message = "CPF é obrigatório")
    @Size(min=11,max=11,message="CPF deve ter 11 dígitos")
    private String cpf;

    @Column(name = "rg", length = 9)
    private String rg;

    @Column(name = "endereco", length = 120)
    private String endereco;

    @Column(name = "cep", length = 8)
    private String cep;

    @Column(name = "uf", length = 2)
    private String uf;

    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;

    @OneToMany(mappedBy = "paciente")
    private List<Receita> receitas;

    public Paciente() {}

    public Integer getIdPaciente() { return idPaciente; }
    public void setIdPaciente(Integer idPaciente) { this.idPaciente = idPaciente; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
    public String getUf() { return uf; }
    public void setUf(String uf) { this.uf = uf; }
    public List<Consulta> getConsultas(){return consultas;} public void setConsultas(List<Consulta> c){this.consultas=c;}
    public List<Receita> getReceitas(){return receitas;} public void setReceitas(List<Receita> r){this.receitas=r;}
}
