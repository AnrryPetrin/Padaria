/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;
import javax.swing.JOptionPane;
import objetos.Cliente;
import conexoes.MySQL;
/**
 *
 * @author BlueStar198
 */
public class InterfaceFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceFuncionario
     */
    public InterfaceFuncionario() {
        initComponents();
      
    }
private void cadastraCliente(Cliente novoCliente){
         
    MySQL sql = new MySQL();
        
        try {
            
            sql.conectaBanco();
            
           sql.insertSQL("INSERT INTO Funcionario ("
                + "nome,"
                + "cpf,"
                + "email,"
                + "telefone,"
                + "Senha,"
                + "Cidade,"
                + "Rua,"
                + "Cargo) VALUES ("
                + "'" + novoCliente.getNome() + "',"
                + "'" + novoCliente.getCpf() + "',"
                + "'" + novoCliente.getEmail() + "',"
                + "'" + novoCliente.getTelefone() + "',"
                + "'" + novoCliente.getSenha() + "',"
                + "'" + novoCliente.getCidade() + "',"
                + "'" + novoCliente.getRua() + "',"
                + "'" + novoCliente.getCargo() + "'"
                + ");");
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente");
            
        } finally{            
            sql.fechaBanco();
            //novoCliente.limpaCliente();
            //limparCamposCadastro();
        }                
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
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtCpf = new javax.swing.JTextField();
        TxtDataNasc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtCargo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Txt_Rua = new javax.swing.JTextField();
        CBox_UF = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        TxtTelefone = new javax.swing.JTextField();
        Btn_Cadastra = new javax.swing.JButton();
        Btn_Limpa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 243, 219));
        jPanel1.setForeground(new java.awt.Color(255, 243, 219));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo funcionario(editado).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jPanel2.setBackground(new java.awt.Color(255, 243, 219));

        jLabel14.setFont(new java.awt.Font("Amarillo", 0, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Funcionário");

        TxtNome.setBackground(new java.awt.Color(255, 255, 204));
        TxtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtNome.setForeground(new java.awt.Color(0, 0, 0));
        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CPF:");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Data de Nascimento:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nome:");

        TxtCpf.setBackground(new java.awt.Color(255, 255, 204));
        TxtCpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtCpf.setForeground(new java.awt.Color(0, 0, 0));
        TxtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCpfActionPerformed(evt);
            }
        });

        TxtDataNasc.setBackground(new java.awt.Color(255, 255, 204));
        TxtDataNasc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtDataNasc.setForeground(new java.awt.Color(0, 0, 0));
        TxtDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDataNascActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Senha:");

        TxtSenha.setBackground(new java.awt.Color(255, 255, 204));
        TxtSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtSenha.setForeground(new java.awt.Color(0, 0, 0));
        TxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSenhaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("TEL:");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Email:");

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Área de Trabalho:");

        TxtCargo.setBackground(new java.awt.Color(255, 255, 204));
        TxtCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtCargo.setForeground(new java.awt.Color(0, 0, 0));
        TxtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCargoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Cidade:");

        TxtCidade.setBackground(new java.awt.Color(255, 255, 204));
        TxtCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtCidade.setForeground(new java.awt.Color(0, 0, 0));
        TxtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCidadeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Rua:");

        Txt_Rua.setBackground(new java.awt.Color(255, 255, 204));
        Txt_Rua.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Txt_Rua.setForeground(new java.awt.Color(0, 0, 0));
        Txt_Rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_RuaActionPerformed(evt);
            }
        });

        CBox_UF.setBackground(new java.awt.Color(255, 255, 204));
        CBox_UF.setForeground(new java.awt.Color(0, 0, 0));
        CBox_UF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "RJ", "MG", "ES" }));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("UF:");

        TxtEmail.setBackground(new java.awt.Color(255, 255, 204));
        TxtEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtEmail.setForeground(new java.awt.Color(0, 0, 0));
        TxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmailActionPerformed(evt);
            }
        });

        TxtTelefone.setBackground(new java.awt.Color(255, 255, 204));
        TxtTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        TxtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCargo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(TxtDataNasc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Txt_Rua)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(CBox_UF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 21, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CBox_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TxtCidade)
                        .addGap(3, 3, 3)))
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Btn_Cadastra.setBackground(new java.awt.Color(72, 107, 91));
        Btn_Cadastra.setFont(new java.awt.Font("Amarillo", 0, 18)); // NOI18N
        Btn_Cadastra.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Cadastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcionario icon(adicionar).png"))); // NOI18N
        Btn_Cadastra.setText("Cadastrar");
        Btn_Cadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CadastraActionPerformed(evt);
            }
        });

        Btn_Limpa.setBackground(new java.awt.Color(72, 107, 91));
        Btn_Limpa.setFont(new java.awt.Font("Amarillo", 0, 18)); // NOI18N
        Btn_Limpa.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Limpa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpar icon(editado).png"))); // NOI18N
        Btn_Limpa.setText("Limpar Textos");
        Btn_Limpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_Limpa, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(Btn_Cadastra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Cadastra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Limpa)
                .addContainerGap(11, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed
        String nome = TxtNome.getText();
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeActionPerformed

    private void TxtDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDataNascActionPerformed
      String DataNasc = TxtDataNasc.getText();
        //  TODO add your handling code here:
    }//GEN-LAST:event_TxtDataNascActionPerformed

    private void TxtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCpfActionPerformed
        String CPF = TxtCpf.getText();
