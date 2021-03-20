/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Moreno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 0;
        String nome, doc, email, celular;
        ArrayList<Pessoa> listPessoas = new ArrayList<>();
        while (opc != 4) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Pessoa Física\n2 - Pessoa Jurídica\n3 - Mostrar\n4 - Sair"));
            switch (opc) {
                case 1:
                    nome = JOptionPane.showInputDialog("Nome");
                    doc = JOptionPane.showInputDialog("CPF");
                    email = JOptionPane.showInputDialog("E-mail");
                    celular = JOptionPane.showInputDialog("Celular");
                    listPessoas.add(new PessoaFisica(nome, doc, email, celular));
                    break;
                case 2:
                    nome = JOptionPane.showInputDialog("Razão");
                    doc = JOptionPane.showInputDialog("CNPJ");
                    email = JOptionPane.showInputDialog("E-mail");
                    celular = JOptionPane.showInputDialog("Celular");
                    listPessoas.add(new PessoaJuridica(nome, doc, email, celular));
                    break;
                case 3:
                    String msg = "";
                    for(Pessoa p : listPessoas){                        
                        if(p instanceof PessoaFisica)
                            msg += ((PessoaFisica)p).imprimir() + "\n ------ \n";
                        else
                            msg += ((PessoaJuridica)p).imprimir() + "\n ------ \n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
    }

}
