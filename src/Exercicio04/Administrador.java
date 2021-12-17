package Exercicio04;

import Exercicio03.Empregado;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador(
            String nome,
            String endereço,
            String telefone,
            int codigoSetor,
            int vencimentoBase,
            double salarioBase,
            double imposto,
            double ajudaDeCusto
    ) {
        super(nome, endereço, telefone, codigoSetor, vencimentoBase, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario(){
        return  getSalarioBase()  + getAjudaDeCusto() -
                getSalarioBase()  * getImposto() / 100;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public static void main(String[] args) {
        Administrador adm = new Administrador(
                "Adm 1",
                "Rua 5",
                "111111111",
                7,
                10,
                4000,
                12,
                500
        );

        System.out.println(
                adm.getNome()      + "\n" +
                        adm.getTelefone()  + "\n" +
                        adm.getEndereço()  + "\n" +
                        "Setor: "         + adm.getCodigoSetor()  + "\n" +
                        "SalarioBase: "   + adm.getSalarioBase()  + "\n" +
                        "Imposto: "       + adm.getImposto()      + "%\n"+
                        "Ajuda de custo: "+ adm.getAjudaDeCusto() + "\n" +
                        "Salario: "       + adm.calcularSalario() + "\n"
        );
    }
}
