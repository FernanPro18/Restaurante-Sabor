package View;

import Controller.VendedorController;
import Model.Vendedorm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Vendedor extends javax.swing.JFrame {

    private VendedorController venco = new VendedorController();
    private Object index = null;

    private int x, y;

    public Vendedor() {
        initComponents();
        setLocationRelativeTo(null);
        listarTodo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_NombreVendedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_NumeroDocumento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_IdVendedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_TelefonoVendedor = new javax.swing.JTextField();
        btn_VentaVendedor = new javax.swing.JButton();
        btn_MenuVendedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_TablaVendedor = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btn_Modificar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_RegistrarVendedor1 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_Buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_CancelarBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Registrar vendedor");

        jLabel4.setText("Nombre completo");

        txt_NombreVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NombreVendedorKeyTyped(evt);
            }
        });

        jLabel5.setText("nº documento:");

        txt_NumeroDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NumeroDocumentoKeyTyped(evt);
            }
        });

        jLabel6.setText("Id del vendedor:");

        txt_IdVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IdVendedorKeyTyped(evt);
            }
        });

        jLabel7.setText("Telefono");

        txt_TelefonoVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TelefonoVendedorKeyTyped(evt);
            }
        });

        btn_VentaVendedor.setText("Venta");
        btn_VentaVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VentaVendedorMouseClicked(evt);
            }
        });

        btn_MenuVendedor.setText("Menu");
        btn_MenuVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenuVendedorMouseClicked(evt);
            }
        });

        tbl_TablaVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Documento", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_TablaVendedor.getTableHeader().setReorderingAllowed(false);
        tbl_TablaVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TablaVendedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_TablaVendedor);
        if (tbl_TablaVendedor.getColumnModel().getColumnCount() > 0) {
            tbl_TablaVendedor.getColumnModel().getColumn(0).setResizable(false);
            tbl_TablaVendedor.getColumnModel().getColumn(1).setResizable(false);
            tbl_TablaVendedor.getColumnModel().getColumn(2).setResizable(false);
            tbl_TablaVendedor.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setText("Productos ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_Modificar.setText("Modificar");
        btn_Modificar.setEnabled(false);
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.setEnabled(false);
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.setEnabled(false);
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_RegistrarVendedor1.setText("Registrar");
        btn_RegistrarVendedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarVendedor1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btn_RegistrarVendedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btn_RegistrarVendedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registro", jPanel3);

        jLabel8.setText("Buscar Vendedor por nombre");

        txt_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BuscarKeyTyped(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_CancelarBuscar.setText("Cancelar");
        btn_CancelarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_CancelarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel8)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_CancelarBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Buscar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addComponent(txt_NombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel5)
                                .addGap(39, 39, 39)
                                .addComponent(txt_NumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel6)
                                .addGap(33, 33, 33)
                                .addComponent(txt_IdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel7)
                                .addGap(68, 68, 68)
                                .addComponent(txt_TelefonoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btn_MenuVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(btn_VentaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4))
                            .addComponent(txt_NombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5))
                            .addComponent(txt_NumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_IdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txt_TelefonoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_MenuVendedor)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_VentaVendedor)
                                .addComponent(jButton1))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento para pasar a la ventana Venta
    private void btn_VentaVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VentaVendedorMouseClicked
        Venta venta = new Venta();
        venta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VentaVendedorMouseClicked

    //Evento para pasar a la ventana Menu
    private void btn_MenuVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuVendedorMouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_MenuVendedorMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        RegistrarProducto registrarproducto = new RegistrarProducto();
        registrarproducto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        try {
            if (ConfirmDialog("¿Desea editar el producto?")) {
                
                btn_RegistrarVendedor1.setEnabled(true);
                btn_Modificar.setEnabled(false);

                btn_RegistrarVendedor1.setText("Guardar");

                HabilitarTxtField(txt_NombreVendedor, txt_IdVendedor, txt_NumeroDocumento, txt_TelefonoVendedor, true);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revise que los campos han sido llenados correctamente.", "Error", 0);
        }
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void tbl_TablaVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TablaVendedorMouseClicked
        try {
            btn_Cancelar.doClick();
            if (evt.getButton() != 3 && evt.getButton() != 2) {
                HabilitarBotones(btn_Modificar, btn_Eliminar, btn_Cancelar, true);
                index = tbl_TablaVendedor.getSelectedRow();
                HabilitarTxtField(txt_NombreVendedor, txt_IdVendedor, txt_NumeroDocumento, txt_TelefonoVendedor, false);

                txt_IdVendedor.setText(tbl_TablaVendedor.getValueAt(tbl_TablaVendedor.getSelectedRow(), 0).toString());
                txt_NombreVendedor.setText(tbl_TablaVendedor.getValueAt(tbl_TablaVendedor.getSelectedRow(), 1).toString());
                txt_NumeroDocumento.setText(tbl_TablaVendedor.getValueAt(tbl_TablaVendedor.getSelectedRow(), 2).toString());
                txt_TelefonoVendedor.setText(tbl_TablaVendedor.getValueAt(tbl_TablaVendedor.getSelectedRow(), 3).toString());
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Para seleccionar un vendedor es con clic izquierdo.");
            btn_Cancelar.doClick();
        }


    }//GEN-LAST:event_tbl_TablaVendedorMouseClicked

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        try {
            if (ConfirmDialog("¿Desea eliminar el producto?")) {
                venco.Delete((int) index);

                index = null;

                btn_Cancelar.setEnabled(false);
                btn_Modificar.setEnabled(false);
                btn_Eliminar.setEnabled(false);
                BorrarTextField(txt_NombreVendedor, txt_IdVendedor, txt_NumeroDocumento, txt_TelefonoVendedor);
                HabilitarTxtField(txt_NombreVendedor, txt_IdVendedor, txt_NumeroDocumento, txt_TelefonoVendedor, true);
                btn_RegistrarVendedor1.setText("Registrar");
                
                listarTodo();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Puede que no exista mas item para eliminar.", "Error", 0);
        }

    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_RegistrarVendedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarVendedor1ActionPerformed
        try {
            if (ValCeroEspacio(txt_NombreVendedor.getText(), txt_NumeroDocumento.getText(), txt_IdVendedor.getText())) {
                if (ValCodigo(txt_IdVendedor.getText()) || txt_IdVendedor.getText().equalsIgnoreCase((String)tbl_TablaVendedor.getValueAt(tbl_TablaVendedor.getSelectedRow(), 0).toString())) {
                    if (btn_RegistrarVendedor1.getText().equalsIgnoreCase("Registrar")) {

                        if (ConfirmDialog("¿Desea Registrar?")) {
                            venco.create(new Vendedorm(txt_NombreVendedor.getText().toUpperCase(),
                                    txt_NumeroDocumento.getText(),
                                    txt_IdVendedor.getText(),
                                    txt_TelefonoVendedor.getText()));
                            txt_NombreVendedor.setText("");
                            txt_IdVendedor.setText("");
                            txt_NumeroDocumento.setText("");
                            txt_TelefonoVendedor.setText("");

                            listarTodo();
                        }

                    } else if (btn_RegistrarVendedor1.getText().equalsIgnoreCase("Guardar")) {

                        if (ConfirmDialog("¿Desea Guardar?")) {
                            venco.Update((int) index, new Vendedorm(txt_NombreVendedor.getText(),
                                    txt_NumeroDocumento.getText(),
                                    txt_IdVendedor.getText(),
                                    txt_TelefonoVendedor.getText()));
                            btn_Eliminar.setEnabled(false);
                            btn_Cancelar.setEnabled(false);
                            btn_RegistrarVendedor1.setText("Registrar");
                            
                            listarTodo();
                            txt_NombreVendedor.setText("");
                            txt_IdVendedor.setText("");
                            txt_NumeroDocumento.setText("");
                            txt_TelefonoVendedor.setText("");
                            index = null;
                        }

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El ID del vendedor ya existe.", "Error", 0);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos.", "Error", 0);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revise que los campos han sido llenados correctamente.", "Error", 0);
        }


    }//GEN-LAST:event_btn_RegistrarVendedor1ActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        BorrarTextField(txt_NombreVendedor, txt_NumeroDocumento, txt_IdVendedor, txt_TelefonoVendedor);
        HabilitarTxtField(txt_NombreVendedor, txt_IdVendedor, txt_NumeroDocumento, txt_TelefonoVendedor, true);
        btn_RegistrarVendedor1.setText("Registrar");
        

        btn_Modificar.setEnabled(false);
        btn_Eliminar.setEnabled(false);
        btn_Cancelar.setEnabled(false);

        index = null;
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        BuscarTodo(txt_Buscar.getText().toUpperCase(),
                tbl_TablaVendedor,
                venco.Read(txt_Buscar.getText().toUpperCase()),
                btn_CancelarBuscar);

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_CancelarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarBuscarActionPerformed

        listarTodo();
        btn_CancelarBuscar.setEnabled(false);

        txt_Buscar.setText(null);

    }//GEN-LAST:event_btn_CancelarBuscarActionPerformed

    private void txt_NumeroDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NumeroDocumentoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txt_NumeroDocumentoKeyTyped

    private void txt_IdVendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdVendedorKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
        }
        if (txt_IdVendedor.getText().length() >= 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 8 digitos.", "Informacion", 1);
        }

    }//GEN-LAST:event_txt_IdVendedorKeyTyped

    private void txt_TelefonoVendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TelefonoVendedorKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
        }

    }//GEN-LAST:event_txt_TelefonoVendedorKeyTyped

    private void txt_NombreVendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombreVendedorKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_NombreVendedorKeyTyped

    private void txt_BuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_BuscarKeyTyped

    private boolean ConfirmDialog(String texto) {
        int num = JOptionPane.showConfirmDialog(null, texto);
        if (num == JOptionPane.YES_OPTION) {
            return true;
        } else if (num == JOptionPane.NO_OPTION) {
            return false;
        } else {
            index = null;
            return false;
        }

    }

    //Este Metodo Sirve Para Listar las Tablas
    private void Listar(DefaultTableModel Tabla, ArrayList<String[]> Lista) {
        //Elimino todas las filas
        while (Tabla.getRowCount() != 0) {
            Tabla.removeRow(0);
        }
        //Agrego las Filas
        for (String[] Row : Lista) {
            Tabla.addRow(Row);
        }
    }

    //Metodo para listar todas la tablas de la vista modificar producto
    private void listarTodo() {
        Listar((DefaultTableModel) tbl_TablaVendedor.getModel(), venco.ReadAll());

    }

    //Metodo para borrar TextField 
    private void BorrarTextField(JTextField nombre, JTextField Id, JTextField n_documento, JTextField telefono) {
        nombre.setText(null);
        Id.setText(null);
        n_documento.setText(null);
        telefono.setText(null);
    }

    //Metodo para habilitar JTextField de la vista Modificar producto
    private void HabilitarTxtField(JTextField nombre, JTextField Id, JTextField n_documento, JTextField telefono, boolean Cond) {
        nombre.setEnabled(Cond);
        Id.setEnabled(Cond);
        n_documento.setEnabled(Cond);
        telefono.setEnabled(Cond);
    }

    //Metodo para habilitar botones
    private void HabilitarBotones(JButton modificar, JButton eliminar, JButton cancelar, boolean Cond) {
        modificar.setEnabled(Cond);
        eliminar.setEnabled(Cond);
        cancelar.setEnabled(Cond);

    }

    //Metodo para buscar, enlistar la busqueda y habilitar un boton
    private void BuscarTodo(String Filter, JTable Tabla, ArrayList Array, JButton Cancelar) {
        //Valido la entrada del buscar
        if (Filter.isEmpty() || Filter == null) {
            JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
        } else if (Array.size() <= 0 || Array == null) {
            JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias", "No se han encontrado", 1);
        } else {
            Listar((DefaultTableModel) Tabla.getModel(), Array);
            Cancelar.setEnabled(true);
        }
    }

    //Validar que los campos del vendedor no queden vacios
    public boolean ValCeroEspacio(String nombre, String documento, String id) {
        try {
            if (nombre.isEmpty() || nombre == null || id.isEmpty() || id == null || documento == null || documento.isEmpty()) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }

    }

    //Metodo para validar que el codigo no se repita
    public boolean ValCodigo(String codigo) {
        for (int i = 0; i < venco.getVendedor().size(); i++) {
            if (venco.getVendedor().get(i).getID().equals(codigo)) {
                return false;
            }
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_CancelarBuscar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_MenuVendedor;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JToggleButton btn_RegistrarVendedor1;
    private javax.swing.JButton btn_VentaVendedor;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_TablaVendedor;
    private javax.swing.JTextField txt_Buscar;
    private javax.swing.JTextField txt_IdVendedor;
    private javax.swing.JTextField txt_NombreVendedor;
    private javax.swing.JTextField txt_NumeroDocumento;
    private javax.swing.JTextField txt_TelefonoVendedor;
    // End of variables declaration//GEN-END:variables
}
