package Exercicio05;

import Exercicio03.Empregado;

public class Operario extends Empregado {
    private double comissao;
    private double valorProducao;


    public Operario(
            String nome,
            String endereco,
            String telefone,
            int codigoSetor,
            int vencimentoBase,
            double salarioBase,
            double imposto
    ) {
        super(nome, endereco, telefone, codigoSetor, vencimentoBase, salarioBase, imposto);
    }

    @Override
    public double calcularSalario(){
        return  getSalarioBase()  + getComissao() -
                getSalarioBase()  * getImposto() / 100;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double porcentagem) {
        this.comissao = getValorProducao() * porcentagem / 100;
    }

    public static void main(String[] args) {
        Operario op1 = new Operario(
                "Operario 1",
                "Rua 2",
                "22222222",
                7,
                10,
                1500,
                8
        );

        op1.setValorProducao(1000);
        op1.setComissao(3);

        System.out.println(
                op1.getNome()       + "\n" +
                        op1.getTelefone()   + "\n" +
                        op1.getEndereço()   + "\n" +
                        "Setor: "          + op1.getCodigoSetor()  + "\n" +
                        "SalarioBase: "    + op1.getSalarioBase()  + "\n" +
                        "Imposto: "        + op1.getImposto()      + "%\n"+
                        "Valor produzido: "+ op1.getValorProducao()+ "\n" +
                        "Comissao: "       + op1.getComissao()     + "\n" +
                        "Salario: "        + op1.calcularSalario() + "\n"
        );
    }
}