// TODO add your handling code here:
    }//GEN-LAST:event_TxtCpfActionPerformed

    private void TxtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCidadeActionPerformed
        String Cidade = TxtCidade.getText();
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCidadeActionPerformed

    private void Txt_RuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_RuaActionPerformed
        String rua = Txt_Rua.getText();
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_RuaActionPerformed

    private void TxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmailActionPerformed
        String Email = TxtEmail.getText();
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmailActionPerformed

    private void Btn_CadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CadastraActionPerformed
      Cliente novoCliente = new Cliente(); 
                
        novoCliente.setNome(TxtNome.getText());
        novoCliente.setCpf(TxtCpf.getText());
        novoCliente.setCidade(TxtCidade.getText());
        novoCliente.setRua(Txt_Rua.getText());
        novoCliente.setTelefone(TxtTelefone.getText());
        novoCliente.setDataNasc(TxtDataNasc.getText());
        novoCliente.setEmail(TxtEmail.getText());
        novoCliente.setSenha(TxtSenha.getText());
        novoCliente.setCargo(TxtCargo.getText());
        cadastraCliente (novoCliente);
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_CadastraActionPerformed

    private void Btn_LimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpaActionPerformed
    TxtNome.setText("");
    TxtDataNasc.setText("");
    TxtCpf.setText("");
    TxtCidade.setText("");
    Txt_Rua.setText("");
    TxtEmail.setText("");
    TxtSenha.setText("");
    TxtCargo.setText("");
    TxtTelefone.setText("");
    }//GEN-LAST:event_Btn_LimpaActionPerformed

    private void TxtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCargoActionPerformed
        String Cargo = TxtCargo.getText();
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCargoActionPerformed

    private void TxtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefoneActionPerformed
      String  telefone =  TxtTelefone.getText();       // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefoneActionPerformed

    private void TxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSenhaActionPerformed
        String Senha = TxtSenha.getText();
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cadastra;
    private javax.swing.JButton Btn_Limpa;
    private javax.swing.JComboBox<String> CBox_UF;
    private javax.swing.JTextField TxtCargo;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JTextField TxtCpf;
    private javax.swing.JTextField TxtDataNasc;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtSenha;
    private javax.swing.JTextField TxtTelefone;
    private javax.swing.JTextField Txt_Rua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
