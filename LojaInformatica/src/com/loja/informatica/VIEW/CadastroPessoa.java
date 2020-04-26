/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loja.informatica.VIEW;

import com.loja.informatica.DAO.ClienteDAO;
import com.loja.informatica.MODEL.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Azazel
 */
public class CadastroPessoa extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPessoa
     */
    public CadastroPessoa() {
        initComponents();
        setLocationRelativeTo(null);
        fieldNome.setDocument(new validacaoCamposCaracteresApenas());
        fieldIdade.setDocument(new validacaoCamposNumerosApenas());
        fieldRG.setDocument(new validacaoCamposNumerosApenas());
        fieldRua.setDocument(new validacaoCamposCaracteresApenas());
        fieldBairro.setDocument(new validacaoCamposCaracteresApenas());
        fieldNumeroCasa.setDocument(new validacaoCamposNumerosApenas());
        fieldCEP.setDocument(new validacaoCamposNumerosApenas());
        fieldCidade.setDocument(new validacaoCamposCaracteresApenas());

    }

    public boolean semCamposVazios(String senha_1, String senha_2) {
        boolean campo_1 = true;
        boolean campo_2 = true;
        boolean campo_3 = true;
        boolean campo_4 = true;
        boolean campo_5 = true;
        boolean campo_6 = true;
        boolean campo_7 = true;
        boolean campo_8 = true;
        boolean campo_9 = true;
        boolean campo_10 = true;
        boolean campo_11 = true;
        boolean campo_12 = true;
        boolean camposOK = false;

        Cliente cliente = new Cliente();
        if (fieldNome.getText().trim().equals("")) {
            fieldNome.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Nome vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_1 = false;

        } else {
            campo_1 = true;
        }
        if (fieldIdade.getText().trim().equals("")) {
            fieldIdade.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Idade vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_2 = false;

        } else {
            campo_2 = true;
        }
        if (fieldRG.getText().trim().equals("")) {
            fieldRG.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo RG vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_3 = false;

        } else {
            campo_3 = true;
        }
        if (fieldCPF.getText().equals("   .   .   -  ")) {
            fieldCPF.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo CPF vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_4 = false;

        } else {
            campo_4 = true;
        }
        if (fieldTelefone.getText().equals("(  )     -    ")) {
            fieldTelefone.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Telefone vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_5 = false;

        } else {
            campo_5 = true;
        }
        if (fieldEmail.getText().trim().equals("")) {
            fieldEmail.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo E-mail vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_6 = false;

        } else {
            campo_6 = true;
        }
        if (fieldRua.getText().trim().equals("")) {
            fieldRua.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Rua vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_7 = false;

        } else {
            campo_7 = true;
        }
        if (fieldBairro.getText().trim().equals("")) {
            fieldBairro.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Bairro vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_8 = false;

        } else {
            campo_8 = true;
        }
        if (fieldNumeroCasa.getText().trim().equals("")) {
            fieldNumeroCasa.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Nº vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_9 = false;

        } else {
            campo_9 = true;
        }
        if (fieldCEP.getText().trim().equals("")) {
            fieldCEP.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo CEP vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_10 = false;
        } else {
            campo_10 = true;
        }
        if (fieldCidade.getText().trim().equals("")) {
            fieldCidade.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Cidade vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_11 = false;

        } else {
            campo_11 = true;
        }
        if ((senha_1.trim().equals("")) || (senha_2.trim().equals(""))) {
            fieldSenha_1.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo senha vazio");
            campo_12 = false;

        } else if (!senha_1.equals(senha_2)) {
            fieldSenha_1.requestFocus();
            JOptionPane.showMessageDialog(this, "A senha está errada em algum dos campos");
            campo_12 = false;

        } else {
            campo_12 = true;
        }

        if (campo_1 == true && campo_2 == true && campo_3 == true && campo_4 == true && campo_5 == true && campo_6 == true
                && campo_7 == true && campo_8 == true && campo_9 == true && campo_10 == true && campo_11 == true
                && campo_12 == true) {
            camposOK = true;
        }
        return camposOK;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        fieldIdade = new javax.swing.JTextField();
        comboBoxSexo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldRG = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldCPF = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldTelefone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        fieldRua = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fieldBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fieldNumeroCasa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fieldCEP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fieldCidade = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        fieldSenha_1 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        fieldSenha_2 = new javax.swing.JPasswordField();
        buttonCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade:");

        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homem", "Mulher", "Trans", "Outros(a)", "Não Definido", "Prefiro Não Informar" }));
        comboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSexoActionPerformed(evt);
            }
        });

        jLabel3.setText("Sexo:");

        jLabel4.setText("RG:");

        jLabel5.setText("CPF:");

        try {
            fieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("Telefone / Celular:");

        try {
            fieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("E-mail:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(fieldRG))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(fieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(fieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(fieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel8.setText("Rua:");

        jLabel9.setText("Bairro:");

        jLabel10.setText("Nº");

        jLabel11.setText("CEP:");

        jLabel12.setText("Cidade:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(fieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(fieldNumeroCasa))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(fieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(fieldNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        jLabel13.setText("Senha:");

        jLabel14.setText("Repita a senha:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(fieldSenha_1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(fieldSenha_2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(fieldSenha_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(fieldSenha_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        buttonCadastrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSexoActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed

        Cliente cliente = new Cliente();
        cliente.setNome(fieldNome.getText());
        cliente.setSexo(comboBoxSexo.getSelectedItem().toString());
        cliente.setCpf(fieldCPF.getText());
        cliente.setTelefone(fieldTelefone.getText());
        cliente.setEmail(fieldEmail.getText());
        cliente.setRua(fieldRua.getText());
        cliente.setBairro(fieldBairro.getText());
        cliente.setCidade(fieldCidade.getText());
        cliente.setSenha_1(String.valueOf(fieldSenha_1.getPassword()));
        cliente.setSenha_2(String.valueOf(fieldSenha_2.getPassword()));

        try {
            cliente.setNumeroCasa(Integer.parseInt(fieldNumeroCasa.getText()));
            cliente.setCep(Integer.parseInt(fieldCEP.getText()));
            cliente.setRg(Integer.parseInt(fieldRG.getText()));
            cliente.setIdade(Byte.parseByte(fieldIdade.getText()));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        boolean camposValidados = semCamposVazios(cliente.getSenha_1(), cliente.getSenha_2());
        ClienteDAO clienteDAO = new ClienteDAO();

        if (camposValidados == true) {
            try {
                clienteDAO.cadastrarPessoa(cliente);
                JOptionPane.showMessageDialog(this, "Usuario cadastrado com sucesso!", "Parabéns", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                TelaInicialLoja telaInicial = new TelaInicialLoja();
                telaInicial.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Não foi possivel gravar no banco de dados\n" + e.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_buttonCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JComboBox<String> comboBoxSexo;
    private javax.swing.JTextField fieldBairro;
    private javax.swing.JTextField fieldCEP;
    private javax.swing.JFormattedTextField fieldCPF;
    private javax.swing.JTextField fieldCidade;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldIdade;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldNumeroCasa;
    private javax.swing.JFormattedTextField fieldRG;
    private javax.swing.JTextField fieldRua;
    private javax.swing.JPasswordField fieldSenha_1;
    private javax.swing.JPasswordField fieldSenha_2;
    private javax.swing.JFormattedTextField fieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
