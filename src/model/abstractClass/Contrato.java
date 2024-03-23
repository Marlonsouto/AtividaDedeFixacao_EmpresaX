package model.abstractClass;

import model.Enuns.NivelExperienciaEnum;

import java.time.LocalDate;

public abstract class Contrato {


    private Long númeroMatriculaDoFuncionario;
    private LocalDate dataContratacao;
    private NivelExperienciaEnum nivelExperiencia;
    private Colaborador colaborador;

    public Long getNúmeroMatriculaDoFuncionario() {
        return númeroMatriculaDoFuncionario;
    }

    public void setNúmeroMatriculaDoFuncionario(Long númeroMatriculaDoFuncionario) {
        this.númeroMatriculaDoFuncionario = númeroMatriculaDoFuncionario;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public NivelExperienciaEnum getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(NivelExperienciaEnum nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public Colaborador getFuncionario() {
        return colaborador;
    }

    public void setFuncionario(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
}
