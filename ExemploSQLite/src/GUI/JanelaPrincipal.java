/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JanelaPrincipal.java
 *
 * Created on 13/03/2013, 10:34:56
 */

package GUI;

import classes.Banco;
import classes.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AMDX2
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /** Creates new form JanelaPrincipal */
    public JanelaPrincipal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Listar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Listar por Nome");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Sair");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-398)/2, 416, 398);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JanelaCadastro cadastro = new JanelaCadastro();
        cadastro.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Banco bd = new Banco();
        Pessoa p = new Pessoa();
        String nome;
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        JanelaEscolhaEditar escolha = new JanelaEscolhaEditar();

        //Inserindo pessoas cadastradas no ComboBox
        pessoas = bd.retornaPessoa();
        for(int i=0; i < pessoas.size(); i++) {
            p = (Pessoa) pessoas.get(i);
            nome = p.getId() +" - " +p.getNome();
            escolha.jComboBox1.addItem(nome);
        }
        escolha.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Banco bd = new Banco();
        Pessoa p = new Pessoa();
        String nome;
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        JanelaEscolhaExcluir escolha = new JanelaEscolhaExcluir();

        //Inserindo pessoas cadastradas no ComboBox
        pessoas = bd.retornaPessoa();
        for(int i=0; i < pessoas.size(); i++) {
            p = (Pessoa) pessoas.get(i);
            nome = p.getId() +" - " +p.getNome();
            escolha.jComboBox1.addItem(nome);
        }
        escolha.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Banco bd = new Banco();
        Pessoa p = new Pessoa();        
        String options[] ={"<<", "<", ">", ">>"};
        String saida = "";
        int i = 0;
        int aux;
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas = bd.retornaPessoa();

        //Verifica se existem pessoas cadastradas
        if(pessoas.size() > 0) {
            do {
                p = (Pessoa) pessoas.get(i);
                saida = "Código: " +p.getId() +"\nNome: " +p.getNome() +"\nIdade: " +p.getIdade() +" anos";
                aux = JOptionPane.showOptionDialog(null, saida, "Pessoa " +(i+1) +" de " +pessoas.size(), JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                switch(aux) {
                    case 0:
                        i = 0;
                        break;
                    case 1:
                        if(i != 0)
                            i--;
                        break;
                    case 2:
                        if(i != pessoas.size()-1)
                            i++;
                        break;
                    case 3:
                        i = pessoas.size()-1;
                        break;
                }
            } while(aux==0 || aux==1 || aux==2 || aux==3);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Banco bd = new Banco();
        Pessoa p = new Pessoa();
        String options[] ={"<<", "<", ">", ">>"};
        String saida = "";
        String nome;
        int i = 0;
        int aux;
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        nome = JOptionPane.showInputDialog(null, "Insira o nome que deseja procurar:");
        pessoas = bd.retornaPessoa(nome);

        //Verifica se existem pessoas cadastradas com o nome fornecido
        if(pessoas.size() > 0) {
            do {
                p = (Pessoa) pessoas.get(i);
                saida = "Código: " +p.getId() +"\nNome: " +p.getNome() +"\nIdade: " +p.getIdade() +" anos";
                aux = JOptionPane.showOptionDialog(null, saida, "Pessoa " +(i+1) +" de " +pessoas.size(), JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                switch(aux) {
                    case 0:
                        i = 0;
                        break;
                    case 1:
                        if(i != 0)
                            i--;
                        break;
                    case 2:
                        if(i != pessoas.size()-1)
                            i++;
                        break;
                    case 3:
                        i = pessoas.size()-1;
                        break;
                }
            } while(aux==0 || aux==1 || aux==2 || aux==3);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada com esse nome!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Banco bd = new Banco();
        Pessoa p = new Pessoa();
        String options[] ={"<<", "<", ">", ">>"};
        String saida = "";
        int i = 0;
        int aux;
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas = bd.retornaPessoaNome();

        //Verifica se existem pessoas cadastradas
        if(pessoas.size() > 0) {
            do {
                p = (Pessoa) pessoas.get(i);
                saida = "Código: " +p.getId() +"\nNome: " +p.getNome() +"\nIdade: " +p.getIdade() +" anos";
                aux = JOptionPane.showOptionDialog(null, saida, "Pessoa " +(i+1) +" de " +pessoas.size(), JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                switch(aux) {
                    case 0:
                        i = 0;
                        break;
                    case 1:
                        if(i != 0)
                            i--;
                        break;
                    case 2:
                        if(i != pessoas.size()-1)
                            i++;
                        break;
                    case 3:
                        i = pessoas.size()-1;
                        break;
                }
            } while(aux==0 || aux==1 || aux==2 || aux==3);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada!");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
                //Banco bd = new Banco();
                //bd.initDB();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    // End of variables declaration//GEN-END:variables

}
