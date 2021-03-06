/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loja.informatica.VIEW;

import com.loja.informatica.DAO.ProdutosDAO;
import com.loja.informatica.MODEL.Produtos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Azazel
 */
public class LojaInformatica extends javax.swing.JFrame {

    /**
     * Creates new form LojaInformatica
     */
    public LojaInformatica() {
        initComponents();
        setLocationRelativeTo(null);
        buttonInserirAlteracao.setVisible(false);
        buttonAlterar.setEnabled(false);
        buttonExcluir.setEnabled(false);
        carregarTabela();
    }

    public void carregarTabela() {

        ArrayList<Produtos> listaProdutos = ProdutosDAO.consultarProdutos();
        DefaultTableModel tabelaProdutos = new DefaultTableModel();

        tabelaProdutos.addColumn("ID");
        tabelaProdutos.addColumn("Computador");
        tabelaProdutos.addColumn("Armazenamento");
        tabelaProdutos.addColumn("Processador");
        tabelaProdutos.addColumn("Memoria Ram");
        tabelaProdutos.addColumn("Gabinete");
        tabelaProdutos.addColumn("Cooler");
        tabelaProdutos.addColumn("Mouse");
        tabelaProdutos.addColumn("Teclado");
        tabelaProdutos.addColumn("HeadSet");

        tabelaBancoDados.setModel(tabelaProdutos);

        tabelaProdutos.setRowCount(0);

        for (Produtos produtos : listaProdutos) {
            tabelaProdutos.addRow(new Object[]{
                produtos.getId(),
                produtos.getComputador(),
                produtos.getArmazenamento(),
                produtos.getProcessador(),
                produtos.getMemoriaRAM(),
                produtos.getGabinete(),
                produtos.getCooler(),
                produtos.getMouse(),
                produtos.getTeclado(),
                produtos.getHeadSet()
            });
        }

    }

    public void limparCampos() {
        fieldPesquisar.setText("");
        fieldComputador.setText("");
        fieldHD.setText("");
        fieldProcessador.setText("");
        fieldMemoriaRam.setText("");
        fieldGabinete.setText("");
        fieldCooler.setText("");
        fieldMouse.setText("");
        fieldTeclado.setText("");
        fieldHeadSet.setText("");
    }

    public boolean validarCampos() {
        boolean camposOK = false;
        boolean campo_1 = true;
        boolean campo_2 = true;
        boolean campo_3 = true;
        boolean campo_4 = true;
        boolean campo_5 = true;
        boolean campo_6 = true;
        boolean campo_7 = true;
        boolean campo_8 = true;
        boolean campo_9 = true;

        if (fieldComputador.getText().equals("")) {
            fieldComputador.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Computador vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_1 = false;
        } else {
            campo_1 = true;
        }
        if (fieldHD.getText().equals("")) {
            fieldHD.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Amazenamento vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_2 = false;
        } else {
            campo_2 = true;
        }
        if (fieldProcessador.getText().equals("")) {
            fieldProcessador.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Processador vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_3 = false;
        } else {
            campo_3 = true;
        }
        if (fieldMemoriaRam.getText().equals("")) {
            fieldMemoriaRam.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Memoria Ram vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_4 = false;
        } else {
            campo_4 = true;
        }
        if (fieldGabinete.getText().equals("")) {
            fieldGabinete.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Gabinete vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_5 = false;
        } else {
            campo_5 = true;
        }
        if (fieldCooler.getText().equals("")) {
            fieldCooler.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Cooler vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_6 = false;
        } else {
            campo_6 = true;
        }
        if (fieldMouse.getText().equals("")) {
            fieldMouse.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Mouse vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_7 = false;
        } else {
            campo_7 = true;
        }
        if (fieldTeclado.getText().equals("")) {
            fieldTeclado.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo Teclado vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_8 = false;
        } else {
            campo_8 = true;
        }
        if (fieldHeadSet.getText().equals("")) {
            fieldHeadSet.requestFocus();
            JOptionPane.showMessageDialog(this, "Campo HeadSet vazio!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
            campo_9 = false;
        } else {
            campo_9 = true;
        }

        if (campo_1 == true && campo_2 == true && campo_3 == true && campo_4 == true && campo_5 == true && campo_6 == true
                && campo_7 == true && campo_8 == true && campo_9 == true) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        checkBoxDesktop = new javax.swing.JCheckBox();
        checkBoxNotebook = new javax.swing.JCheckBox();
        checkBoxServidor = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        comboBoxHD = new javax.swing.JComboBox<>();
        comboBoxProcessador = new javax.swing.JComboBox<>();
        comboBoxRAM = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxGabinete = new javax.swing.JComboBox<>();
        comboBoxCooler = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboBoxMouse = new javax.swing.JComboBox<>();
        comboBoxTeclado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboBoxHeadset = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        buttonAdicionarCarrinho = new javax.swing.JButton();
        buttonFinalizarCompra = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        buttonExcluir = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();
        buttonPesquisar = new javax.swing.JButton();
        fieldPesquisar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fieldComputador = new javax.swing.JTextField();
        fieldHD = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fieldProcessador = new javax.swing.JTextField();
        fieldMemoriaRam = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fieldGabinete = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fieldCooler = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fieldMouse = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        fieldTeclado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        fieldHeadSet = new javax.swing.JTextField();
        buttonInserirAlteracao = new javax.swing.JButton();
        buttonAtualizarTabela = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaBancoDados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Computador"));

        buttonGroup1.add(checkBoxDesktop);
        checkBoxDesktop.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        checkBoxDesktop.setSelected(true);
        checkBoxDesktop.setText("Desktop");
        checkBoxDesktop.setActionCommand("Desktop");

        buttonGroup1.add(checkBoxNotebook);
        checkBoxNotebook.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        checkBoxNotebook.setText("Notebook");
        checkBoxNotebook.setActionCommand("Notebook");

        buttonGroup1.add(checkBoxServidor);
        checkBoxServidor.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        checkBoxServidor.setText("Servidor");
        checkBoxServidor.setActionCommand("Servidor");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBoxDesktop)
                .addGap(18, 18, 18)
                .addComponent(checkBoxNotebook)
                .addGap(18, 18, 18)
                .addComponent(checkBoxServidor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxDesktop)
                    .addComponent(checkBoxNotebook)
                    .addComponent(checkBoxServidor))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Componentes"));

        comboBoxHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HD 500 GB", "HB 1 TB", "HD 2 TB", "SSD 128 GB", "SSD 256 GB", "SSD 480 GB", "SSD M.2 NVMe 128GB", "SSD M.2 NVMe 256GB", "SSD M.2 NVMe 512GB" }));

        comboBoxProcessador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AMD Ryzen 7 1700", "AMD Ryzen 5 2600", "AMD Ryzen 5 2400G", "AMD Ryzen 3 2200G", "Intel Pentium G5400", "Intel Core i3 8100", "Intel Core i5 7400", "Intel Core i5 8400" }));

        comboBoxRAM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kingston HyperX Fury 16 GB", "Kingston HyperX Predator 8 GB", "Kingston HyperX Savage 4 GB", "Corsair Dominator Platinum 8 GB", "ADATA XPG SPECTRIX RGB 8 GB" }));

        jLabel1.setText("Armazenamento:");

        jLabel2.setText("Processador:");

        comboBoxGabinete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aerocool Xpredator", "Aerocool Aero 500", "Cooler Master Masterbox 5", "Cooler Master Cosmos C700P", "Cougar Conquer Essence", "Cougar Archon", "NZXT H500", "Thermaltake Core P5 TG Titanium Edition", "Thermaltake Core X1" }));

        comboBoxCooler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cooler Master Hyper H412R", "Cooler Master Masteriquid Lite ", "Deepcool Gammaxx 400", "Deepcool Storm Lucifer V2", "Masterair MA610P", "Noctua NH-D15", "PCYes Sangue Frio", "Thermaltake Water 3.0 Riing ", "Water cooler Corsair H45 Hydro", "Water cooler Corsair H100i Pro" }));

        jLabel3.setText("Memoria RAM:");

        jLabel4.setText("Gabinete:");

        jLabel5.setText("Cooler:");

        comboBoxMouse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cougar Revenger", "Cooler Master Mastermouse S", "Razer DeathAdder Elite", "Logitech G502 Proteus Spectrum", "Logitech G903", "Logitech G403", "Sharkoon Shark Force", "Zowie FK2" }));

        comboBoxTeclado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dazz Rapidfire", "HyperX Mars", "HyperX Mecânico Alloy FPS", "HyperX Alloy FPS Pro Red", "Redragon Harpe RGB K503RGB", "T MasterKeys Pro M RGB", "Warrior Gamer Laser", " Warrior TC208" }));

        jLabel6.setText("Mouse:");

        jLabel7.setText("Teclado:");

        jLabel8.setText("Headset:");

