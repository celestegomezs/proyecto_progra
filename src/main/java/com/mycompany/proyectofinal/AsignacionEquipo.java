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
public class AsignacionEquipo extends javax.swing.JFrame {

    /**
     * Creates new form AsignacionEquipo
     */
    public AsignacionEquipo() {
        initComponents();
        //Funciones para llenar los combos
        CargarUsuarios();
        CargarEquipos();
                 
    }
    
    //Funcion para cargar combo de usuarios
    public void CargarUsuarios() 
    {
        //Creamos un modelo de tipo combo box
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        
        //Agregamos el elemento inicial que tendra el combo
        modelo.addElement("");
        
        //Ciclo para recorrer los usuarios que se tienen almacenados
        for(Usuario u: ProyectoFinal.Usuarios){
            //Validar que el usulario a mostrar en el combo sea del rol Miembro
            if(u.getRol() == "Miembro")
                //Agregar el usuario como elemento del combo
                modelo.addElement(u.getUsuario());
        }
        
        //Asignar el modelo ya lleno con los usuarios al combo box de la pantalla
        UsuarioComboBox.setModel(modelo);
    }
    
    //Funcion para cargar combo de equipos
    public void CargarEquipos()
    {
        //Creamos un modelo de tipo combo box
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        
        //Agregamos el elemento inicial que tendra el combo
        modelo.addElement("");
        
        //Ciclo para recorrer los equipos que se tienen almacenados
        for(Equipo eq: ProyectoFinal.Equipos){
            //Agregar el equipo como elemento del combo
            modelo.addElement(eq.getNombreEquipo());
        }
        
        //Asignar el modelo ya lleno con los usuarios al combo box de la pantalla
        EquipoComboBox.setModel(modelo);
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
        jLabel2 = new javax.swing.JLabel();
        EquipoComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        UsuarioComboBox = new javax.swing.JComboBox<>();
        AceptarjButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setText("Asignacion de Miembro a Equipo");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel2.setText("Equipo:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setText("Usuario:");

        AceptarjButton.setText("Aceptar");
        AceptarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarjButtonActionPerformed(evt);
            }
        });

        jMenu2.setText("Regresar");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(AceptarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EquipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EquipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(UsuarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AceptarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarjButtonActionPerformed
        // TODO add your handling code here:
        //Obtener valor de los combos
        String EquipoL = EquipoComboBox.getSelectedItem().toString();
        String UsuarioL = UsuarioComboBox.getSelectedItem().toString();
           
        //Validar si el combo de equipo no han seleccinado nada
        if(EquipoL == "")
            JOptionPane.showMessageDialog(this, "Seleccione un equipo.");
        //Validar si el combo de usuario no han seleccinado nada
        else if(UsuarioL == "")
            JOptionPane.showMessageDialog(this, "Seleccione un usuario.");
        else {
            
            //Validar que el usuario no este asignado a un equipo previamente
            boolean ingresado= false;
            
            //Recorrer la lista de asgnaciones para validar si el usuario ya esta asignado a un equipo
            for(AsignacionEquipoUsuario eu: ProyectoFinal.AsignacionEquiposUsuarios){
                //Validar si el usuario ya esta asginado
                if(eu.getUsuario().equals(UsuarioL)){
                    ingresado= true;    
                    break;
                }
            }
            
            if(ingresado)
                JOptionPane.showMessageDialog(this, "No se puede guardar porque el usuario ya fue asignado un equipo");
            else {
                
                //Validar que el usuario no es lider del equipo
                boolean encontrarLider = false;
                
                //Recorrer los equpos para encontrar el equipo y lider de cada uno
                for(Equipo e: ProyectoFinal.Equipos){
                    //Validar si el equipo es el seleccionado y el lider es el usuario tambien seleccionado
                    if(e.getNombreEquipo().equals(EquipoL) && e.getLider().equals(UsuarioL)){
                        encontrarLider = true;    
                        break;
                    }
                }
                
                if(encontrarLider)
                    JOptionPane.showMessageDialog(this, "No se puede guardar porque el usuario es lider del equipo.");
                else {
                    
                    int IdEquipo = 0;
                    
                    //Encontrar Id del equipo
                    for(Equipo e: ProyectoFinal.Equipos){
                        if(e.getNombreEquipo().equals(EquipoL)){
                            IdEquipo = e.getCorrelativo();    
                            break;
                        }
                    }
                    
                    AsignacionEquipoUsuario EquipoUsuarioNuevo = new AsignacionEquipoUsuario();
                    EquipoUsuarioNuevo.setIdEquipo(IdEquipo);
                    EquipoUsuarioNuevo.setUsuario(UsuarioL);

                    ProyectoFinal.AsignacionEquiposUsuarios.add(EquipoUsuarioNuevo);

                    EquipoComboBox.setSelectedIndex(0);
                    UsuarioComboBox.setSelectedIndex(0);

                    JOptionPane.showMessageDialog(this, "Usuario asignado al equipo exitosamente");
                }
            }
            
        }
        
    }//GEN-LAST:event_AceptarjButtonActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        PantallaEquipos equipos = new PantallaEquipos();
        equipos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarjButton;
    private javax.swing.JComboBox<String> EquipoComboBox;
    private javax.swing.JComboBox<String> UsuarioComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}