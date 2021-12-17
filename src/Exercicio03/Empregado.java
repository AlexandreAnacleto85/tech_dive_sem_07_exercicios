package Exercicio03;

import Exercicio01.Pessoa;

public class Empregado extends Pessoa {
    private double salarioBase;
    private double imposto;
    private int    codigoSetor;
    private int    vencimentoBase;

    public Empregado(String nome, String endereço, String telefone, int codigoSetor, int vencimentoBase, double salarioBase, double imposto) {
        super(nome, endereço, telefone);
        this.codigoSetor    = codigoSetor;
        this.vencimentoBase = vencimentoBase;
        this.salarioBase    = salarioBase;
        this.imposto        = imposto;
    }

    public double calcularSalario(){
        return salarioBase - salarioBase * imposto / 100;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public int getVencimentoBase() {
        return vencimentoBase;
    }

    public void setVencimentoBase(int vencimentoBase) {
        this.vencimentoBase = vencimentoBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado(
                "Alexandre",
                "Rua 1",
                "988550395",
                7,
                10,
                1800,
                8
        );

        System.out.println(
                empregado1.getNome()     + "\n" +
                        empregado1.getTelefone() + "\n" +
                        empregado1.getEndereço() + "\n" +
                        "Setor: "        + empregado1.getCodigoSetor()  + "\n" +
                        "SalarioBase: "  + empregado1.getSalarioBase()  + "\n" +
                        "Imposto: "      + empregado1.getImposto()      + "%\n"+
                        "Salario: "      + empregado1.calcularSalario() + "\n"
        );
    }
}
