package Prestador;

import DAO.CadastroPrestadoresDAO;
import DTO.CadastroPrestadoresDTO;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

public class TelaEditarPrestadores extends javax.swing.JFrame {

    public TelaEditarPrestadores() {
        initComponents();
       ((PlainDocument) txtnome.getDocument()).setDocumentFilter(new LimiteCaracteres(50));
        ((PlainDocument) txtTelefone.getDocument()).setDocumentFilter(new LimiteCaracteres(50));
        ((PlainDocument) txtcnpj.getDocument()).setDocumentFilter(new LimiteCaracteres(14));
        ((PlainDocument) txtemail.getDocument()).setDocumentFilter(new LimiteCaracteres(100));
        ((PlainDocument) txtendereco.getDocument()).setDocumentFilter(new LimiteCaracteres(100));
        ((PlainDocument) txtramo.getDocument()).setDocumentFilter(new LimiteCaracteres(100));
        ((PlainDocument) txtsenha.getDocument()).setDocumentFilter(new LimiteCaracteres(20));
        ((PlainDocument) txtsenha1.getDocument()).setDocumentFilter(new LimiteCaracteres(20)); 
        
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Bloqueia o caractere não numérico
        }
    }
});
         txtcnpj.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); 
        }
    }
    
});


    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcnpj = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtendereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtramo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        alterar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtnome = new javax.swing.JTextField();
        mostrar = new javax.swing.JButton();
        txtsenha1 = new javax.swing.JPasswordField();
        txtsenha = new javax.swing.JPasswordField();
        txtid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("nome:");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 47, 37, -1));

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        jPanel5.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 325, -1));

        jLabel2.setText("Telefone:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txtcnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnpjActionPerformed(evt);
            }
        });
        jPanel5.add(txtcnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 325, -1));

        jLabel3.setText("Cnpj:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 37, -1));
        jPanel5.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 325, -1));

        jLabel4.setText("Email:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 37, -1));
        jPanel5.add(txtendereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 325, -1));

        jLabel5.setText("Endereco:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 60, -1));
        jPanel5.add(txtramo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 325, -1));

        jLabel6.setText("ramo:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 50, -1));

        jLabel7.setText("senha:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 50, 20));

        jLabel8.setText("comfirmar:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 60, 20));

        alterar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        jPanel5.add(alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 350, 60));

        jLabel9.setText("Cadastro Prestador");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 350, 40));

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        jPanel5.add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 330, -1));

        mostrar.setText("mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        jPanel5.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));
        jPanel5.add(txtsenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 320, -1));
        jPanel5.add(txtsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 320, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 470, 480));

        txtid.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(845, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(390, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed

       
        String nome = txtnome.getText().trim();
        String telefone = txtTelefone.getText().trim();
        String cnpj = txtcnpj.getText().trim();
        String email = txtemail.getText().trim();
        String endereco = txtendereco.getText().trim();
        String ramo = txtramo.getText().trim();
        String senha = txtsenha.getText().trim();
        String senha1 = txtsenha1.getText().trim();

        boolean camposValidos = true;

       
        if (nome.isEmpty()) {
            txtnome.setBackground(Color.PINK);
            camposValidos = false;
        } else {
            txtnome.setBackground(Color.WHITE);
        }

        if (telefone.isEmpty()) {
            txtTelefone.setBackground(Color.PINK);
            camposValidos = false;
        } else {
            txtTelefone.setBackground(Color.WHITE);
        }

        if (cnpj.isEmpty()) {
            txtcnpj.setBackground(Color.PINK);
            camposValidos = false;
        } else {
            txtcnpj.setBackground(Color.WHITE);
        }

        if (email.isEmpty()) {
            txtemail.setBackground(Color.PINK);
            camposValidos = false;
        } else {
            txtemail.setBackground(Color.WHITE);
        }

        if (endereco.isEmpty()) {
            txtendereco.setBackground(Color.PINK);
            camposValidos = false;
        } else {
            txtendereco.setBackground(Color.WHITE);
        }

        if (email.isEmpty()) {
            txtramo.setBackground(Color.PINK);
            camposValidos = false;
        } else {
            txtramo.setBackground(Color.WHITE);
        }

        if (senha.isEmpty()) {
            txtsenha.setBackground(Color.PINK);
            camposValidos = false;
        } else {
            txtsenha.setBackground(Color.WHITE);
        }

        if (senha1.isEmpty()) {
            txtsenha1.setBackground(Color.PINK);
            camposValidos = false;
        } else {
            txtsenha1.setBackground(Color.WHITE);
        }

        // Verifica campos obrigatórios
        if (!camposValidos) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            return;
        }

        // Verifica se as senhas coincidem
        if (!senha.equals(senha1)) {
            txtsenha.setBackground(Color.PINK);
            txtsenha1.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(null, "As senhas não coincidem.");
            return;
        } else {
            txtsenha.setBackground(Color.WHITE);
            txtsenha1.setBackground(Color.WHITE);
        }

        
        try {
            alterarPrestadores();
            JOptionPane.showMessageDialog(null, "Prestadores alterado com sucesso!");

            
            VisualizarPrestadores Cadastro = new VisualizarPrestadores();
            Cadastro.setVisible(true);
            this.setVisible(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Falha na alteração: " + erro.getMessage());
        }


    }//GEN-LAST:event_alterarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VisualizarPrestadores visul = new VisualizarPrestadores();
        visul.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcnpjActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed


    }//GEN-LAST:event_txtnomeActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        if (txtsenha.getEchoChar() != (char) 0) {
            // Mostrar a senha
            txtsenha.setEchoChar((char) 0);
            txtsenha1.setEchoChar((char) 0);
            mostrar.setText("Ocultar"); 
        } else {
            
            txtsenha.setEchoChar('*');
            txtsenha1.setEchoChar('*');
            mostrar.setText("Mostrar");
        }

    }//GEN-LAST:event_mostrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarPrestadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtcnpj;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JLabel txtid;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtramo;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JPasswordField txtsenha1;
    // End of variables declaration//GEN-END:variables

    public void setDados(String id, String nome, String telefone, String cnpj, String email, String endereco, String ramo, String senha) {
        txtid.setText(id);
        txtnome.setText(nome);
        txtTelefone.setText(telefone);
        txtcnpj.setText(cnpj);
        txtemail.setText(email);
        txtendereco.setText(endereco);
        txtramo.setText(ramo);
        txtsenha.setText(senha);
        txtsenha1.setText(senha);
    }

    private void alterarPrestadores() {
        int idPrestadores;
        String nome, telefone, cnpj, email, endereco, ramo, senha;
        idPrestadores = Integer.parseInt(txtid.getText());
        nome = txtnome.getText();
        telefone = txtTelefone.getText();
        cnpj = txtcnpj.getText();
        email = txtemail.getText();
        endereco = txtendereco.getText();
        ramo = txtendereco.getText();
        senha = txtsenha.getText();

        CadastroPrestadoresDTO objCadastroPrestadoresdto = new CadastroPrestadoresDTO();
        objCadastroPrestadoresdto.setIdPrestadores(idPrestadores);
        objCadastroPrestadoresdto.setNome(nome);
        objCadastroPrestadoresdto.setTelefone(telefone);
        objCadastroPrestadoresdto.setCnpj(cnpj);
        objCadastroPrestadoresdto.setEmail(email);
        objCadastroPrestadoresdto.setEndereco(endereco);
        objCadastroPrestadoresdto.setRamo(ramo);
        objCadastroPrestadoresdto.setSenha(senha);

        CadastroPrestadoresDAO objCadastroPrestadoresdao = new CadastroPrestadoresDAO();
        objCadastroPrestadoresdao.alterarPrestadores(objCadastroPrestadoresdto);

    }

    private boolean validarSenhas() {
        String senha1 = txtsenha.getText();
        String senha2 = txtsenha1.getText();

        if (!senha1.equals(senha2)) {
            // Define a borda vermelha se estiver diferente
            txtsenha.setBackground(Color.PINK);
            txtsenha1.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(null, "As senhas não coincidem.");
            return false;
        } else {
            // Volta para a cor normal se estiverem iguais
            txtsenha.setBackground(Color.WHITE);
            txtsenha1.setBackground(Color.WHITE);
            return true;
        }
    }

    class LimiteCaracteres extends DocumentFilter {

        private int limite;

        public LimiteCaracteres(int limite) {
            this.limite = limite;
        }

        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                throws BadLocationException {
            if ((fb.getDocument().getLength() + string.length()) <= limite) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                throws BadLocationException {
            if ((fb.getDocument().getLength() - length + text.length()) <= limite) {
                super.replace(fb, offset, length, text, attrs);
            }
        }
        
    }
}
