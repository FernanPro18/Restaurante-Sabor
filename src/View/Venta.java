package View;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Controller.ProductoController;
import Controller.VentaController;
import Controller.VendedorController;
import Model.Producto;
import Model.Vendedorm;
import Model.VentaM;
import java.util.UUID;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextPane;

public class Venta extends javax.swing.JFrame {

    private int x, y;
    private ProductoController proco = new ProductoController();
    private VentaController venco = new VentaController();
    private VendedorController vendeco = new VendedorController();
    private Object Index = null;
    private Object IndexCmbx = null;
    private Object IndexCmbxx = null;

    public Venta() {
        initComponents();
        setLocationRelativeTo(null);
        Subtotal(tp_TotalPagarVenta);
        ListarCombobox(cmbx_VendedorVenta1, vendeco.getVendedor());
        ListarCombobox(cmbx_VendedorVenta, vendeco.getVendedor());
        ListarTodo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_MenuVenta = new javax.swing.JButton();
        btn_ProductosVenta = new javax.swing.JButton();
        btn_VendedoresVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ProductosVenta = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_CarritoVenta = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tp_TotalPagarVenta = new javax.swing.JTextPane();
        btn_AgregarVenta = new javax.swing.JButton();
        btn_RetirarVenta = new javax.swing.JButton();
        btn_BuscarVenta = new javax.swing.JButton();
        txt_BuscarProductoVenta = new javax.swing.JTextField();
        btn_ComprarVenta = new javax.swing.JButton();
        btn_CancelarBusquedaProdVenta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_Cantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        cmbx_VendedorVenta = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btn_CancelarCompra = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_ProductosVenta1 = new javax.swing.JTable();
        txt_BuscarProductoVenta1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_BuscarVenta1 = new javax.swing.JButton();
        btn_CancelarBusquedaProdVenta1 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_CarritoVenta1 = new javax.swing.JTable();
        btn_RetirarVenta1 = new javax.swing.JButton();
        btn_AgregarVenta1 = new javax.swing.JButton();
        txt_Direccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_nombre1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_Cantidad1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cmbx_VendedorVenta1 = new javax.swing.JComboBox<>();
        btn_ComprarVenta1 = new javax.swing.JButton();
        btn_ProductosVenta1 = new javax.swing.JButton();
        btn_VendedoresVenta1 = new javax.swing.JButton();
        btn_MenuVenta1 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tp_TotalPagarVenta1 = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        btn_CancelarCompra1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_RegistroVenta = new javax.swing.JTable();
        btn_BuscarRegistroVenta = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_TotalRegistroVenta = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        txt_BuscarRegistroVenta = new javax.swing.JTextField();
        btn_CancelarBusquedaRegistroVenta = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txt_TotalRegistroVentaDomicilio = new javax.swing.JTextPane();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl_RegistroVentaDomicilio = new javax.swing.JTable();
        txt_BuscarRegistroVentaDomicilio = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btn_BuscarRegistroVentaDomicilio = new javax.swing.JButton();
        btn_CancelarBusquedaRegistroVentaDomicilio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Total a pagar:");

        btn_MenuVenta.setText("Menu");
        btn_MenuVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenuVentaMouseClicked(evt);
            }
        });
        btn_MenuVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenuVentaActionPerformed(evt);
            }
        });

        btn_ProductosVenta.setText("Productos ");
        btn_ProductosVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ProductosVentaMouseClicked(evt);
            }
        });
        btn_ProductosVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductosVentaActionPerformed(evt);
            }
        });

        btn_VendedoresVenta.setText("Vendedores");
        btn_VendedoresVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VendedoresVentaMouseClicked(evt);
            }
        });

        tbl_ProductosVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio Unidad", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ProductosVenta.getTableHeader().setReorderingAllowed(false);
        tbl_ProductosVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ProductosVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_ProductosVenta);
        if (tbl_ProductosVenta.getColumnModel().getColumnCount() > 0) {
            tbl_ProductosVenta.getColumnModel().getColumn(0).setResizable(false);
            tbl_ProductosVenta.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbl_ProductosVenta.getColumnModel().getColumn(1).setResizable(false);
            tbl_ProductosVenta.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbl_ProductosVenta.getColumnModel().getColumn(2).setResizable(false);
            tbl_ProductosVenta.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbl_ProductosVenta.getColumnModel().getColumn(3).setResizable(false);
            tbl_ProductosVenta.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        tbl_CarritoVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio Unidad", "Cantidad", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_CarritoVenta.getTableHeader().setReorderingAllowed(false);
        tbl_CarritoVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_CarritoVentaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_CarritoVenta);
        if (tbl_CarritoVenta.getColumnModel().getColumnCount() > 0) {
            tbl_CarritoVenta.getColumnModel().getColumn(0).setResizable(false);
            tbl_CarritoVenta.getColumnModel().getColumn(1).setResizable(false);
            tbl_CarritoVenta.getColumnModel().getColumn(2).setResizable(false);
            tbl_CarritoVenta.getColumnModel().getColumn(3).setResizable(false);
            tbl_CarritoVenta.getColumnModel().getColumn(4).setResizable(false);
        }

        tp_TotalPagarVenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tp_TotalPagarVenta.setText("0.0");
        tp_TotalPagarVenta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tp_TotalPagarVenta.setEnabled(false);
        jScrollPane4.setViewportView(tp_TotalPagarVenta);

        btn_AgregarVenta.setText("Agregar");
        btn_AgregarVenta.setEnabled(false);
        btn_AgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarVentaActionPerformed(evt);
            }
        });

        btn_RetirarVenta.setText("Retirar");
        btn_RetirarVenta.setEnabled(false);
        btn_RetirarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RetirarVentaActionPerformed(evt);
            }
        });

        btn_BuscarVenta.setText("Buscar");
        btn_BuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarVentaActionPerformed(evt);
            }
        });

        txt_BuscarProductoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BuscarProductoVentaKeyTyped(evt);
            }
        });

        btn_ComprarVenta.setText("Comprar");
        btn_ComprarVenta.setEnabled(false);
        btn_ComprarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComprarVentaActionPerformed(evt);
            }
        });

        btn_CancelarBusquedaProdVenta.setText("Cancelar Busqueda");
        btn_CancelarBusquedaProdVenta.setEnabled(false);
        btn_CancelarBusquedaProdVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarBusquedaProdVentaActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad");

        txt_Cantidad.setEnabled(false);
        txt_Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CantidadActionPerformed(evt);
            }
        });
        txt_Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CantidadKeyTyped(evt);
            }
        });

        jLabel4.setText("Nombre");

        txt_nombre.setEnabled(false);

        cmbx_VendedorVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbx_VendedorVentaActionPerformed(evt);
            }
        });

        jLabel6.setText("Vendedor");

        btn_CancelarCompra.setText("Cancelar Compra");
        btn_CancelarCompra.setEnabled(false);
        btn_CancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarCompraActionPerformed(evt);
            }
        });

        jLabel11.setText("Nombre del producto para buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_BuscarProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_BuscarVenta))
                    .addComponent(jLabel11))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(682, 682, 682)
                        .addComponent(btn_ComprarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_CancelarBusquedaProdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(686, 686, 686))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_MenuVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_VendedoresVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ProductosVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_CancelarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane2)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel4))
                                            .addComponent(txt_nombre))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel2))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_Cantidad)))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbx_VendedorVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(168, 168, 168)))
                                        .addGap(46, 46, 46))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(286, 286, 286)
                                        .addComponent(btn_AgregarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(42, 42, 42)
                                        .addComponent(btn_RetirarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(100, 100, 100))))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btn_BuscarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txt_BuscarProductoVenta))
                            .addComponent(btn_CancelarBusquedaProdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btn_ComprarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nombre)
                                    .addComponent(txt_Cantidad))
                                .addGap(6, 6, 6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(2, 2, 2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(cmbx_VendedorVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_AgregarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(btn_RetirarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_CancelarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_MenuVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_VendedoresVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ProductosVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(143, 143, 143))
        );

        jTabbedPane1.addTab("Ventas", jPanel2);

        tbl_ProductosVenta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio Unidad", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ProductosVenta1.getTableHeader().setReorderingAllowed(false);
        tbl_ProductosVenta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ProductosVenta1MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbl_ProductosVenta1);
        if (tbl_ProductosVenta1.getColumnModel().getColumnCount() > 0) {
            tbl_ProductosVenta1.getColumnModel().getColumn(0).setResizable(false);
            tbl_ProductosVenta1.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbl_ProductosVenta1.getColumnModel().getColumn(1).setResizable(false);
            tbl_ProductosVenta1.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbl_ProductosVenta1.getColumnModel().getColumn(2).setResizable(false);
            tbl_ProductosVenta1.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbl_ProductosVenta1.getColumnModel().getColumn(3).setResizable(false);
            tbl_ProductosVenta1.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        txt_BuscarProductoVenta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BuscarProductoVenta1KeyTyped(evt);
            }
        });

        jLabel12.setText("Nombre del producto para buscar");

        btn_BuscarVenta1.setText("Buscar");
        btn_BuscarVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarVenta1ActionPerformed(evt);
            }
        });

        btn_CancelarBusquedaProdVenta1.setText("Cancelar Busqueda");
        btn_CancelarBusquedaProdVenta1.setEnabled(false);
        btn_CancelarBusquedaProdVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarBusquedaProdVenta1ActionPerformed(evt);
            }
        });

        tbl_CarritoVenta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio Unidad", "Cantidad", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_CarritoVenta1.getTableHeader().setReorderingAllowed(false);
        tbl_CarritoVenta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_CarritoVenta1MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_CarritoVenta1);
        if (tbl_CarritoVenta1.getColumnModel().getColumnCount() > 0) {
            tbl_CarritoVenta1.getColumnModel().getColumn(0).setResizable(false);
            tbl_CarritoVenta1.getColumnModel().getColumn(1).setResizable(false);
            tbl_CarritoVenta1.getColumnModel().getColumn(2).setResizable(false);
            tbl_CarritoVenta1.getColumnModel().getColumn(3).setResizable(false);
            tbl_CarritoVenta1.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_RetirarVenta1.setText("Retirar");
        btn_RetirarVenta1.setEnabled(false);
        btn_RetirarVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RetirarVenta1ActionPerformed(evt);
            }
        });

        btn_AgregarVenta1.setText("Agregar");
        btn_AgregarVenta1.setEnabled(false);
        btn_AgregarVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarVenta1ActionPerformed(evt);
            }
        });

        txt_Direccion.setEnabled(false);
        txt_Direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DireccionKeyTyped(evt);
            }
        });

        jLabel14.setText("Dirección");

        txt_nombre1.setEnabled(false);

        jLabel5.setText("Nombre");

        jLabel15.setText("Cantidad");

        txt_Cantidad1.setEnabled(false);
        txt_Cantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Cantidad1ActionPerformed(evt);
            }
        });
        txt_Cantidad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Cantidad1KeyTyped(evt);
            }
        });

        jLabel16.setText("Vendedor");

        cmbx_VendedorVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbx_VendedorVenta1ActionPerformed(evt);
            }
        });

        btn_ComprarVenta1.setText("Comprar");
        btn_ComprarVenta1.setEnabled(false);
        btn_ComprarVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComprarVenta1ActionPerformed(evt);
            }
        });

        btn_ProductosVenta1.setText("Productos ");
        btn_ProductosVenta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ProductosVenta1MouseClicked(evt);
            }
        });
        btn_ProductosVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductosVenta1ActionPerformed(evt);
            }
        });

        btn_VendedoresVenta1.setText("Vendedores");
        btn_VendedoresVenta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VendedoresVenta1MouseClicked(evt);
            }
        });
        btn_VendedoresVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VendedoresVenta1ActionPerformed(evt);
            }
        });

        btn_MenuVenta1.setText("Menu");
        btn_MenuVenta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenuVenta1MouseClicked(evt);
            }
        });
        btn_MenuVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenuVenta1ActionPerformed(evt);
            }
        });

        tp_TotalPagarVenta1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tp_TotalPagarVenta1.setText("0.0");
        tp_TotalPagarVenta1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tp_TotalPagarVenta1.setEnabled(false);
        jScrollPane7.setViewportView(tp_TotalPagarVenta1);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setText("Total a pagar:");

        btn_CancelarCompra1.setText("Cancelar Compra");
        btn_CancelarCompra1.setEnabled(false);
        btn_CancelarCompra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarCompra1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_BuscarProductoVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_BuscarVenta1))
                    .addComponent(jLabel12))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ComprarVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btn_CancelarBusquedaProdVenta1)
                                .addGap(486, 486, 486))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btn_AgregarVenta1)
                                .addGap(42, 42, 42)))
                        .addComponent(btn_RetirarVenta1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel5))
                                    .addComponent(txt_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_Cantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbx_VendedorVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel14)))
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane8)
                        .addContainerGap())))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_MenuVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_VendedoresVenta1)
                .addGap(18, 18, 18)
                .addComponent(btn_ProductosVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_CancelarCompra1)
                        .addGap(384, 384, 384)))
                .addGap(42, 42, 42))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_BuscarVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_BuscarProductoVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_CancelarBusquedaProdVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btn_ComprarVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(5, 5, 5)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Cantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(2, 2, 2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(cmbx_VendedorVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_AgregarVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_RetirarVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_VendedoresVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_ProductosVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_MenuVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_CancelarCompra1)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ventas a domicilio", jPanel1);

        tbl_RegistroVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Vendedor", "Codigo del Vendedor", "Codigo del Producto", "Precio por Unidad", "Cantidad Vendida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_RegistroVenta.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbl_RegistroVenta);
        if (tbl_RegistroVenta.getColumnModel().getColumnCount() > 0) {
            tbl_RegistroVenta.getColumnModel().getColumn(0).setResizable(false);
            tbl_RegistroVenta.getColumnModel().getColumn(1).setResizable(false);
            tbl_RegistroVenta.getColumnModel().getColumn(2).setResizable(false);
            tbl_RegistroVenta.getColumnModel().getColumn(3).setResizable(false);
            tbl_RegistroVenta.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_BuscarRegistroVenta.setText("Buscar");
        btn_BuscarRegistroVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarRegistroVentaActionPerformed(evt);
            }
        });

        txt_TotalRegistroVenta.setEditable(false);
        txt_TotalRegistroVenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_TotalRegistroVenta.setText("0.0");
        jScrollPane5.setViewportView(txt_TotalRegistroVenta);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Total venta:");

        txt_BuscarRegistroVenta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_BuscarRegistroVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BuscarRegistroVentaKeyTyped(evt);
            }
        });

        btn_CancelarBusquedaRegistroVenta.setText("Cancelar Busqueda");
        btn_CancelarBusquedaRegistroVenta.setEnabled(false);
        btn_CancelarBusquedaRegistroVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarBusquedaRegistroVentaActionPerformed(evt);
            }
        });

        jLabel10.setText("Codigo del vendedor para buscar");

        txt_TotalRegistroVentaDomicilio.setEditable(false);
        txt_TotalRegistroVentaDomicilio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_TotalRegistroVentaDomicilio.setText("0.0");
        jScrollPane9.setViewportView(txt_TotalRegistroVentaDomicilio);

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setText("Total venta:");

        tbl_RegistroVentaDomicilio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Vendedor", "Codigo del Vendedor", "Direccion", "Precio por Unidad", "Cantidad Vendida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_RegistroVentaDomicilio.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(tbl_RegistroVentaDomicilio);
        if (tbl_RegistroVentaDomicilio.getColumnModel().getColumnCount() > 0) {
            tbl_RegistroVentaDomicilio.getColumnModel().getColumn(0).setResizable(false);
            tbl_RegistroVentaDomicilio.getColumnModel().getColumn(1).setResizable(false);
            tbl_RegistroVentaDomicilio.getColumnModel().getColumn(2).setResizable(false);
            tbl_RegistroVentaDomicilio.getColumnModel().getColumn(3).setResizable(false);
            tbl_RegistroVentaDomicilio.getColumnModel().getColumn(4).setResizable(false);
        }

        txt_BuscarRegistroVentaDomicilio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_BuscarRegistroVentaDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BuscarRegistroVentaDomicilioKeyTyped(evt);
            }
        });

        jLabel18.setText("Codigo del vendedor para buscar");

        btn_BuscarRegistroVentaDomicilio.setText("Buscar");
        btn_BuscarRegistroVentaDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarRegistroVentaDomicilioActionPerformed(evt);
            }
        });

        btn_CancelarBusquedaRegistroVentaDomicilio.setText("Cancelar Busqueda");
        btn_CancelarBusquedaRegistroVentaDomicilio.setEnabled(false);
        btn_CancelarBusquedaRegistroVentaDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarBusquedaRegistroVentaDomicilioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Ventas");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Ventas a domicilio");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 609, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_CancelarBusquedaRegistroVenta)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(txt_BuscarRegistroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(btn_BuscarRegistroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane10)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_CancelarBusquedaRegistroVentaDomicilio)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(txt_BuscarRegistroVentaDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(38, 38, 38)
                                            .addComponent(btn_BuscarRegistroVentaDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(51, 51, 51)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_BuscarRegistroVenta)
                    .addComponent(txt_BuscarRegistroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_CancelarBusquedaRegistroVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane5))
                .addGap(40, 40, 40)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_BuscarRegistroVentaDomicilio)
                    .addComponent(txt_BuscarRegistroVentaDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_CancelarBusquedaRegistroVentaDomicilio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17))
                    .addComponent(jScrollPane9))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro de Ventas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento para pasar a la ventana Menu
    private void btn_MenuVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuVentaMouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_MenuVentaMouseClicked

    //Evento para pasar a la ventana Vendedor
    private void btn_VendedoresVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VendedoresVentaMouseClicked
        Vendedor vendedor = new Vendedor();
        vendedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VendedoresVentaMouseClicked

    private void btn_ProductosVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosVentaMouseClicked

        RegistrarProducto registrarproducto = new RegistrarProducto();
        registrarproducto.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_ProductosVentaMouseClicked

    private void btn_ProductosVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductosVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ProductosVentaActionPerformed

    private void btn_BuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarVentaActionPerformed
        BuscarTodo(txt_BuscarProductoVenta.getText().toUpperCase(), tbl_ProductosVenta, proco.Read(txt_BuscarProductoVenta.getText().toUpperCase()), btn_CancelarBusquedaProdVenta);
    }//GEN-LAST:event_btn_BuscarVentaActionPerformed

    private void btn_CancelarBusquedaProdVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarBusquedaProdVentaActionPerformed
        ListarTodo();
        btn_CancelarBusquedaProdVenta.setEnabled(false);

    }//GEN-LAST:event_btn_CancelarBusquedaProdVentaActionPerformed

    private void txt_CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CantidadActionPerformed

    private void tbl_ProductosVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ProductosVentaMouseClicked
        try {
            if (evt.getButton() != 3 && evt.getButton() != 2) {
                Index = null;
                SelecTable(tbl_ProductosVenta, btn_AgregarVenta, true);
                txt_Cantidad.setEnabled(true);
                txt_nombre.setText(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 1).toString());
                btn_RetirarVenta.setEnabled(false);
            } else {
                Index = null;
                txt_nombre.setText(null);
                txt_Cantidad.setText(null);
            }

        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            Index = null;
            txt_nombre.setText(null);
            txt_nombre.setText(null);
            txt_Cantidad.setText(null);
        }


    }//GEN-LAST:event_tbl_ProductosVentaMouseClicked

    private void tbl_CarritoVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CarritoVentaMouseClicked
        try {
            Index = null;
            SelecTable(tbl_CarritoVenta, btn_RetirarVenta, true);
            txt_Cantidad.setEnabled(true);
            txt_nombre.setText(tbl_CarritoVenta.getValueAt(tbl_CarritoVenta.getSelectedRow(), 1).toString());
            btn_AgregarVenta.setEnabled(false);
            Index = tbl_CarritoVenta.getSelectedRow();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Para seleccionar un producto es con clic izquierdo.");
        }

    }//GEN-LAST:event_tbl_CarritoVentaMouseClicked

    private void btn_AgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarVentaActionPerformed

        try {
            if (ValCeroEspacio(txt_nombre.getText(), txt_Cantidad.getText())) {
                if (Integer.parseInt(txt_Cantidad.getText()) <= Integer.parseInt(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 3).toString()) && Integer.parseInt(txt_Cantidad.getText()) >= 1) {
                    venco.CreateB(new VentaM(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 0).toString(),
                            tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 1).toString(),
                            Double.parseDouble(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 2).toString()),
                            Integer.parseInt(txt_Cantidad.getText()), (String) cmbx_VendedorVenta.getSelectedItem(),
                            Double.parseDouble(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 2).toString())
                            * Integer.parseInt(txt_Cantidad.getText()), vendeco.getVendedor().get((int) IndexCmbx).getID(), UUID.randomUUID().toString(), false));

                    proco.Update(tbl_ProductosVenta.getSelectedRow(), new Producto(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 0).toString(), tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 1).toString(),
                            Double.parseDouble(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 2).toString()), proco.getProducto().get(tbl_ProductosVenta.getSelectedRow()).getCantidad() - Integer.parseInt(txt_Cantidad.getText())));
                    System.out.println(" 1 ");
                    btn_AgregarVenta.setEnabled(false);
                    btn_ComprarVenta.setEnabled(true);
                    //btn_CancelarCompra.setEnabled(true);
                    System.out.println(" 2 ");
                    Subtotal(tp_TotalPagarVenta);
                    txt_nombre.setText(null);
                    txt_Cantidad.setText(null);
                    txt_BuscarRegistroVenta.setText(null);
                    txt_BuscarProductoVenta.setText(null);
                    txt_Cantidad.setEnabled(false);
                    btn_CancelarCompra.setEnabled(true);
                    System.out.println(" 3 ");
                    ListarTodo();
                    Listar((DefaultTableModel) tbl_CarritoVenta.getModel(), venco.ReadAll());
                } else if (Integer.parseInt(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 3).toString()) == 0) {
                    JOptionPane.showMessageDialog(null, "No existe disponibilidad del producto en estos momentos.", "Error", 0);

                } else if (Integer.parseInt(txt_Cantidad.getText()) == 0) {
                    JOptionPane.showMessageDialog(null, "Cantidad no admitida", "Error", 0);
                } else if (Integer.parseInt(txt_Cantidad.getText()) < 0) {
                    JOptionPane.showMessageDialog(null, "No se pueden ingresar datos negativos", "Error", 0);
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad a comprar es superior a la cantidad almacenada.", "Error", 0);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revise que este cumpliendo con todos los campos.", "Error", 0);
        }


    }//GEN-LAST:event_btn_AgregarVentaActionPerformed

    private void btn_RetirarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RetirarVentaActionPerformed
        try {
            if (Integer.parseInt(txt_Cantidad.getText()) <= Integer.parseInt(tbl_CarritoVenta.getValueAt(tbl_CarritoVenta.getSelectedRow(), 3).toString()) && Integer.parseInt(txt_Cantidad.getText()) > 0) {
                venco.Read(tbl_CarritoVenta.getValueAt(tbl_CarritoVenta.getSelectedRow(), 0).toString(), Integer.parseInt(txt_Cantidad.getText()));
                System.out.println((int) Index);
                venco.Update((int) Index, new VentaM(tbl_CarritoVenta.getValueAt((int) Index,
                        0).toString(), tbl_CarritoVenta.getValueAt((int) Index, 1).toString(),
                        Double.parseDouble(tbl_CarritoVenta.getValueAt((int) Index, 2).toString()),
                        Integer.parseInt(tbl_CarritoVenta.getValueAt((int) Index, 3).toString())
                        - Integer.parseInt(txt_Cantidad.getText()), venco.getVenta().get((int) Index).getVendedor(),
                        Double.parseDouble(tbl_CarritoVenta.getValueAt((int) Index, 4).toString()) - (Integer.parseInt(txt_Cantidad.getText()) * Double.parseDouble(tbl_CarritoVenta.getValueAt((int) Index, 2).toString())), vendeco.getVendedor().get(cmbx_VendedorVenta.getSelectedIndex()).getID()));
                Subtotal(tp_TotalPagarVenta);
                if (venco.getVenta().get((int) Index).getCantidad() == 0) {
                    venco.Delete((int) Index);
                    Subtotal(tp_TotalPagarVenta);
                }
                if (venco.getVenta().size() == 0) {
                    btn_CancelarCompra.setEnabled(false);
                }

                txt_nombre.setText(null);
                txt_Cantidad.setText(null);
                txt_BuscarRegistroVenta.setText(null);
                txt_BuscarProductoVenta.setText(null);
                txt_Cantidad.setEnabled(false);

                btn_RetirarVenta.setEnabled(false);
                ListarTodo();
                Listar((DefaultTableModel) tbl_CarritoVenta.getModel(), venco.ReadAll());
                System.out.println(" 3 ");
            } else if (Integer.parseInt(txt_Cantidad.getText()) >= Integer.parseInt(tbl_CarritoVenta.getValueAt(tbl_CarritoVenta.getSelectedRow(), 3).toString())) {
                JOptionPane.showMessageDialog(null, "Al retirar, la cantidad no debe de ser mayor a la del carrito de compra.", "Error", 0);
            } else if (Integer.parseInt(txt_Cantidad.getText()) <= Integer.parseInt(tbl_CarritoVenta.getValueAt(tbl_CarritoVenta.getSelectedRow(), 3).toString())) {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revise que este cumpliendo con todos los campos.", "Error", 0);
        }
    }//GEN-LAST:event_btn_RetirarVentaActionPerformed

    private void btn_CancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarCompraActionPerformed
        btn_AgregarVenta.setEnabled(false);
        btn_RetirarVenta.setEnabled(false);
        btn_ComprarVenta.setEnabled(false);
        proco.BorrarCompra(venco.getVenta());
        Subtotal(tp_TotalPagarVenta);
        ListarTodo();
        txt_Cantidad.setText(null);
        txt_Cantidad.setEnabled(false);
        Listar((DefaultTableModel) tbl_CarritoVenta.getModel(), venco.ReadAll());
        btn_CancelarCompra.setEnabled(false);
        Index = null;
    }//GEN-LAST:event_btn_CancelarCompraActionPerformed

    private void btn_ComprarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComprarVentaActionPerformed
        venco.Registro();
        venco.BackupV();
        proco.Backup();
        venco.BorrarRegistro();
        txt_Cantidad.setEnabled(false);
        btn_RetirarVenta.setEnabled(false);
        btn_AgregarVenta.setEnabled(false);
        txt_Cantidad.setText(null);
        txt_nombre.setText(null);
        ListarTodo();
        Listar((DefaultTableModel) tbl_CarritoVenta.getModel(), venco.ReadAll());
        Subtotal(tp_TotalPagarVenta);
        btn_ComprarVenta.setEnabled(false);
    }//GEN-LAST:event_btn_ComprarVentaActionPerformed

    private void cmbx_VendedorVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbx_VendedorVentaActionPerformed
        IndexCmbx = cmbx_VendedorVenta.getSelectedIndex();
    }//GEN-LAST:event_cmbx_VendedorVentaActionPerformed

    private void btn_BuscarRegistroVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarRegistroVentaActionPerformed
        BuscarTodo(txt_BuscarRegistroVenta.getText().toUpperCase(), tbl_RegistroVenta, venco.ReadRegistroVenta(txt_BuscarRegistroVenta.getText(), txt_TotalRegistroVenta), btn_CancelarBusquedaRegistroVenta);

    }//GEN-LAST:event_btn_BuscarRegistroVentaActionPerformed

    private void btn_CancelarBusquedaRegistroVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarBusquedaRegistroVentaActionPerformed
        ListarTodo();
        txt_TotalRegistroVenta.setText("0.0");
        btn_CancelarBusquedaRegistroVenta.setEnabled(false);
    }//GEN-LAST:event_btn_CancelarBusquedaRegistroVentaActionPerformed

    private void txt_CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CantidadKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txt_CantidadKeyTyped

    private void txt_BuscarProductoVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarProductoVentaKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_BuscarProductoVentaKeyTyped

    private void txt_BuscarRegistroVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarRegistroVentaKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txt_BuscarRegistroVentaKeyTyped

    private void tbl_ProductosVenta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ProductosVenta1MouseClicked
        try {
            if (evt.getButton() != 3 && evt.getButton() != 2) {
                Index = null;
                SelecTable(tbl_ProductosVenta1, btn_AgregarVenta1, true);
                txt_Cantidad1.setEnabled(true);
                txt_Direccion.setEnabled(true);
                txt_nombre1.setText(tbl_ProductosVenta1.getValueAt(tbl_ProductosVenta1.getSelectedRow(), 1).toString());
                btn_RetirarVenta1.setEnabled(false);
            } else {
                Index = null;
                txt_nombre1.setText(null);
                txt_Cantidad1.setText(null);
                txt_Direccion.setText(null);
            }

        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            Index = null;
            txt_nombre1.setText(null);
            txt_nombre1.setText(null);
            txt_Cantidad1.setText(null);
            txt_Direccion.setText(null);
        }

    }//GEN-LAST:event_tbl_ProductosVenta1MouseClicked

    private void txt_BuscarProductoVenta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarProductoVenta1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarProductoVenta1KeyTyped

    private void btn_BuscarVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarVenta1ActionPerformed
        BuscarTodo(txt_BuscarProductoVenta1.getText().toUpperCase(), tbl_ProductosVenta1, proco.Read(txt_BuscarProductoVenta1.getText().toUpperCase()), btn_CancelarBusquedaProdVenta1);

    }//GEN-LAST:event_btn_BuscarVenta1ActionPerformed

    private void btn_CancelarBusquedaProdVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarBusquedaProdVenta1ActionPerformed
        ListarTodo();
        btn_CancelarBusquedaProdVenta.setEnabled(false);
    }//GEN-LAST:event_btn_CancelarBusquedaProdVenta1ActionPerformed

    private void btn_MenuVenta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuVenta1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MenuVenta1MouseClicked

    private void btn_VendedoresVenta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VendedoresVenta1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_VendedoresVenta1MouseClicked

    private void btn_ProductosVenta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosVenta1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ProductosVenta1MouseClicked

    private void btn_ProductosVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductosVenta1ActionPerformed
        RegistrarProducto registrarproducto = new RegistrarProducto();
        registrarproducto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ProductosVenta1ActionPerformed

    private void btn_CancelarCompra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarCompra1ActionPerformed
        btn_AgregarVenta1.setEnabled(false);
        btn_RetirarVenta1.setEnabled(false);
        btn_ComprarVenta1.setEnabled(false);
        proco.BorrarCompra(venco.getVenta());
        Subtotal(tp_TotalPagarVenta1);
        ListarTodo();
        txt_Cantidad1.setText(null);
        txt_Cantidad1.setEnabled(false);
        Listar((DefaultTableModel) tbl_CarritoVenta1.getModel(), venco.ReadAll());
        btn_CancelarCompra1.setEnabled(false);
        Index = null;
    }//GEN-LAST:event_btn_CancelarCompra1ActionPerformed

    private void tbl_CarritoVenta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CarritoVenta1MouseClicked
        try {
            Index = null;
            SelecTable(tbl_CarritoVenta1, btn_RetirarVenta1, true);
            txt_Cantidad1.setEnabled(true);
            txt_nombre1.setText(tbl_CarritoVenta1.getValueAt(tbl_CarritoVenta1.getSelectedRow(), 1).toString());
            btn_AgregarVenta1.setEnabled(false);
            Index = tbl_CarritoVenta1.getSelectedRow();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Para seleccionar un producto es con clic izquierdo.");
        }
    }//GEN-LAST:event_tbl_CarritoVenta1MouseClicked

    private void btn_RetirarVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RetirarVenta1ActionPerformed
        try {
            if (Integer.parseInt(txt_Cantidad1.getText()) <= Integer.parseInt(tbl_CarritoVenta1.getValueAt(tbl_CarritoVenta1.getSelectedRow(), 3).toString()) && Integer.parseInt(txt_Cantidad1.getText()) >= 1) {
                venco.Read(tbl_CarritoVenta1.getValueAt(tbl_CarritoVenta1.getSelectedRow(), 0).toString(), Integer.parseInt(txt_Cantidad1.getText()));
                System.out.println((int) Index);
                venco.Update((int) Index, new VentaM(tbl_CarritoVenta1.getValueAt((int) Index,
                        0).toString(), tbl_CarritoVenta1.getValueAt((int) Index, 1).toString(),
                        Double.parseDouble(tbl_CarritoVenta1.getValueAt((int) Index, 2).toString()),
                        Integer.parseInt(tbl_CarritoVenta1.getValueAt((int) Index, 3).toString())
                        - Integer.parseInt(txt_Cantidad1.getText()), venco.getVenta().get((int) Index).getVendedor(),
                        Double.parseDouble(tbl_CarritoVenta1.getValueAt((int) Index, 4).toString()) - (Integer.parseInt(txt_Cantidad1.getText()) * Double.parseDouble(tbl_CarritoVenta1.getValueAt((int) Index, 2).toString())), vendeco.getVendedor().get(cmbx_VendedorVenta1.getSelectedIndex()).getID()));
                Subtotal(tp_TotalPagarVenta);

                if (venco.getVenta().get((int) Index).getCantidad() == 0) {
                    venco.Delete((int) Index);
                    Subtotal(tp_TotalPagarVenta1);
                }
                if (venco.getVenta().size() == 0) {
                    btn_CancelarCompra1.setEnabled(false);
                }

                txt_nombre1.setText(null);
                txt_Cantidad1.setText(null);
                txt_BuscarRegistroVenta.setText(null);
                txt_BuscarProductoVenta1.setText(null);
                txt_Cantidad1.setEnabled(false);

                btn_RetirarVenta1.setEnabled(false);
                ListarTodo();
                Listar((DefaultTableModel) tbl_CarritoVenta1.getModel(), venco.ReadAll());
                System.out.println(" 3 ");
            } else if (Integer.parseInt(txt_Cantidad1.getText()) >= Integer.parseInt(tbl_CarritoVenta1.getValueAt(tbl_CarritoVenta1.getSelectedRow(), 3).toString())) {
                JOptionPane.showMessageDialog(null, "Al retirar, la cantidad no debe de ser mayor a la del carrito de compra.", "Error", 0);
            } else if (Integer.parseInt(txt_Cantidad1.getText()) <= Integer.parseInt(tbl_CarritoVenta1.getValueAt(tbl_CarritoVenta1.getSelectedRow(), 3).toString())) {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revise que este cumpliendo con todos los campos.", "Error", 0);
        }
    }//GEN-LAST:event_btn_RetirarVenta1ActionPerformed

    private void btn_AgregarVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarVenta1ActionPerformed
        try {
            if (ValCeroEspacio(txt_nombre1.getText(), txt_Cantidad1.getText(), txt_Direccion.getText())) {
                if (Integer.parseInt(txt_Cantidad1.getText()) <= Integer.parseInt(tbl_ProductosVenta1.getValueAt(tbl_ProductosVenta1.getSelectedRow(), 3).toString()) && Integer.parseInt(txt_Cantidad1.getText()) >= 1) {
                    venco.CreateB(new VentaM(tbl_ProductosVenta1.getValueAt(tbl_ProductosVenta1.getSelectedRow(), 0).toString(),
                            tbl_ProductosVenta1.getValueAt(tbl_ProductosVenta1.getSelectedRow(), 1).toString(),
                            Integer.parseInt(txt_Cantidad1.getText()), (String) cmbx_VendedorVenta1.getSelectedItem(),
                            Double.parseDouble(tbl_ProductosVenta1.getValueAt(tbl_ProductosVenta1.getSelectedRow(), 2).toString())
                            * Integer.parseInt(txt_Cantidad1.getText()), vendeco.getVendedor().get((int) IndexCmbxx).getID(), txt_Direccion.getText(), Double.parseDouble(tbl_ProductosVenta1.getValueAt(tbl_ProductosVenta1.getSelectedRow(), 2).toString()),true));
                            System.out.println(vendeco.getVendedor().get((int) IndexCmbxx).getID() +"  HOLAAA");
                    

                    proco.Update(tbl_ProductosVenta1.getSelectedRow(), new Producto(tbl_ProductosVenta1.getValueAt(tbl_ProductosVenta1.getSelectedRow(), 0).toString(), tbl_ProductosVenta1.getValueAt(tbl_ProductosVenta1.getSelectedRow(), 1).toString(),
                            Double.parseDouble(tbl_ProductosVenta1.getValueAt(tbl_ProductosVenta1.getSelectedRow(), 2).toString()), proco.getProducto().get(tbl_ProductosVenta1.getSelectedRow()).getCantidad() - Integer.parseInt(txt_Cantidad1.getText())));
                    System.out.println(" 1 ");
                    btn_AgregarVenta1.setEnabled(false);
                    btn_ComprarVenta1.setEnabled(true);
                    btn_CancelarCompra1.setEnabled(true);
                    System.out.println(" 2 ");
                    Subtotal(tp_TotalPagarVenta);
                    txt_nombre1.setText(null);
                    txt_Cantidad1.setText(null);
                    txt_BuscarRegistroVenta.setText(null);
                    txt_BuscarProductoVenta1.setText(null);
                    txt_Cantidad1.setEnabled(false);
                    txt_Direccion.setEnabled(false);
                    btn_CancelarCompra1.setEnabled(true);
                    ListarTodo();
                    Listar((DefaultTableModel) tbl_CarritoVenta1.getModel(), venco.ReadAll());
                    System.out.println(" 3 ");
                } else if (Integer.parseInt(tbl_ProductosVenta1.getValueAt(tbl_ProductosVenta1.getSelectedRow(), 3).toString()) == 0) {
                    JOptionPane.showMessageDialog(null, "No existe disponibilidad del producto en estos momentos.", "Error", 0);

                } else if (Integer.parseInt(txt_Cantidad1.getText()) == 0) {
                    JOptionPane.showMessageDialog(null, "Cantidad no admitida", "Error", 0);
                } else if (Integer.parseInt(txt_Cantidad1.getText()) < 0) {
                    JOptionPane.showMessageDialog(null, "No se pueden ingresar datos negativos", "Error", 0);
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad a comprar es superior a la cantidad almacenada.", "Error", 0);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revise que este cumpliendo con todos los campos.", "Error", 0);
        }
    }//GEN-LAST:event_btn_AgregarVenta1ActionPerformed

    private void txt_DireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DireccionKeyTyped

    private void txt_Cantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Cantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Cantidad1ActionPerformed

    private void txt_Cantidad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Cantidad1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Cantidad1KeyTyped

    private void cmbx_VendedorVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbx_VendedorVenta1ActionPerformed
        IndexCmbxx = cmbx_VendedorVenta1.getSelectedIndex();
        
    }//GEN-LAST:event_cmbx_VendedorVenta1ActionPerformed

    private void btn_ComprarVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComprarVenta1ActionPerformed
        venco.RegistroDomicilio();
        venco.BackupVDomicilio();
        proco.Backup();
        venco.BorrarRegistro();
        txt_Cantidad1.setEnabled(false);
        txt_Direccion.setEnabled(false);
        btn_RetirarVenta1.setEnabled(false);
        btn_AgregarVenta1.setEnabled(false);
        txt_Cantidad1.setText(null);
        txt_nombre1.setText(null);
        txt_Direccion.setText(null);
        ListarTodo();
        Listar((DefaultTableModel) tbl_CarritoVenta1.getModel(), venco.ReadAll());
        Subtotal(tp_TotalPagarVenta1);
        btn_ComprarVenta1.setEnabled(false);
        txt_Direccion.setText(null);
    }//GEN-LAST:event_btn_ComprarVenta1ActionPerformed

    private void btn_MenuVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenuVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MenuVentaActionPerformed

    private void btn_MenuVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenuVenta1ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_MenuVenta1ActionPerformed

    private void btn_VendedoresVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VendedoresVenta1ActionPerformed
        Vendedor vendedor = new Vendedor();
        vendedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VendedoresVenta1ActionPerformed

    private void txt_BuscarRegistroVentaDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarRegistroVentaDomicilioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarRegistroVentaDomicilioKeyTyped

    private void btn_BuscarRegistroVentaDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarRegistroVentaDomicilioActionPerformed
        BuscarTodo(txt_BuscarRegistroVentaDomicilio.getText().toUpperCase(), tbl_RegistroVentaDomicilio, venco.ReadRegistroVentaDomicilio(txt_BuscarRegistroVentaDomicilio.getText(), txt_TotalRegistroVentaDomicilio), btn_CancelarBusquedaRegistroVentaDomicilio);
    }//GEN-LAST:event_btn_BuscarRegistroVentaDomicilioActionPerformed

    private void btn_CancelarBusquedaRegistroVentaDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarBusquedaRegistroVentaDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CancelarBusquedaRegistroVentaDomicilioActionPerformed

    //Metodo para listar todas la tablas de la vista modificar producto
    private void ListarTodo() {
        Listar((DefaultTableModel) tbl_ProductosVenta.getModel(), proco.ReadAll());
        Listar((DefaultTableModel) tbl_RegistroVenta.getModel(), venco.ReadVentas());
        Listar((DefaultTableModel) tbl_RegistroVentaDomicilio.getModel(), venco.ReadVentasDomicilios());
        Listar((DefaultTableModel) tbl_ProductosVenta1.getModel(), proco.ReadAll());
        
    }

    public void ListarCombobox(JComboBox cmbx, ArrayList<Vendedorm> Array) {
        cmbx.removeAllItems();

        for (Vendedorm vendedor : Array) {
            cmbx.addItem(vendedor.getNombre());
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

    //Metodo para habilitar Botones de la vista Modificar producto
    private void HabilitarBotones(JButton comprar, boolean Cond) {
        comprar.setEnabled(Cond);

    }

    //Metodo para hacer la confirmacion por cuadro de dialogo
    private boolean ConfirmDialog(String texto) {
        int num = JOptionPane.showConfirmDialog(null, texto);
        if (num == JOptionPane.YES_OPTION) {
            return true;
        } else if (num == JOptionPane.NO_OPTION) {
            return false;
        } else {
            HabilitarBotones(btn_ComprarVenta, false);
            Index = null;
            return false;
        }

    }

    //Metodo para cuando seleccione un elemento de una tabla y asi mismo cuando termina el proceso
    private void SelecTable(JTable Tabla, JButton Boton, boolean Cond) {
        if (Index == null || Cond == false) {

            Boton.setEnabled(Cond);
        }
        if (Cond) {
            Index = Integer.parseInt(Tabla.getValueAt(Tabla.getSelectedRow(), 0).toString());
        } else {
            Index = null;
        }
    }

    private void Subtotal(JTextPane panel) {
        double total = 0;
        for (int i = 0; i < venco.getVenta().size(); i++) {
            total = total + venco.getVenta().get(i).getSubtotal();
        }
        panel.setText(String.valueOf(total));
    }

    public boolean ValCeroEspacio(String nombre, String cantidad, String id) {
        try {
            if (nombre.isEmpty() || nombre == null || id.isEmpty() || id == null || cantidad == null || cantidad.isEmpty()) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean ValCeroEspacio(String nombre, String cantidad) {
        try {
            if (nombre.isEmpty() || nombre == null || cantidad == null || cantidad.isEmpty()) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AgregarVenta;
    private javax.swing.JButton btn_AgregarVenta1;
    private javax.swing.JButton btn_BuscarRegistroVenta;
    private javax.swing.JButton btn_BuscarRegistroVentaDomicilio;
    private javax.swing.JButton btn_BuscarVenta;
    private javax.swing.JButton btn_BuscarVenta1;
    private javax.swing.JButton btn_CancelarBusquedaProdVenta;
    private javax.swing.JButton btn_CancelarBusquedaProdVenta1;
    private javax.swing.JButton btn_CancelarBusquedaRegistroVenta;
    private javax.swing.JButton btn_CancelarBusquedaRegistroVentaDomicilio;
    private javax.swing.JButton btn_CancelarCompra;
    private javax.swing.JButton btn_CancelarCompra1;
    private javax.swing.JButton btn_ComprarVenta;
    private javax.swing.JButton btn_ComprarVenta1;
    private javax.swing.JButton btn_MenuVenta;
    private javax.swing.JButton btn_MenuVenta1;
    private javax.swing.JButton btn_ProductosVenta;
    private javax.swing.JButton btn_ProductosVenta1;
    private javax.swing.JButton btn_RetirarVenta;
    private javax.swing.JButton btn_RetirarVenta1;
    private javax.swing.JButton btn_VendedoresVenta;
    private javax.swing.JButton btn_VendedoresVenta1;
    private javax.swing.JComboBox<String> cmbx_VendedorVenta;
    private javax.swing.JComboBox<String> cmbx_VendedorVenta1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_CarritoVenta;
    private javax.swing.JTable tbl_CarritoVenta1;
    private javax.swing.JTable tbl_ProductosVenta;
    private javax.swing.JTable tbl_ProductosVenta1;
    private javax.swing.JTable tbl_RegistroVenta;
    private javax.swing.JTable tbl_RegistroVentaDomicilio;
    private javax.swing.JTextPane tp_TotalPagarVenta;
    private javax.swing.JTextPane tp_TotalPagarVenta1;
    private javax.swing.JTextField txt_BuscarProductoVenta;
    private javax.swing.JTextField txt_BuscarProductoVenta1;
    private javax.swing.JTextField txt_BuscarRegistroVenta;
    private javax.swing.JTextField txt_BuscarRegistroVentaDomicilio;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_Cantidad1;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextPane txt_TotalRegistroVenta;
    private javax.swing.JTextPane txt_TotalRegistroVentaDomicilio;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombre1;
    // End of variables declaration//GEN-END:variables
}
