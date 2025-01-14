/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas_formularios;

import Controlador.CRUD_Cliente;
import Controlador.Conexion;
import Modelo.Cliente;
import Modelo.Desplazar_txtFields;
import Modelo.ValidarCampos;
import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperCompileManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.view.JasperViewer;
////import net.sf.jasperreports.engine.JRException;
////import net.sf.jasperreports.engine.JasperCompileManager;
////import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Windows 10
 */
public class Frame_cliente extends javax.swing.JInternalFrame {

    private ValidarCampos validar = new ValidarCampos();
    private Desplazar_txtFields des = new Desplazar_txtFields();
    int datoSeleccionado = -1;

    /**
     * Creates new form Frame_cliente
     */
    public Frame_cliente() {
        initComponents();
        mostrar();
        ocultartabla();
        txtIDcliente.setVisible(false);
        txtidpersona.setVisible(false);
    }

    public void guardarCliente() {
        CRUD_Cliente cc = new CRUD_Cliente();
        Object generoSeleccionado = comboGenero.getSelectedItem();
        char generoChar;

        if (generoSeleccionado != null && generoSeleccionado.toString().length() == 1) {
            generoChar = generoSeleccionado.toString().charAt(0);
        } else {
//             Manejo de caso cuando el valor seleccionado no es válido
//             por ejemplo, si está vacío o tiene más de un carácter
            generoChar = ' '; // Asignar un espacio en blanco como valor predeterminado
//             O mostrar un mensaje de error
            System.out.println("Error: el género seleccionado no es válido.");
        }

        Cliente cl = new Cliente(
                txtNombreClienteUno.getText(),
                txtNombreClienteDos.getText(),
                txtApellidoClienteUno.getText(),
                txtApellidoClienteDos.getText(),
                txtTelefonoCliente.getText(),
                generoChar,
                txtDireccionCliente.getText());

        cc.insertarCliente(cl);
    }

    public void limpiar() {
        txtIDcliente.setText("");
        txtNombreClienteUno.setText("");
        txtNombreClienteDos.setText("");
        txtApellidoClienteUno.setText("");
        txtApellidoClienteDos.setText("");
        comboGenero.setSelectedItem("Genero");
        txtTelefonoCliente.setText("");
        txtDireccionCliente.setText("");
    }

    public void editarCliente() {

        CRUD_Cliente cc = new CRUD_Cliente();
        Object generoSeleccionado = comboGenero.getSelectedItem();
        char generoChar;

        if (generoSeleccionado != null && generoSeleccionado.toString().length() == 1) {
            generoChar = generoSeleccionado.toString().charAt(0);
        } else {
            // Manejo de caso cuando el valor seleccionado no es válido
            // por ejemplo, si está vacío o tiene más de un carácter
            generoChar = ' '; // Asignar un espacio en blanco como valor predeterminado
            // O mostrar un mensaje de error
            System.out.println("Error: el género seleccionado no es válido.");
        }

        Cliente cl = new Cliente(Integer.parseInt(txtIDcliente.getText()),
                Integer.parseInt(txtidpersona.getText()),
                txtNombreClienteUno.getText(),
                txtNombreClienteDos.getText(),
                txtApellidoClienteUno.getText(),
                txtApellidoClienteDos.getText(),
                txtTelefonoCliente.getText(),
                txtDireccionCliente.getText(), generoChar);

        cc.ActualizarCliente(cl);

    }

