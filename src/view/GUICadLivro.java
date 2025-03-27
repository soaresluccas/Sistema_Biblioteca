/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import modelo.BibliotecaVO;
import servicos.BibliotecaServicos;

/**
 *
 * @author 182210014
 */
public class GUICadLivro extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICadLivro
     */
    public GUICadLivro() {
        initComponents();
        
        jtfExemplar.setDocument(new LimitDocument(100));
        jtfAutor.setDocument(new LimitDocument(100));
        jtfEdicao.setDocument(new LimitDocument(3));
        jtfAno.setDocument(new LimitDocument(4));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jtfExemplar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfAutor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfEdicao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfAno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbtnCadastrar = new javax.swing.JButton();
        jbtnLimpar = new javax.swing.JButton();
        jcmbDisponibilidade = new javax.swing.JComboBox<>();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Exemplar:");

        jLabel2.setText("Autor:");

        jLabel3.setText("Edição:");

        jLabel4.setText("Ano:");

        jLabel5.setText("Disponibilidade:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbtnCadastrar.setText("Cadastrar");
        jbtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastrarActionPerformed(evt);
            }
        });

        jbtnLimpar.setText("Limpar");
        jbtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jbtnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jbtnLimpar)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCadastrar)
                    .addComponent(jbtnLimpar))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jcmbDisponibilidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jcmbDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfAutor)
                                        .addComponent(jtfExemplar, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcmbDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static class LimitDocument extends PlainDocument{
        private int limit;
        
        LimitDocument(int limit){
            super();
            this.limit=limit;
        }
        
        @Override
        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException{
            if(str == null){
                return;
            }
            if((getLength() + str.length()) <= limit){
                super.insertString(offset, str, attr); 
            }
        }
        
    }
    
    private void cadastrar(){
        try{
            BibliotecaVO bVO = new BibliotecaVO();
            
            bVO.setExemplar(jtfExemplar.getText());
            bVO.setAutor(jtfAutor.getText());
            bVO.setEdicao(Integer.parseInt(jtfEdicao.getText()));
            bVO.setAno(Integer.parseInt(jtfAno.getText()));
            bVO.setDisponibilidade(jcmbDisponibilidade.getSelectedItem().toString()); 
            
            if(jtfExemplar.getText().isEmpty() || jtfAutor.getText().isEmpty() || jtfEdicao.getText().isEmpty() || jtfAno.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Preenhca todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente cadastrar este livro?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if(resposta == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(this, "Livro cadastrado com sucesso!\n" + bVO.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                
                BibliotecaServicos bs = servicos.ServicosFactory.getBibliotecaServicos();
                bs.cadastrar(bVO);
                
                limpar();
            }else{
                limpar();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Erro! " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    private void limpar(){
        jtfAno.setText(null);
        jtfAutor.setText(null);
        jcmbDisponibilidade.setSelectedIndex(0);
        jtfEdicao.setText(null);
        jtfExemplar.setText(null);
        
    }
    
    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_jbtnCadastrarActionPerformed

    private void jbtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbtnLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JButton jbtnLimpar;
    private javax.swing.JComboBox<String> jcmbDisponibilidade;
    private javax.swing.JTextField jtfAno;
    private javax.swing.JTextField jtfAutor;
    private javax.swing.JTextField jtfEdicao;
    private javax.swing.JTextField jtfExemplar;
    // End of variables declaration//GEN-END:variables
}
