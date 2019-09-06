/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Taffarel Xavier - 4º Período de Licenciatura em Computação<taffarel_deus@hotmail.com>
 */
public class Funcionario {

    private int codFuncionario;

    /**
     * O Cpf do Cliente
     */
    private String cpf;

    /**
     * O nome do cliente
     */
    private String nome;

    /**
     * o endereço do cliente
     */
    private String endereco;

    /**
     * o telefone do cliente
     */
    private String telefone;

    /**
     * O Cargo do cliente
     */
    private String cargo;

    /**
     * o salário do cliente
     */
    private double salario;

    //Construtor da classe Funcionário
    public Funcionario(int codFuncionario, String cpf,
            String nome, String endereco, String telefone,
            String cargo, double salario) {
        this.codFuncionario = codFuncionario;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cargo = cargo;
        this.salario = salario;
    }

    /*
    Método vazio que calcular o valor do salário
    acrescentado com a porcentagem, como primeiro parâmetro.
    Por exemplo: se colocar 5000, como salário, mais 15%, o valor final será 5750
    Por exemplo: se colocar 5000, como salário, mais 10%, o valor final será 5500
    Por exemplo: se colocar 2820, como salário, mais 12%, o valor final será 3158,40
    Este método não retorna nada.
     */
    public double calculaSalario(double comissao) {
        
        try {
            //Criei a variável local 'salario' para receber, inicialmente, o valor do salário,
            //que é iniciado no Construtor da classe.
            double salarioInicial = this.salario;

            //Aqui, é atribuído à variável salario o valor do this.salário mais a porcentagem dada no parâmetro 'comissao'
            salarioInicial += salarioInicial * (comissao / 100);

            //Aqui, mostra o valor final para o usuário na tela.
            return salarioInicial;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro: " + e.getMessage());
        }

        return -1;

    }

}
