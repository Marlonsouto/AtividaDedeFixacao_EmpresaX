package model.Enuns;

public enum NivelExperienciaEnum {
    ESTAGIO(1),
    JUNIOR(2),
    PLENO(3),
    SENIOR(4);

    private int NivelExperiencia;

    NivelExperienciaEnum(int Nivel) {
    }

    public int getNivelExperiencia() {
        return NivelExperiencia;
    }
}