    public void mostrar() { //Método mostrar
        try {
            DefaultTableModel modelo;
            CRUD_Cliente cli = new CRUD_Cliente(); //objeto de la clase CRUDCliente
            modelo = cli.mostrarDatos();
            tablaCliente.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void ocultartabla() {
        int columnIndex = 0; // Aquí pones el índice de la columna que deseas ocultar
        int columnIdex1 = 1;

        TableColumnModel columnModel = tablaCliente.getColumnModel();
        columnModel.getColumn(columnIndex).setWidth(0);
        columnModel.getColumn(columnIndex).setMinWidth(0);
        columnModel.getColumn(columnIndex).setMaxWidth(0);
        columnModel.getColumn(columnIndex).setPreferredWidth(0);
        columnModel.getColumn(columnIdex1).setWidth(0);
        columnModel.getColumn(columnIdex1).setMinWidth(0);
        columnModel.getColumn(columnIdex1).setMaxWidth(0);
        columnModel.getColumn(columnIdex1).setPreferredWidth(0);

    }

    /**
     * This method is called from w
     * ithin the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombreClienteDos = new javax.swing.JTextField();
        txtNombreClienteUno = new javax.swing.JTextField();
        comboGenero = new javax.swing.JComboBox<>();
        txtTelefonoCliente = new javax.swing.JFormattedTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        txtApellidoClienteUno = new javax.swing.JTextField();
        txtBuscarCliente = new javax.swing.JTextField();
        txtidpersona = new javax.swing.JTextField();
        txtIDcliente = new javax.swing.JTextField();
        txtApellidoClienteDos = new javax.swing.JTextField();
        jSplitPane1 = new javax.swing.JSplitPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        btnAgregarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnActualizarCliente = new javax.swing.JButton();
        jSplitPane3 = new javax.swing.JSplitPane();
        btnLimpiarCamposCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1280, 580));
        setMinimumSize(new java.awt.Dimension(1280, 580));
        setPreferredSize(new java.awt.Dimension(1280, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 64, 98));
        jLabel2.setText("Gestion de Clientes");

        jSeparator3.setBackground(new java.awt.Color(4, 64, 98));
        jSeparator3.setForeground(new java.awt.Color(4, 64, 98));
        jSeparator3.setOpaque(true);

        jSeparator1.setBackground(new java.awt.Color(4, 64, 98));
        jSeparator1.setForeground(new java.awt.Color(4, 64, 98));
        jSeparator1.setOpaque(true);

        txtNombreClienteDos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtNombreClienteDos.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombreClienteDos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(4, 64, 98)), "Segundo Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        txtNombreClienteDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreClienteDosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteDosKeyTyped(evt);
            }
        });

        txtNombreClienteUno.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtNombreClienteUno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombreClienteUno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)), "Primer Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        txtNombreClienteUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreClienteUnoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteUnoKeyTyped(evt);
            }
        });

        comboGenero.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genero", "M", "F" }));
        comboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGeneroActionPerformed(evt);
            }
        });
        comboGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboGeneroKeyPressed(evt);
            }
        });

        txtTelefonoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)), "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        try {
            txtTelefonoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefonoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoClienteKeyPressed(evt);
            }
        });

        txtDireccionCliente.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtDireccionCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDireccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(4, 64, 98)), "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        txtDireccionCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionClienteKeyPressed(evt);
            }
        });

        txtApellidoClienteUno.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtApellidoClienteUno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidoClienteUno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(4, 64, 98)), "Primer Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        txtApellidoClienteUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoClienteUnoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoClienteUnoKeyTyped(evt);
            }
        });

        txtBuscarCliente.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtBuscarCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBuscarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(4, 64, 98)), "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        txtBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarClienteActionPerformed(evt);
            }
        });
        txtBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarClienteKeyReleased(evt);
            }
        });

        txtApellidoClienteDos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtApellidoClienteDos.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidoClienteDos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(4, 64, 98)), "Segundo Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        txtApellidoClienteDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoClienteDosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoClienteDosKeyTyped(evt);
            }
        });

        jSplitPane1.setBackground(new java.awt.Color(4, 64, 98));
        jSplitPane1.setOpaque(false);

        jSplitPane2.setBackground(new java.awt.Color(4, 64, 98));
        jSplitPane2.setOpaque(false);

        btnAgregarCliente.setBackground(new java.awt.Color(4, 64, 98));
        btnAgregarCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCliente.setText("Agregar");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jSplitPane2.setRightComponent(btnAgregarCliente);

        btnEditarCliente.setBackground(new java.awt.Color(4, 64, 98));
        btnEditarCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCliente.setText("  Editar  ");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });
        jSplitPane2.setLeftComponent(btnEditarCliente);

        jSplitPane1.setRightComponent(jSplitPane2);

        btnActualizarCliente.setBackground(new java.awt.Color(4, 64, 98));
        btnActualizarCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnActualizarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarCliente.setText("Actualizar");
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });
        jSplitPane1.setLeftComponent(btnActualizarCliente);

        jSplitPane3.setBackground(new java.awt.Color(4, 64, 98));
        jSplitPane3.setOpaque(false);

        btnLimpiarCamposCliente.setBackground(new java.awt.Color(4, 64, 98));
        btnLimpiarCamposCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnLimpiarCamposCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarCamposCliente.setText("Limpiar");
        btnLimpiarCamposCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposClienteActionPerformed(evt);
            }
        });
        jSplitPane3.setRightComponent(btnLimpiarCamposCliente);

        btnEliminarCliente.setBackground(new java.awt.Color(4, 64, 98));
        btnEliminarCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        jSplitPane3.setLeftComponent(btnEliminarCliente);

        tablaCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID CLiente", "Primer Nombre", "Segundo Nombre", "Primer Apellido", "Segundo Apellido", "Genero", "Telefono", "Direccion"
            }
        ));
        tablaCliente.setGridColor(new java.awt.Color(0, 204, 204));
        tablaCliente.setRowHeight(25);
        tablaCliente.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tablaCliente.setShowHorizontalLines(true);
        tablaCliente.setSurrendersFocusOnKeystroke(true);
        tablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCliente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNombreClienteUno)
                                        .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombreClienteDos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtApellidoClienteUno, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtApellidoClienteDos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSplitPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtIDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtApellidoClienteDos)
                    .addComponent(txtNombreClienteUno)
                    .addComponent(txtNombreClienteDos)
                    .addComponent(txtApellidoClienteUno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboGenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSplitPane3)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtNombreClienteDosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteDosKeyPressed
        des.Desplazar(evt, txtApellidoClienteUno, txtNombreClienteUno);
    }//GEN-LAST:event_txtNombreClienteDosKeyPressed

    private void txtNombreClienteDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteDosKeyTyped
        // Llamando metodo KeyTipedTXT
        validar.KeyTipedTXT(evt);
    }//GEN-LAST:event_txtNombreClienteDosKeyTyped

    private void txtNombreClienteUnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteUnoKeyPressed

        des.Desplazar(evt, txtNombreClienteDos, txtNombreClienteUno);
    }//GEN-LAST:event_txtNombreClienteUnoKeyPressed

    private void txtNombreClienteUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteUnoKeyTyped
        // Llamando metodo KeyTipedTXT
        validar.KeyTipedTXT(evt);
    }//GEN-LAST:event_txtNombreClienteUnoKeyTyped

    private void comboGeneroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboGeneroKeyPressed

    }//GEN-LAST:event_comboGeneroKeyPressed

    private void txtTelefonoClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoClienteKeyPressed
        des.Desplazar(evt, txtDireccionCliente, txtApellidoClienteDos);
    }//GEN-LAST:event_txtTelefonoClienteKeyPressed

    private void txtDireccionClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionClienteKeyPressed
        des.Desplazar(evt, txtNombreClienteUno, txtTelefonoCliente);
    }//GEN-LAST:event_txtDireccionClienteKeyPressed

    private void txtApellidoClienteUnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoClienteUnoKeyPressed
        des.Desplazar(evt, txtApellidoClienteDos, txtNombreClienteDos);
    }//GEN-LAST:event_txtApellidoClienteUnoKeyPressed

    private void txtApellidoClienteUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoClienteUnoKeyTyped
        // Llamando metodo KeyTipedTXT
        validar.KeyTipedTXT(evt);
    }//GEN-LAST:event_txtApellidoClienteUnoKeyTyped

    private void txtBuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClienteKeyReleased
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo;
            CRUD_Cliente cli = new CRUD_Cliente();

            modelo = cli.buscarDatos(txtBuscarCliente.getText());
            mostrar();

            tablaCliente.setModel(modelo);
            ocultartabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

        validar.KeyTipedTXT(evt);
    }//GEN-LAST:event_txtBuscarClienteKeyReleased

    private void txtApellidoClienteDosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoClienteDosKeyPressed
        des.Desplazar(evt, txtTelefonoCliente, txtApellidoClienteUno);
    }//GEN-LAST:event_txtApellidoClienteDosKeyPressed

    private void txtApellidoClienteDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoClienteDosKeyTyped
        // Llamando metodo KeyTipedTXT
        validar.KeyTipedTXT(evt);
    }//GEN-LAST:event_txtApellidoClienteDosKeyTyped

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed

        CRUD_Cliente cc = new CRUD_Cliente();
        try {
            if (txtNombreClienteUno.getText().equals("")
                    || txtNombreClienteDos.getText().equals("")
                    || txtApellidoClienteUno.getText().equals("")
                    || txtApellidoClienteDos.getText().equals("")
                    || txtTelefonoCliente.getText().equals("")
                    || comboGenero.getSelectedItem().toString().equals("")
                    || txtDireccionCliente.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            } else {
                if (cc.verificarTelefonoCliente(txtTelefonoCliente.getText())) {
                    JOptionPane.showMessageDialog(null, "El numero de telefono que ingreso ya existe.");
                } else {
                    guardarCliente();
                    limpiar();
                    mostrar();
                    ocultartabla();
                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        int fila = this.tablaCliente.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente de la tabla.");
        } else {
            try {
                int IDPersona = Integer.parseInt((String) this.tablaCliente.getValueAt(fila, 0));
                int IDCliente = Integer.parseInt((String) this.tablaCliente.getValueAt(fila, 1));
                String nombre1 = (String) this.tablaCliente.getValueAt(fila, 2);
                String nombre2 = (String) this.tablaCliente.getValueAt(fila, 3);
                String apell1ido1 = (String) this.tablaCliente.getValueAt(fila, 4).toString();
                String apellido2 = (String) this.tablaCliente.getValueAt(fila, 5).toString();
                String telefono = (String) this.tablaCliente.getValueAt(fila, 6).toString();
                String genero = (String) this.tablaCliente.getValueAt(fila, 7).toString();
                String direccion = (String) this.tablaCliente.getValueAt(fila, 8).toString();
                //                System.out.println(telefono);
                txtidpersona.setText("" + IDPersona);
                txtIDcliente.setText("" + IDCliente);
                txtNombreClienteUno.setText(nombre1);
                txtNombreClienteDos.setText(nombre2);
                txtApellidoClienteUno.setText(apell1ido1);
                txtApellidoClienteDos.setText(apellido2);
                txtTelefonoCliente.setText(telefono);
                comboGenero.setSelectedItem(genero);
                txtDireccionCliente.setText(String.valueOf(direccion));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //        if (datoSeleccionado >= 0) {
        //            //mandar datos al formulario
        //
        //            txtNombreClienteUno.setText(String.valueOf(tablaCliente.getValueAt(datoSeleccionado, 1)));
        //            txtNombreClienteDos.setText(String.valueOf(tablaCliente.getValueAt(datoSeleccionado, 2)));
        //            txtApellidoClienteUno.setText(String.valueOf(tablaCliente.getValueAt(datoSeleccionado, 3)));
        //            txtApellidoClienteDos.setText(String.valueOf(tablaCliente.getValueAt(datoSeleccionado, 4)));
        //            String genero = (String) this.tablaCliente.getValueAt(datoSeleccionado, 5).toString();
        //            txtTelefonoCliente.setText(String.valueOf(tablaCliente.getValueAt(datoSeleccionado, 6)));
        //            txtDireccionCliente.setText(String.valueOf(tablaCliente.getValueAt(datoSeleccionado, 7)));
        //
        //            comboGenero.setSelectedItem(genero);
        //
        //        } else {
        //            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro a actualizar");
        //        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed

        try {
            CRUD_Cliente cc = new CRUD_Cliente();
            if (txtNombreClienteUno.getText().equals("")
                    || txtNombreClienteDos.getText().equals("")
                    || txtApellidoClienteUno.getText().equals("")
                    || txtApellidoClienteDos.getText().equals("")
                    || comboGenero.getSelectedItem().toString().equals("Genero")
                    || txtTelefonoCliente.getText().equals("    -    ")
                    || txtDireccionCliente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            } else {
                if (cc.verificarTelefonoClienteActualizado(Integer.parseInt(txtidpersona.getText()),txtTelefonoCliente.getText())) {
                    JOptionPane.showMessageDialog(null, "El numero de telefono que ingreso ya existe.");
                } else {
                    editarCliente();
                    limpiar();
                    mostrar();
                    ocultartabla();

                    JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");

                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        // textidcliente.getText().equals("")
    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private void btnLimpiarCamposClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposClienteActionPerformed
//      String path = "C:\\GIT\\VariedadesDuarte\\Variedades_Duarte\\src\\Vistas_formularios\\report1.jasper";
//           Conexion con = new Conexion();
//     
//            JasperReport jr;
//     
//     try {Connection cn = (Connection) con.conectar();Conexion cc = new Conexion();
//          cc.conectar();
//          jr = JasperCompileManager.compileReport(path);
//         JasperPrint mostrarreporte = JasperFillManager.fillReport(jr,null,cn);
//         JasperViewer.viewReport(mostrarreporte);
//         
//         
//     }catch (JRException e) {
//         JOptionPane.showMessageDialog(null, e);
//     }
//     
        limpiar();
    }//GEN-LAST:event_btnLimpiarCamposClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed

        if (datoSeleccionado >= 0) {

            String IDCliente = String.valueOf(tablaCliente.getValueAt(datoSeleccionado, 0));
            CRUD_Cliente cli = new CRUD_Cliente();
            if (JOptionPane.showConfirmDialog(this.getRootPane(),
                    "Se eliminará el registro, ¿desea continuar?",
                    "Eliminar Registro",
                    JOptionPane.WARNING_MESSAGE,
                    JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {

                cli.eliminar(IDCliente);
                mostrar();
                ocultartabla();
                JOptionPane.showMessageDialog(null,
                        "Dato eliminado correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar un registro de la tabla");
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void tablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClienteMouseClicked
        datoSeleccionado = tablaCliente.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tablaClienteMouseClicked

    private void comboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboGeneroActionPerformed

    private void txtBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnLimpiarCamposCliente;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtApellidoClienteDos;
    private javax.swing.JTextField txtApellidoClienteUno;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtIDcliente;
    private javax.swing.JTextField txtNombreClienteDos;
    private javax.swing.JTextField txtNombreClienteUno;
    private javax.swing.JFormattedTextField txtTelefonoCliente;
    private javax.swing.JTextField txtidpersona;
    // End of variables declaration//GEN-END:variables
}
