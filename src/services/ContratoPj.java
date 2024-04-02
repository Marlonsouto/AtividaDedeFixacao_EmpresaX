package services;

import model.Enuns.NivelExperienciaEnum;
import model.Enuns.TipoContratacao;
import model.abstractClass.Contrato;
import model.abstractClass.Colaborador;

import java.time.LocalDate;

public class ContratoPj extends Contrato implements model.interfaces.ContratoPj {

    public ContratoPj(Long numeroMatriculaDoFuncionario, LocalDate dataContratacao, NivelExperienciaEnum nivelExperiencia, Colaborador colaborador, TipoContratacao contratacao) {
        super(numeroMatriculaDoFuncionario, dataContratacao, nivelExperiencia, colaborador, contratacao);
    }

    @Override
    public Double calcularSalario() {
        return getColaborador().getSalarioBruto();
    }

}


