package services;

import model.abstractClass.Contrato;
import model.interfaces.ContratoCltInterface;

public class ContratoClt extends Contrato implements ContratoCltInterface {

    //private double valeAlimentacao;
    private double valeTransporte;

    //private double descontos;



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
