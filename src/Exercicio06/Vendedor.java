package Exercicio06;

import Exercicio03.Empregado;

public class Vendedor extends Empregado {
    private double comissao;
    private double valorVenda;


    public Vendedor(
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

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double porcentagem) {
        this.comissao = getValorVenda() * porcentagem / 100;
    }

    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor(
                "Vendedor1",
                "Rua 10",
                "88888888",
                7,
                10,
                1500,
                8
        );

        vendedor1.setValorVenda(8000);
        vendedor1.setComissao(4);

        System.out.println(
                vendedor1.getNome()       + "\n" +
                        vendedor1.getTelefone()   + "\n" +
                        vendedor1.getEndereço()   + "\n" +
                        "Setor: "          + vendedor1.getCodigoSetor()  + "\n" +
                        "SalarioBase: "    + vendedor1.getSalarioBase()  + "\n" +
                        "Imposto: "        + vendedor1.getImposto()      + "%\n"+
                        "Valor vendido: "  + vendedor1.getValorVenda()  + "\n" +
                        "Comissao: "       + vendedor1.getComissao()     + "\n" +
                        "Salario: "        + vendedor1.calcularSalario() + "\n"
        );
    }
}
