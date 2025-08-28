  package techwear;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Cliente extends javax.swing.JFrame {

    ArrayList<Object[]> pedidos=new ArrayList<>();
    ArrayList<Object[]> itemsPedido=new ArrayList<>();
    
    public Cliente() {
        initComponents();
        
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
        image.setBounds(0,0,getWidth(),getHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        painelPedidoSelecionado = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        painelItemSelecionado = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        inputPreco = new javax.swing.JTextField();
        inputCor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        inputTotal = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        inputQuantidade = new javax.swing.JTextField();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Meus Pedidos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 6, 258, -1));

        jList1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 55, 894, 226));

        jButton1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 20, 85, -1));

        container.setOpaque(false);

        painelPedidoSelecionado.setBackground(new java.awt.Color(255, 255, 255));
        painelPedidoSelecionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel5.setText("Pedido Nº 0000000000");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Data do pedido:");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("Situação:");

        jCheckBox1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jCheckBox1.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("jLabel4");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel6.setText("Valor Total:");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 16)); // NOI18N
        jLabel7.setText("Itens do Pedido:");

        jList2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("Outras informações:");

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setText("Endereço de entrega:");

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel10.setText("Forma de pagamento:");

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField5))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPedidoSelecionadoLayout = new javax.swing.GroupLayout(painelPedidoSelecionado);
        painelPedidoSelecionado.setLayout(painelPedidoSelecionadoLayout);
        painelPedidoSelecionadoLayout.setHorizontalGroup(
            painelPedidoSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPedidoSelecionadoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(painelPedidoSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPedidoSelecionadoLayout.createSequentialGroup()
                        .addGroup(painelPedidoSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelPedidoSelecionadoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelPedidoSelecionadoLayout.setVerticalGroup(
            painelPedidoSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPedidoSelecionadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPedidoSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        painelItemSelecionado.setBackground(new java.awt.Color(255, 255, 255));
        painelItemSelecionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        jLabel11.setText("Produto:");

        jLabel17.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel17.setText("Item Selecionado:");

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel12.setText("Preço:");

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel14.setText("Cor:");

        inputPreco.setEditable(false);
        inputPreco.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        inputCor.setEditable(false);
        inputCor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        jLabel15.setText("Quantidade:");

        jLabel16.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        jLabel16.setText("Total:");

        inputTotal.setEditable(false);
        inputTotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        inputNome.setEditable(false);
        inputNome.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        inputQuantidade.setEditable(false);
        inputQuantidade.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        javax.swing.GroupLayout painelItemSelecionadoLayout = new javax.swing.GroupLayout(painelItemSelecionado);
        painelItemSelecionado.setLayout(painelItemSelecionadoLayout);
        painelItemSelecionadoLayout.setHorizontalGroup(
            painelItemSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelItemSelecionadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelItemSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelItemSelecionadoLayout.createSequentialGroup()
                        .addGroup(painelItemSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 58, Short.MAX_VALUE)
                        .addGroup(painelItemSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addComponent(inputTotal)
                            .addComponent(jLabel15)
                            .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelItemSelecionadoLayout.createSequentialGroup()
                        .addGroup(painelItemSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelItemSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(painelItemSelecionadoLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(29, 29, 29)
                                    .addComponent(inputCor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painelItemSelecionadoLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(inputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel17))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelItemSelecionadoLayout.setVerticalGroup(
            painelItemSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelItemSelecionadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(painelItemSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addGap(1, 1, 1)
                .addGroup(painelItemSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelItemSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelItemSelecionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(inputCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(containerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(painelPedidoSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)
                    .addComponent(painelItemSelecionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
            .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(containerLayout.createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(containerLayout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(painelPedidoSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(painelItemSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 14, Short.MAX_VALUE)))
        );

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 880, 380));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagem-fundo.png"))); // NOI18N
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        painelPedidoSelecionado.setVisible(false);
        painelItemSelecionado.setVisible(false);
        pedidos=puxarPedidos();
        
        DefaultListModel model=new DefaultListModel();
        jList1.setModel(model);
        model.clear();
        
        if(pedidos.isEmpty()){
        
            model.addElement("Você ainda não possui nenhum pedido.");
        }

        else{
        
            for(Object[] pedido:pedidos){
            
                model.addElement("Pedido: "+pedido[0]+"\n Feito em: "+pedido[6]);
            }
        }
    }//GEN-LAST:event_formComponentShown

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        
        int selectedRow=jList1.getSelectedIndex();
        if(selectedRow!=-1){
        
            Object[] infsSelectedRow=pedidos.get(selectedRow);
            painelPedidoSelecionado.setVisible(true);
            jLabel5.setText(infsSelectedRow[0].toString());
            jTextField1.setText(infsSelectedRow[6].toString());
            
            jCheckBox1.setSelected((boolean)infsSelectedRow[5]);
            jCheckBox1.setText((boolean)infsSelectedRow[5] ? "Entregue" : "Em andamento");
            
            jLabel4.setText((boolean)infsSelectedRow[5] ? "Entregue em:" : "Previsão de entrega:");
            jTextField3.setText(infsSelectedRow[4].toString());
            jTextField2.setText(infsSelectedRow[3].toString());
            jTextField4.setText(infsSelectedRow[1].toString());
            jTextField5.setText(infsSelectedRow[7].toString());
            
            itemsPedido=puxarItensPedido((int)infsSelectedRow[0]);
            DefaultListModel model=new DefaultListModel();
            jList2.setModel(model);
            
            for(Object[] item:itemsPedido){
            
                model.addElement("Produto: "+item[5]);
            }
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        
        int selectedRow=jList2.getSelectedIndex();
        
        if(selectedRow!=-1){

            Object[] itemPedido=itemsPedido.get(selectedRow);
            painelItemSelecionado.setVisible(true);
            
            inputNome.setText(itemPedido[5].toString());
            inputQuantidade.setText(itemPedido[2].toString());
            inputTotal.setText(itemPedido[3].toString());
            inputPreco.setText(itemPedido[6].toString());
            inputCor.setText(itemPedido[9].toString());
        }
    }//GEN-LAST:event_jList2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.dispose();
        new Produtos().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }
    
    public static ArrayList<Object[]> puxarPedidos(){
    
        try{
        
            ResultSet rows=DatabaseMethods.pedidosQuery(User.getId());
            if(rows==null)
                throw new Exception("Erro ao puxar os pedidos.");
            
            ArrayList<Object[]> registersPedidos=new ArrayList<>();
            
            while(rows.next()){
            
                int puxarIDPedido=rows.getInt("id_pedido");
                String puxarCep=rows.getString("cep");
                int puxarIDCliente=rows.getInt("clientes_id_clientes");
                float puxarPreco=rows.getFloat("total");
                String puxarEntrega=rows.getString("entrega");
                boolean puxarSituacao=rows.getBoolean("situacao");
                String puxarEmissao=rows.getString("data_emissao");
                String puxarFormaPagamento=rows.getString("forma_pagamento");
                
                registersPedidos.add(new Object[]{puxarIDPedido,puxarCep,puxarIDCliente,puxarPreco,puxarEntrega,puxarSituacao,puxarEmissao,puxarFormaPagamento});
            }
            
            return registersPedidos;
            
        } catch(Exception e){
        
            System.err.println("Erro inesperado ao buscar os pedidos: \n"+e);
            JOptionPane.showMessageDialog(null,"Erro desconhecido ao tentar buscar os seus pedidos.");
            return null;
        }
    }
    
    public static ArrayList<Object[]> puxarItensPedido(int IDPedido){
    
        try{
            
            ResultSet rows=DatabaseMethods.itemPedidoQuery(IDPedido);
            ArrayList<Object[]> registers=new ArrayList<>(); 
            
            while(rows.next()){
            
                int puxarIDItem=rows.getInt("id_item_pedido");
                int puxarIDPedido=rows.getInt("pedidos_id_pedido");
                int puxarQuantidade=rows.getInt("quantidade");
                int puxarTotal=rows.getInt("total_item");
                int puxarIDProduto=rows.getInt("id_produtos");
                String puxarNome=rows.getString("produtos.nome");
                float puxarPreco=rows.getFloat("preco");
                int puxarEstoque=rows.getInt("estoque");
                int puxarIDCor=rows.getInt("id_cor");
                String puxarCor=rows.getString("cores.nome");
                
                registers.add(new Object[]{puxarIDItem,puxarIDPedido,puxarQuantidade,puxarTotal,puxarIDProduto,puxarNome,puxarPreco,puxarEstoque,puxarIDCor,puxarCor});
            }
            
            return registers;
            
        } catch(Exception e){
        
            System.err.println("Erro inesperado ao buscar o item do pedido: \n"+e);
            JOptionPane.showMessageDialog(null,"Erro desconhecido ao tentar buscar as informações do item de seu pedido.");
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel image;
    private javax.swing.JTextField inputCor;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputPreco;
    private javax.swing.JTextField inputQuantidade;
    private javax.swing.JTextField inputTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel painelItemSelecionado;
    private javax.swing.JPanel painelPedidoSelecionado;
    // End of variables declaration//GEN-END:variables
}