        comboBoxHeadset.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Logitech G430", "Logitech G633", "HyperX Cloud II", "HyperX Cloud Alpha", "HyperX Cloud Revolver", "Logitech G933 Artemis Spectrum", "Redragon Garuda H101", "Razer Tiamat 7.1 v2" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(comboBoxHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxCooler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxHeadset, 0, 352, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(comboBoxRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxGabinete, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxGabinete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboBoxCooler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(comboBoxHeadset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrinho"));

        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Computador", "Armazenamento", "Processador", "Memoria RAM", "Gabinete", "Cooler", "Mouse", "Teclado", "Headset"
            }
        ));
        jScrollPane1.setViewportView(tabelaCarrinho);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonAdicionarCarrinho.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonAdicionarCarrinho.setText("Adicionar");
        buttonAdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarCarrinhoActionPerformed(evt);
            }
        });

        buttonFinalizarCompra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonFinalizarCompra.setText("Finalizar Compra");
        buttonFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinalizarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonAdicionarCarrinho))
                    .addComponent(buttonFinalizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonAdicionarCarrinho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Cadastrar Produto", jPanel3);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar/Excluir"));

        buttonExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonAlterar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonAlterar.setText("Alterar");
        buttonAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAlterarMouseClicked(evt);
            }
        });
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        buttonPesquisar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonPesquisar.setText("Pesquisar:");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        jLabel9.setText("Computador:");

        jLabel10.setText("Armazenamento:");

        jLabel11.setText("Processador:");

        jLabel12.setText("Memoria RAM:");

        jLabel13.setText("Gabinete:");

        jLabel14.setText("Cooler:");

        jLabel15.setText("Mouse:");

        jLabel16.setText("Teclado:");

        jLabel17.setText("HeadSet:");

        buttonInserirAlteracao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonInserirAlteracao.setText("Inserir Alteração");
        buttonInserirAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInserirAlteracaoActionPerformed(evt);
            }
        });

        buttonAtualizarTabela.setText("Atualizar Tabela");
        buttonAtualizarTabela.setMaximumSize(new java.awt.Dimension(121, 40));
        buttonAtualizarTabela.setMinimumSize(new java.awt.Dimension(121, 40));
        buttonAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(fieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonInserirAlteracao))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(buttonAtualizarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(fieldComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(fieldHD, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(fieldProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(fieldMemoriaRam, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(fieldGabinete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(fieldCooler, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(fieldMouse, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(fieldTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(fieldHeadSet, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldPesquisar)
                    .addComponent(buttonInserirAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAlterar)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(fieldComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(fieldProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(fieldMemoriaRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonExcluir)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(fieldCooler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(fieldMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(fieldTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(fieldHeadSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldGabinete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAtualizarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros Banco de Dados"));

        tabelaBancoDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabelaBancoDados);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1359, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar/Alterar", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarCarrinhoActionPerformed
        Produtos produtos = new Produtos();
        produtos.setComputador(buttonGroup1.getSelection().getActionCommand());
        produtos.setArmazenamento(comboBoxHD.getSelectedItem().toString());
        produtos.setProcessador(comboBoxProcessador.getSelectedItem().toString());
        produtos.setMemoriaRAM(comboBoxRAM.getSelectedItem().toString());
        produtos.setGabinete(comboBoxGabinete.getSelectedItem().toString());
        produtos.setCooler(comboBoxCooler.getSelectedItem().toString());
        produtos.setMouse(comboBoxMouse.getSelectedItem().toString());
        produtos.setTeclado(comboBoxTeclado.getSelectedItem().toString());
        produtos.setHeadSet(comboBoxHeadset.getSelectedItem().toString());

        DefaultTableModel tabela = (DefaultTableModel) tabelaCarrinho.getModel();
        tabela.addRow(new Object[]{produtos.getComputador(), produtos.getArmazenamento(), produtos.getProcessador(),
            produtos.getMemoriaRAM(), produtos.getGabinete(), produtos.getCooler(), produtos.getMouse(), produtos.getTeclado(), produtos.getHeadSet()});


    }//GEN-LAST:event_buttonAdicionarCarrinhoActionPerformed

    private void buttonFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinalizarCompraActionPerformed

        try {
            ProdutosDAO produtosDAO = new ProdutosDAO();
            Produtos produtos = new Produtos();

            ArrayList<Produtos> produtosLista = new ArrayList<>();
            int totalRows = tabelaCarrinho.getRowCount();

            for (int i = 0; i < totalRows; i++) {
                produtos.setComputador((String) tabelaCarrinho.getModel().getValueAt(i, 0));
                produtos.setArmazenamento((String) tabelaCarrinho.getModel().getValueAt(i, 1));
                produtos.setProcessador((String) tabelaCarrinho.getModel().getValueAt(i, 2));
                produtos.setMemoriaRAM((String) tabelaCarrinho.getModel().getValueAt(i, 3));
                produtos.setGabinete((String) tabelaCarrinho.getModel().getValueAt(i, 4));
                produtos.setCooler((String) tabelaCarrinho.getModel().getValueAt(i, 5));
                produtos.setMouse((String) tabelaCarrinho.getModel().getValueAt(i, 6));
                produtos.setTeclado((String) tabelaCarrinho.getModel().getValueAt(i, 7));
                produtos.setHeadSet((String) tabelaCarrinho.getModel().getValueAt(i, 8));

                produtosLista.add(produtos);
            }

            produtosDAO.inserirProdutos(produtos);

            JOptionPane.showMessageDialog(this, "Compra Efetuada com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel tabela = (DefaultTableModel) tabelaCarrinho.getModel();
            tabela.setRowCount(0);
            carregarTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao finalizar a compra!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonFinalizarCompraActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed

        if (fieldPesquisar.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo de pesquisar em branco", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            carregarTabela();
        } else {

            buttonInserirAlteracao.setVisible(false);

            ArrayList<Produtos> listaProdutos = ProdutosDAO.buscarProduto(fieldPesquisar.getText());
            DefaultTableModel tabelaProdutos = new DefaultTableModel();

            tabelaProdutos.addColumn("ID");
            tabelaProdutos.addColumn("Computador");
            tabelaProdutos.addColumn("Armazenamento");
            tabelaProdutos.addColumn("Processador");
            tabelaProdutos.addColumn("Memoria Ram");
            tabelaProdutos.addColumn("Gabinete");
            tabelaProdutos.addColumn("Cooler");
            tabelaProdutos.addColumn("Mouse");
            tabelaProdutos.addColumn("Teclado");
            tabelaProdutos.addColumn("HeadSet");

            tabelaBancoDados.setModel(tabelaProdutos);

            tabelaProdutos.setRowCount(0);

            for (Produtos produtos : listaProdutos) {
                tabelaProdutos.addRow(new Object[]{
                    produtos.getId(),
                    produtos.getComputador(),
                    produtos.getArmazenamento(),
                    produtos.getProcessador(),
                    produtos.getMemoriaRAM(),
                    produtos.getGabinete(),
                    produtos.getCooler(),
                    produtos.getMouse(),
                    produtos.getTeclado(),
                    produtos.getHeadSet()
                });
            }

            try {
                int pesquisar = Integer.parseInt(fieldPesquisar.getText());

                if (pesquisar > 0) {
                    fieldComputador.setEnabled(false);
                    fieldHD.setEnabled(false);
                    fieldProcessador.setEnabled(false);
                    fieldMemoriaRam.setEnabled(false);
                    fieldGabinete.setEnabled(false);
                    fieldCooler.setEnabled(false);
                    fieldMouse.setEnabled(false);
                    fieldTeclado.setEnabled(false);
                    fieldHeadSet.setEnabled(false);

                    buttonAlterar.setEnabled(true);
                    buttonExcluir.setEnabled(true);

                    for (int i = 0; i < tabelaProdutos.getColumnCount(); i++) {
                        fieldComputador.setText(tabelaProdutos.getValueAt(i, 1).toString());
                        fieldHD.setText(tabelaProdutos.getValueAt(i, 2).toString());
                        fieldProcessador.setText(tabelaProdutos.getValueAt(i, 3).toString());
                        fieldMemoriaRam.setText(tabelaProdutos.getValueAt(i, 4).toString());
                        fieldGabinete.setText(tabelaProdutos.getValueAt(i, 5).toString());
                        fieldCooler.setText(tabelaProdutos.getValueAt(i, 6).toString());
                        fieldMouse.setText(tabelaProdutos.getValueAt(i, 7).toString());
                        fieldTeclado.setText(tabelaProdutos.getValueAt(i, 8).toString());
                        fieldHeadSet.setText(tabelaProdutos.getValueAt(i, 9).toString());
                    }

                } 
                

            } catch (NumberFormatException e) {
                 buttonAlterar.setEnabled(false);
                 buttonExcluir.setEnabled(false);
                 limparCampos();
                System.out.print("");
            } catch (NullPointerException e) {
                System.out.print("");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.print("");
            }

        } // FIM ELSE
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed

        try {
            int pesquisar = Integer.parseInt(fieldPesquisar.getText());

            if (pesquisar > 0) {
                fieldComputador.setEnabled(true);
                fieldHD.setEnabled(true);
                fieldProcessador.setEnabled(true);
                fieldMemoriaRam.setEnabled(true);
                fieldGabinete.setEnabled(true);
                fieldCooler.setEnabled(true);
                fieldMouse.setEnabled(true);
                fieldTeclado.setEnabled(true);
                fieldHeadSet.setEnabled(true);

                JOptionPane.showMessageDialog(this, "Modo de alteração!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                buttonInserirAlteracao.setVisible(true);
                buttonAlterar.setEnabled(false);
                buttonExcluir.setEnabled(false);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Informe um ID para atualizar!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            System.out.print("");
        } catch (NullPointerException e) {
            System.out.print("");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("");
        }


    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void buttonAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAlterarMouseClicked

    }//GEN-LAST:event_buttonAlterarMouseClicked

    private void buttonInserirAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInserirAlteracaoActionPerformed
        Produtos produtos = new Produtos();
        produtos.setComputador(fieldComputador.getText());
        produtos.setArmazenamento(fieldHD.getText());
        produtos.setProcessador(fieldProcessador.getText());
        produtos.setMemoriaRAM(fieldMemoriaRam.getText());
        produtos.setGabinete(fieldGabinete.getText());
        produtos.setCooler(fieldCooler.getText());
        produtos.setMouse(fieldMouse.getText());
        produtos.setTeclado(fieldTeclado.getText());
        produtos.setHeadSet(fieldHeadSet.getText());

        try {
            produtos.setId(Integer.parseInt(fieldPesquisar.getText()));
        } catch (NumberFormatException e) {
            System.out.print("");
        }

        try {

            if (validarCampos() == true) {
                ProdutosDAO produtosDAO = new ProdutosDAO();
                produtosDAO.atualizarProduto(produtos);
                JOptionPane.showMessageDialog(this, "Alterado com Sucesso!", "Alterado", JOptionPane.INFORMATION_MESSAGE);
                buttonInserirAlteracao.setVisible(false);
                limparCampos();
                carregarTabela();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao alterar!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_buttonInserirAlteracaoActionPerformed

    private void buttonAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarTabelaActionPerformed
        carregarTabela();
    }//GEN-LAST:event_buttonAtualizarTabelaActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        try {
            int pesquisar = Integer.parseInt(fieldPesquisar.getText());

            if (pesquisar > 0) {

                int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir essa compra?");
                if (resposta == 0) {
                    ProdutosDAO produtosDAO = new ProdutosDAO();
                    produtosDAO.excluirProduto(pesquisar);
                    JOptionPane.showMessageDialog(this, "Compra Excluida com Sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    buttonAlterar.setEnabled(false);
                    buttonExcluir.setEnabled(false);
                    limparCampos();
                    carregarTabela();
                } else {
                    JOptionPane.showMessageDialog(this, "Compra não deletada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir compra, digite um ID!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (NullPointerException e) {
            System.out.print("");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("");
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(LojaInformatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LojaInformatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LojaInformatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LojaInformatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LojaInformatica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarCarrinho;
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonAtualizarTabela;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonFinalizarCompra;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonInserirAlteracao;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JCheckBox checkBoxDesktop;
    private javax.swing.JCheckBox checkBoxNotebook;
    private javax.swing.JCheckBox checkBoxServidor;
    private javax.swing.JComboBox<String> comboBoxCooler;
    private javax.swing.JComboBox<String> comboBoxGabinete;
    private javax.swing.JComboBox<String> comboBoxHD;
    private javax.swing.JComboBox<String> comboBoxHeadset;
    private javax.swing.JComboBox<String> comboBoxMouse;
    private javax.swing.JComboBox<String> comboBoxProcessador;
    private javax.swing.JComboBox<String> comboBoxRAM;
    private javax.swing.JComboBox<String> comboBoxTeclado;
    private javax.swing.JTextField fieldComputador;
    private javax.swing.JTextField fieldCooler;
    private javax.swing.JTextField fieldGabinete;
    private javax.swing.JTextField fieldHD;
    private javax.swing.JTextField fieldHeadSet;
    private javax.swing.JTextField fieldMemoriaRam;
    private javax.swing.JTextField fieldMouse;
    private javax.swing.JTextField fieldPesquisar;
    private javax.swing.JTextField fieldProcessador;
    private javax.swing.JTextField fieldTeclado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaBancoDados;
    private javax.swing.JTable tabelaCarrinho;
    // End of variables declaration//GEN-END:variables
}
