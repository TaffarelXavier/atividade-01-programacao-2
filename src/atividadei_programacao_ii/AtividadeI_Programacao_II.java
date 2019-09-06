/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadei_programacao_ii;

import classes.Funcionario;
import javax.swing.JOptionPane;

/**
 * Esta é a classe usada para fazer os testes com a classe Funcionário
 *
 * @author Taffarel Xavier <taffarel_deus@hotmail.com>
 */
public class AtividadeI_Programacao_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criação da variável countTeste para adicionar a quantidade
        //de teste, durante o loop
        int countTest = 0;

        //Usei o laço de repetição do while,
        //para o usuário (professor) fazer vários
        //teste
        do {

            //Resolução de erros
            try {
                //Incrementa um ao estado atual, que
                // era zero.
                ++countTest;

                //Mostra um caixa de diálogo para inserção do 
                //salário inicial.
                double salario = Double.parseDouble(
                        JOptionPane.showInputDialog("Digite o salário inicial:"));

                //Cria o funcionário.
                Funcionario funcionario = new Funcionario(1,
                        "03613145610", "Francisco Tafarel",
                        "Rua Dom Vital", "6399480630",
                        "gerente", salario);

                //Mostra um caixa de diálogo para inserção da
                //comissão, que será a porcentagem.
                double comissao = Double.parseDouble(
                        JOptionPane.showInputDialog("Digite a comissão:"));

                //Mostra  a saída para o usuário
                JOptionPane.showMessageDialog(null, "Teste Nº "
                        + countTest + "\n\nSalário Inicial: R$" + salario + "\n\n"
                        + "Comissão: " + comissao + "%\n\n"
                        + "Valor Final: R$ " +
                        funcionario.calculaSalario(comissao));

                //Caso o usuário queira fazer outro teste:
                int reply = JOptionPane.showConfirmDialog(null,
                        "Deseja fazer outro teste?",
                        "Confirmação", JOptionPane.YES_NO_OPTION);

                //Se ele apertar em sim, então, sai do sistema.
                if (reply != JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Tchauuuuuu!");
                    System.exit(0);
                }

            } catch (Exception e) {
                //Caso o usuário aperte, no diálogo de entrada, em cancelar, então, 
                //sai do sistema.
                if (e.getMessage() == null) {
                    System.exit(0);
                }
            }

        } while (true); //Fim do Loop

    }

}
