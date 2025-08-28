package techwear;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.sql.ResultSet;

import javax.swing.DefaultListModel;

public class Carrinho extends javax.swing.JFrame {

    private static ArrayList<Object[]> itemsCart;
    private static float total;
    private static int quantidade;
    
    public Carrinho() {
        initComponents();
        painelItem.setBackground(new Color(255, 255, 255, 150));
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamanhoTela = tk.getScreenSize();
        
        int width=Math.min(tamanhoTela.width,1440);
        int height=Math.min(tamanhoTela.height,900);
        
        setSize(width,height);
        setLocationRelativeTo(null);
        setResizable(false);
        
        int cX=(getWidth()-container.getWidth());
        int cY=(getHeight()-container.getHeight());
        container.setBounds(cX,cY,container.getWidth(),container.getHeight());
        container2.setBounds(cX,cY,container2.getWidth(),container2.getHeight());
        jLabel3.setBounds(cX,cY,jLabel3.getWidth(),jLabel3.getHeight());
        image.setBounds(0,0,getWidth(),getHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        painelItem = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        inputPreco = new javax.swing.JTextField();
        inputEstoque = new javax.swing.JTextField();
        inputCor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputTotal = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        inputQuantidade = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        container2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 900));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Meu Carrinho");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        container.setOpaque(false);

