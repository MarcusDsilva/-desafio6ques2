/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio6ques2;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Desafio6ques2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
int idade, sexo, contPessoas, contMS100, maiorIdade, menorIdade;
        double salario, acSalario;
        contPessoas = 0;contMS100 = 0;acSalario = 0;menorIdade = 0;
        maiorIdade = 0;
        idade = 1;
        while(idade >= 0) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade\n"
                    + "Ou digite -1 para sair "));
            if(idade >= 0) {
                if(contPessoas == 0){
                    maiorIdade = idade;
                    menorIdade = idade;
                }
                if(idade > maiorIdade){
                    maiorIdade = idade;
                }
                if(idade < menorIdade){
                    menorIdade = idade;
                }
                sexo = Integer.parseInt(JOptionPane.showInputDialog("Informe o sexo"
                        + "\n1 - Feminino ou 2 - Masculino\nDigite: "));
                salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"
                        + "\nDigite: "));
                acSalario = acSalario + salario;
                contPessoas++;
                if (sexo == 1 && salario <= 100) {
                    contMS100++;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tchau amigo(a)");
            }
        }
        JOptionPane.showMessageDialog(null, "Resultados\n-------------\n"
         + " A pesquisa contou com " + contPessoas + " pessoas entrevistadas\n"
         + "Média de Salários R$" + (acSalario / contPessoas) + "\n"
         + "Quant. de Mulheres com salário até R$100,00: " + contMS100 + " mulheres\n"
         + "A idade do mais novo do grupo " + menorIdade+" anos\n"
         + "A idade do mais velho do grupo " + maiorIdade +" anos");
    }
}

