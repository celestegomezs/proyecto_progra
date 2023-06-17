/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author celeste
 */
public class ModificarProyectoGerente extends javax.swing.JFrame {

    private Usuario usuario;
    private Proyecto modificar;
    
    /**
     * Creates new form ModificarProyectoGerente
     */
    public ModificarProyectoGerente(Usuario usuario) {
        initComponents();
        
        this.usuario = usuario;
        CargarProyecto();
    }
    
     public void CargarProyecto()
    {
        //Creamos un modelo de tipo combo box
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        
        //Agregamos el elemento inicial que tendra el combo
        modelo.addElement("");
        
        int IdEquipo = 0;
                        
        //Recorrer la lista de asgnaciones para validar a que equipo pertenece el usuario
        for(Equipo e: ProyectoFinal.Equipos){
            //Encuentra el usuario dentro de las asignaciones, y por ende el equipo
            if(e.getLider().equals(this.usuario.getUsuario())){
                IdEquipo = e.getCorrelativo();
                break;
            }
        }
        
        for(AsignacionProyectoEquipo ap: ProyectoFinal.AsignacionProyectoEquipos){  
            if(ap.getIdEquipo() == IdEquipo) {
                                    
                for(Proyecto p: ProyectoFinal.Proyectos){
                    if(p.getCorrelativo() == ap.getIdProyecto()){  
                        modelo.addElement(p.getNombreProyecto());
                        break;
                    }
                }    
                
            }
        }
        
        //Asignar el modelo ya lleno con los usuarios al combo box de la pantalla
        ProyectoComboBox.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ProyectoComboBox = new javax.swing.JComboBox<>();
        BuscarjButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        NombrejTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FechaInicioTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FechaFinjTextField = new javax.swing.JTextField();
        ModificarjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setText("Modificar Proyectos Gerente");

        jButton3.setText("Sallir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel2.setText("Proyecto:");

        ProyectoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        BuscarjButton1.setText("Buscar");
        BuscarjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarjButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setText("Nombre del Proyecto:");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setText("Fecha de Inicio:");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setText("Fecha de Finalizacion:");

        ModificarjButton.setText("Modificar");
        ModificarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NombrejTextField)
                                    .addComponent(FechaInicioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ModificarjButton)
                                        .addGap(26, 26, 26)
                                        .addComponent(jButton3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(FechaFinjTextField)))
                            .addComponent(BuscarjButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(ProyectoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ProyectoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BuscarjButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NombrejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FechaInicioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FechaFinjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarjButton)
                    .addComponent(jButton3))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        PantallaProyectosGerente inicio = new PantallaProyectosGerente(this.usuario);
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BuscarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarjButton1ActionPerformed
        // TODO add your handling code here:
        modificar = null;

        for(Proyecto p : ProyectoFinal.Proyectos){
            if(p.getNombreProyecto().equals(ProyectoComboBox.getSelectedItem().toString())){
                modificar = p;
                break;
            }
        }

        if(modificar !=null){
            NombrejTextField.setText(modificar.getNombreProyecto());
            FechaInicioTextField.setText(modificar.getFechaInicio());
            FechaFinjTextField.setText(modificar.getFechaFin());

        }else{
            JOptionPane.showMessageDialog(this, "Proyecto no encontrado");
        }
    }//GEN-LAST:event_BuscarjButton1ActionPerformed

    private void ModificarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarjButtonActionPerformed
        // TODO add your handling code here:
        if(modificar !=null){

            modificar.setNombreProyecto(NombrejTextField.getText());
            modificar.setFechaInicio(FechaInicioTextField.getText());
            modificar.setFechaFin(FechaFinjTextField.getText());

            NombrejTextField.setText("");
            FechaInicioTextField.setText("");
            FechaFinjTextField.setText("");

            //Actualizar o llenar el combo con los datos modificados
            CargarProyecto();

            JOptionPane.showMessageDialog(this, "Proyecto modificado exitosamente.");
        }else{
            JOptionPane.showMessageDialog(this, "Debe de buscar un proyecto");
        }
    }//GEN-LAST:event_ModificarjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarjButton1;
    private javax.swing.JTextField FechaFinjTextField;
    private javax.swing.JTextField FechaInicioTextField;
    private javax.swing.JButton ModificarjButton;
    private javax.swing.JTextField NombrejTextField;
    private javax.swing.JComboBox<String> ProyectoComboBox;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