        jList1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        painelItem.setBackground(new java.awt.Color(255, 255, 255));
        painelItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelItem.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Produto:");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Preço:");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estoque:");

        jButton1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jButton1.setText("Excluir do Carrinho");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cor:");

        inputPreco.setEditable(false);
        inputPreco.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        inputEstoque.setEditable(false);
        inputEstoque.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        inputCor.setEditable(false);
        inputCor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantidade:");

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total:");

        inputTotal.setEditable(false);
        inputTotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        inputNome.setEditable(false);
        inputNome.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton2.setText("+");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        inputQuantidade.setEditable(false);
        inputQuantidade.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton3.setText("-");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecione e clique para excluir");

        javax.swing.GroupLayout painelItemLayout = new javax.swing.GroupLayout(painelItem);
        painelItem.setLayout(painelItemLayout);
        painelItemLayout.setHorizontalGroup(
            painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelItemLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelItemLayout.createSequentialGroup()
                        .addGroup(painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputCor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addComponent(inputNome))
                .addGroup(painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelItemLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(inputTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addGroup(painelItemLayout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)))
                    .addGroup(painelItemLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        painelItemLayout.setVerticalGroup(
            painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(1, 1, 1)
                .addGroup(painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelItemLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(painelItemLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelItemLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(painelItemLayout.createSequentialGroup()
                                .addGroup(painelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)))))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 780, 340));

        container2.setOpaque(false);

        jButton5.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jButton5.setText("Finalizar Pedido");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jButton4.setText("Voltar");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout container2Layout = new javax.swing.GroupLayout(container2);
        container2.setLayout(container2Layout);
        container2Layout.setHorizontalGroup(
            container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 505, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        container2Layout.setVerticalGroup(
            container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(28, 28, 28))
        );

        getContentPane().add(container2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 780, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagem-carrinho.png"))); // NOI18N
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        itemsCart=puxarItens();
        DefaultListModel model=new DefaultListModel();
        jList1.setModel(model);
        model.clear();
            
        for(int i=0;i<itemsCart.size();i++){
            
            model.addElement("Produto: "+itemsCart.get(i)[3]);
         }
    }//GEN-LAST:event_formComponentShown

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        
        getSelectedRowValues();
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int selectedRow=jList1.getSelectedIndex();
        int estoque=(int)itemsCart.get(selectedRow)[7];
        
        if(quantidade<estoque){
            updateItemQuantidade("Adicionar");
            
            itemsCart = puxarItens();
            getSelectedRowValues();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(quantidade>1){
            
            updateItemQuantidade("Diminuir");
            itemsCart = puxarItens();
            getSelectedRowValues();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
        
            int selectedRow=jList1.getSelectedIndex();
            Object[] rowValues=itemsCart.get(selectedRow);
        
            boolean verifDelete=DatabaseMethods.deleteItemCart((int)rowValues[0])!=0;
            
            if(verifDelete){
                jLabel2.setText("Produto excluído com sucesso!");
                
                itemsCart=puxarItens();
                DefaultListModel model=new DefaultListModel();
                jList1.setModel(model);
                model.clear();
            
                for(int i=0;i<itemsCart.size();i++){

                    model.addElement("Produto: "+itemsCart.get(i)[3]);
                }
            }
                
            else{
                throw new Exception("affectedRows=0");
            }
            
        } catch(Exception e){
         
            System.out.println(e);
            
            if(e.equals("affectedRows=0"))
                jLabel2.setText("Erro: nenhum produto foi deletado.");
            
            else
                jLabel2.setText("Erro ao excluir o produto do carrinho.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        this.dispose();
        new Produtos().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if(!itemsCart.isEmpty()){
               
            this.dispose();
            new Pedido().setVisible(true);
        }
        
        else
            jLabel2.setText("Seu carrinho está vazio.");
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrinho().setVisible(true);
            }
        });
    }
    
    public ArrayList<Object[]> puxarItens(){
    
        try{
            
            ResultSet itemsCartRegisters=DatabaseMethods.UserItemsCartQuery(User.getId());
            ArrayList<Object[]> armazenarItens=new ArrayList();
            
            while(itemsCartRegisters.next()){
            
                int puxarIDItemCarrinho=itemsCartRegisters.getInt("id_item_carrinho");
                int puxarQuantidade=itemsCartRegisters.getInt("item_carrinho.quantidade");
                int puxarIDProduto=itemsCartRegisters.getInt("produtos.id_produtos");
                String puxarNomeProduto=itemsCartRegisters.getString("produtos.nome");
                float puxarPreco=itemsCartRegisters.getFloat("produtos.preco");
                int puxarCorID=itemsCartRegisters.getInt("produtos.cores_id_cor");
                String puxarNomeCor=itemsCartRegisters.getString("cores.nome");
                int puxarEstoque=itemsCartRegisters.getInt("produtos.estoque");
                int puxarIDCarrinho=itemsCartRegisters.getInt("carrinho.id_carrinho");
                
                armazenarItens.add(new Object[]{puxarIDItemCarrinho,puxarQuantidade,puxarIDProduto,puxarNomeProduto,puxarPreco,puxarCorID,puxarNomeCor,puxarEstoque,puxarIDCarrinho});
            }
  
            return armazenarItens;
            
        } catch(Exception e){
        
            System.err.println("Erro ao executar a função de puxar itens: "+e);
            return null;
        }
    }
    
    public void getSelectedRowValues(){
    
        try{
        
            int selectedRow=jList1.getSelectedIndex();
            if(selectedRow==-1)
                throw new Exception("Nenhuma linha foi selecionada");

            Object[] rowValues=itemsCart.get(selectedRow);

            quantidade=(int)rowValues[1];
            total=(float)rowValues[4]*quantidade;

            inputQuantidade.setText(Integer.toString(quantidade));
            inputNome.setText(rowValues[3].toString());
            inputPreco.setText(String.format("%.2f",(float)rowValues[4]));
            inputEstoque.setText(rowValues[7].toString());
            inputCor.setText(rowValues[6].toString());
            inputTotal.setText(String.format("%.2f",total));
            
        } catch(Exception e){
        
            jLabel2.setText("Erro ao puxar as informações do produto selecionado.");
            System.out.println("Erro ao puxar o valor do item selecionado: \n"+e);
        }
        
    }
    
    public void updateItemQuantidade(String updateType){
    
        try{
            
            if(updateType.contentEquals("Adicionar"))
                quantidade++;
            
            else if(updateType.contentEquals("Diminuir"))
                quantidade--;
                
            int selectedRow=jList1.getSelectedIndex();
            
            Object[] rowValues=itemsCart.get(selectedRow);
            
            int affectedRowsMethod=DatabaseMethods.alterItemCart((int) rowValues[0],(int) rowValues[2],(int) rowValues[8],quantidade);
            
            if(affectedRowsMethod==0)
                throw new Exception("Nenhum valor foi alterado.");
            
            getSelectedRowValues();
            
        } catch(Exception e){
        
            System.out.println("Erro ao alterar a quantidade: \n"+e);
            jLabel2.setText("Erro ao alterar a quantidade.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JPanel container2;
    private javax.swing.JLabel image;
    private javax.swing.JTextField inputCor;
    private javax.swing.JTextField inputEstoque;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputPreco;
    private javax.swing.JTextField inputQuantidade;
    private javax.swing.JTextField inputTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel painelItem;
    // End of variables declaration//GEN-END:variables
}
