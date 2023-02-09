package aula05;

import java.time.LocalDate;
import java.util.StringJoiner;

public class Funcionario {
    private  Integer id;
    private  String nome;
    private  String sexo;
    private  LocalDate dataNascimento;
    private  String cidade;
    private  String cargo;
    private  LocalDate dataAdmissao;
    private  Double salario;

    public Funcionario(Integer id, String nome, String sexo, LocalDate dataNascimento, String cidade, String cargo, LocalDate dataAdmissao, Double salario) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cidade = cidade;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }


    public Funcionario() {
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCargo() {
        return cargo;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public Double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Funcionario.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nome='" + nome + "'")
                .add("sexo='" + sexo + "'")
                .add("dataNascimento=" + dataNascimento)
                .add("cidade='" + cidade + "'")
                .add("cargo='" + cargo + "'")
                .add("dataAdmissao=" + dataAdmissao)
                .add("salario=" + salario)
                .toString();
    }
}
