/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import AppPackage.AnimationClass;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Joshua
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBody = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        btnMenu = new javax.swing.JLabel();
        btnSair = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblVenda = new javax.swing.JLabel();
        lblPagamento = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnRight = new javax.swing.JLabel();
        btnLeft = new javax.swing.JLabel();
        pnlBottom = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        lblSlide1 = new javax.swing.JLabel();
        lblSlide2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuTFarmaceutico = new javax.swing.JMenuItem();
        menuTUsuario = new javax.swing.JMenuItem();
        menuTSair = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlBody.setBackground(new java.awt.Color(242, 247, 247));

        pnlTop.setBackground(new java.awt.Color(255, 255, 255));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/menu_25px.png"))); // NOI18N
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/exit_macos_20px.png"))); // NOI18N
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSairMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/maxmized_macos_20px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/minimized_macos_20px.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMinimizarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addGap(21, 21, 21))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMinimizar)
                    .addComponent(jLabel3)
                    .addComponent(btnSair))
                .addGap(11, 11, 11))
        );

        jPanel1.setBackground(new java.awt.Color(242, 247, 247));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVenda.setForeground(new java.awt.Color(102, 102, 102));
        lblVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/checkout_35px.png"))); // NOI18N
        lblVenda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblVendaMouseMoved(evt);
            }
        });
        lblVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVendaMouseExited(evt);
            }
        });
        jPanel1.add(lblVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 112, 40, 40));

        lblPagamento.setForeground(new java.awt.Color(102, 102, 102));
        lblPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cash_in_hand_35px.png"))); // NOI18N
        jPanel1.add(lblPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 158, 40, 40));

        lblProduto.setForeground(new java.awt.Color(102, 102, 102));
        lblProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/price_35px.png"))); // NOI18N
        jPanel1.add(lblProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 204, 40, 40));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 360, 160, 5));

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Informações");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/facebook_30px.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Talatona TRAV-C CC2");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/whatsapp_30px.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Talatona TRAV-C CC2");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/telegram_app_30px.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Talatona TRAV-C CC2");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/instagram_30px.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Talatona TRAV-C CC2");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/location_25px.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Talatona TRAV-C CC2");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        btnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/right_arrow_25px.png"))); // NOI18N
        btnRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRightMouseClicked(evt);
            }
        });
        jPanel1.add(btnRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, -1, -1));

        btnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/left_arrow_25px.png"))); // NOI18N
        btnLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLeftMouseClicked(evt);
            }
        });
        jPanel1.add(btnLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        pnlBottom.setBackground(new java.awt.Color(255, 255, 255));
        pnlBottom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Josué Dias Panzo");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Administrador");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user_25px.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cargo_25px.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/clock_25px.png"))); // NOI18N

        lblData.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        lblData.setForeground(new java.awt.Color(153, 153, 153));
        lblData.setText("dd / MM / yyyy");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/date_25px.png"))); // NOI18N

        lblHora.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        lblHora.setForeground(new java.awt.Color(153, 153, 153));
        lblHora.setText("00 : 00");

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 630, Short.MAX_VALUE)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHora)
                    .addComponent(lblData))
                .addGap(37, 37, 37))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblData)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHora)
                            .addComponent(jLabel19)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))))
                .addContainerGap())
        );

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setBackground(new java.awt.Color(204, 204, 255));
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblSlide1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSlide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/724313.jpg"))); // NOI18N

        lblSlide2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSlide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/786545.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblSlide1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(268, 268, 268))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblSlide2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblSlide1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(156, 156, 156))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblSlide2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jInternalFrame1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 2060, 1050));

        jDesktopPane1.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -90, 2060, 1060));

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );

        jMenuBar2.setBorder(null);
        jMenuBar2.setPreferredSize(new java.awt.Dimension(426, 30));

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/home_25px.png"))); // NOI18N
        jMenu3.setText("Sistema");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/close_session_25px.png"))); // NOI18N
        jMenuItem1.setText("Terminar Sessão");
        jMenu3.add(jMenuItem1);

        menuTFarmaceutico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/func_male_25px.png"))); // NOI18N
        menuTFarmaceutico.setText("Farmaceutico");
        menuTFarmaceutico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTFarmaceuticoActionPerformed(evt);
            }
        });
        jMenu3.add(menuTFarmaceutico);

        menuTUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user_male_25px.png"))); // NOI18N
        menuTUsuario.setText("Usuários");
        menuTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTUsuarioActionPerformed(evt);
            }
        });
        jMenu3.add(menuTUsuario);

        menuTSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/shutdown_25px.png"))); // NOI18N
        menuTSair.setText("Sair");
        menuTSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTSairActionPerformed(evt);
            }
        });
        jMenu3.add(menuTSair);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Processos");
        jMenuBar2.add(jMenu4);

        jMenu1.setText("Consultas");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Estatisticas");
        jMenuBar2.add(jMenu2);

        jMenu5.setText("Utilitários");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Sobre");
        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        // TODO add your handling code here:
        moverRightLeft();
    }//GEN-LAST:event_btnMenuMouseClicked

    private void lblVendaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendaMouseMoved
        // TODO add your handling code here:
        lblVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_lblVendaMouseMoved

    private void lblVendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendaMouseExited
        // TODO add your handling code here:
        lblVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lblVendaMouseExited

    private void btnSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMousePressed
        // TODO add your handling code here:
        int sair = JOptionPane.showConfirmDialog(null, "Tens certeza que desejas"
                + " sair do sistema", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairMousePressed

    private void btnMinimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMousePressed
        // TODO add your handling code here:
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMousePressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        AnimationClass ac = new AnimationClass();
        ac.jLabelXLeft(0, -1000, 25, 5, lblSlide1);
        
        AnimationClass acc = new AnimationClass();
        acc.jLabelXLeft(1000, 0, 25, 5, lblSlide2);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        lblData.setText(formato.format(data));

        /*Timer horaAtual = new Timer(1000, new hora());
        horaAtual.start();*/
    }//GEN-LAST:event_formWindowOpened

    private void menuTFarmaceuticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTFarmaceuticoActionPerformed
        // TODO add your handling code here:
        this.openTelaUsuario();
    }//GEN-LAST:event_menuTFarmaceuticoActionPerformed

    private void btnLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLeftMouseClicked
        // TODO add your handling code here:
        AnimationClass ac = new AnimationClass();
        ac.jLabelXLeft(-1000, 0, 25, 5, lblSlide1);
        
        AnimationClass acc = new AnimationClass();
        acc.jLabelXLeft(0, 1000, 25, 5, lblSlide2);
    }//GEN-LAST:event_btnLeftMouseClicked

    private void btnRightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRightMouseClicked
        // TODO add your handling code here:
        AnimationClass ac = new AnimationClass();
        ac.jLabelXLeft(0, -1000, 25, 5, lblSlide1);
        
        AnimationClass acc = new AnimationClass();
        acc.jLabelXLeft(1000, 0, 25, 5, lblSlide2);
    }//GEN-LAST:event_btnRightMouseClicked

    private void menuTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTUsuarioActionPerformed
        // TODO add your handling code here:
        this.openTelaUsuario();
    }//GEN-LAST:event_menuTUsuarioActionPerformed

    private void menuTSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuTSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    private void moverRightLeft() {
        AnimationClass lblVendaRight = new AnimationClass();
        lblVendaRight.jLabelXRight(-40, 10, 10, 5, this.lblVenda);

        AnimationClass lblVendaLeft = new AnimationClass();
        lblVendaLeft.jLabelXLeft(10, -40, 10, 5, this.lblVenda);

        AnimationClass lblPagamentoRight = new AnimationClass();
        lblPagamentoRight.jLabelXRight(-40, 10, 10, 5, this.lblPagamento);

        AnimationClass lblPagamentoLeft = new AnimationClass();
        lblPagamentoLeft.jLabelXLeft(10, -40, 10, 5, this.lblPagamento);

        AnimationClass lblProdutoRight = new AnimationClass();
        lblProdutoRight.jLabelXRight(-40, 10, 10, 5, this.lblProduto);

        AnimationClass lblProdutoLeft = new AnimationClass();
        lblProdutoLeft.jLabelXLeft(10, -40, 10, 5, this.lblProduto);
    }
    
    private void openTelaUsuario() {
        TelaUsuario telaUsuario = new TelaUsuario();
        telaUsuario.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLeft;
    private javax.swing.JLabel btnMenu;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel btnRight;
    private javax.swing.JLabel btnSair;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblPagamento;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblSlide1;
    private javax.swing.JLabel lblSlide2;
    private javax.swing.JLabel lblVenda;
    private javax.swing.JMenuItem menuTFarmaceutico;
    private javax.swing.JMenuItem menuTSair;
    private javax.swing.JMenuItem menuTUsuario;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlTop;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e2) {
            Calendar now = Calendar.getInstance();
            lblHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }

}
