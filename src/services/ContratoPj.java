package services;

import model.abstractClass.Contrato;
import model.abstractClass.Colaborador;
import model.interfaces.ContratoPjINterface;

public class ContratoPj extends Contrato implements ContratoPjINterface {

    private Colaborador colaborador;

    @Override
    public double calcularSalario(Colaborador colaborador) {
        return colaborador.getSalarioBruto();
    }


    @Override
    public Double calcularSalario() {
        return null;
    }
}
