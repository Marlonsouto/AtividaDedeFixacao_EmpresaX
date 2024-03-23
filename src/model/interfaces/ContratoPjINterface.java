package model.interfaces;

import model.abstractClass.Colaborador;

public interface ContratoPjINterface extends ContratoFuncionario {
    double calcularSalario(Colaborador colaborador);
}
