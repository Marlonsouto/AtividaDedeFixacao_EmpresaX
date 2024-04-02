package model.abstractClass;

import model.Enuns.NivelExperienciaEnum;
import model.Enuns.TipoContratacao;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Contrato {


    private Long numeroMatriculaDoFuncionario;
    private LocalDateTime dataContratacao;
    private NivelExperienciaEnum nivelExperiencia;
    private Colaborador colaborador;
    private TipoContratacao contratacao;

    public Contrato(Long numeroMatriculaDoFuncionario, LocalDate dataContratacao, NivelExperienciaEnum nivelExperiencia,
                    Colaborador colaborador, TipoContratacao contratacao) {
        this.numeroMatriculaDoFuncionario = numeroMatriculaDoFuncionario;
        setDataContratacao();
        this.nivelExperiencia = nivelExperiencia;
        this.colaborador = colaborador;
        this.contratacao = contratacao;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public TipoContratacao getContratacao() {
        return contratacao;
    }

    public void setContratacao(TipoContratacao contratacao) {
        this.contratacao = contratacao;
    }

    public Long getNumeroMatriculaDoFuncionario() {
        return numeroMatriculaDoFuncionario;
    }

    public void setNumeroMatriculaDoFuncionario(Long numeroMatriculaDoFuncionario) {
        this.numeroMatriculaDoFuncionario = numeroMatriculaDoFuncionario;
    }

    public LocalDateTime getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao() {
       this.dataContratacao = LocalDateTime.now();

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
