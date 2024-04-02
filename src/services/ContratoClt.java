package services;

import model.Enuns.NivelExperienciaEnum;
import model.Enuns.TipoContratacao;
import model.abstractClass.Colaborador;
import model.abstractClass.Contrato;

import java.time.LocalDate;

public class ContratoClt extends Contrato implements model.interfaces.ContratoClt {


    private double valeTransporte;

    public ContratoClt(Long numeroMatriculaDoFuncionario, LocalDate dataContratacao, NivelExperienciaEnum nivelExperiencia, Colaborador colaborador, TipoContratacao contratacao) {
        super(numeroMatriculaDoFuncionario, dataContratacao, nivelExperiencia, colaborador, contratacao);
    }

    public double calculoValeAlimentacao(){
       double valeAlimentacao = 700.0;
       return valeAlimentacao * 0.1 ;
    }

    double calculoValeRefeicao(int diasTrabalhados){
       return diasTrabalhados * 20.0;

    }
    double calculoValeTransporte(){
        return getFuncionario().getSalarioBruto() * 0.6;
    }

    @Override
    public Double calcularDecimoTerceiro() {
        return (getFuncionario().getSalarioBruto() * 1/12) * 12;
    }

    @Override
    public Double calcularSalario() {
        return getFuncionario().getSalarioBruto() - (calculoValeAlimentacao() + calculoValeTransporte());
    }
}
