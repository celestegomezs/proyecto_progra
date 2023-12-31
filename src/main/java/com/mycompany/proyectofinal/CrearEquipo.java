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
public class CrearEquipo extends javax.swing.JFrame {

    /**
     * Creates new form CrearEquipo
     */
    public CrearEquipo() {
        initComponents();
        
        //Consultar el numero de equipos existentes y sumarle 1
        CorrelativojLabel.setText(Integer.toString(ProyectoFinal.Equipos.size() + 1));
        
        //Creamos un modelo de tipo combo box
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        
        //Agregamos el elemento inicial que tendra el combo
        modelo.addElement("");
        
        //Ciclo para recorrer los usuarios que se tienen almacenados
        for(Usuario u: ProyectoFinal.Usuarios){
            //Validar que el usulario a mostrar en el combo sea del rol Miembro
            if(u.getRol() == "Gerente")
                //Agregar el usuario como elemento del combo
                modelo.addElement(u.getUsuario());
        }
        
        //Asignar el modelo ya lleno con los usuarios al combo box de la pantalla
        LiderComboBox.setModel(modelo);
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
        LiderComboBox = new javax.swing.JComboBox<>();
        NombreEquipoTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CorrelativojLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AceptarjButton = new javax.swing.JButton();
        SalirjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("Lider de equipo:");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel2.setText("Nombre de equipo:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setText("Autoincrementable:");

        CorrelativojLabel.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        CorrelativojLabel.setText("0");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel5.setText("Crear Equipo");

        AceptarjButton.setText("Aceptar");
        AceptarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarjButtonActionPerformed(evt);
            }
        });

        SalirjButton.setText("Salir");
        SalirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LiderComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NombreEquipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CorrelativojLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(AceptarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SalirjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel5)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CorrelativojLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LiderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreEquipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarjButton)
                    .addComponent(SalirjButton))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirjButtonActionPerformed
        // TODO add your handling code here:
        PantallaEquipos inicio = new PantallaEquipos();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirjButtonActionPerformed

    private void AceptarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarjButtonActionPerformed
        // TODO add your handling code here:
           String NombreEquipo = NombreEquipoTextField.getText();
           String Lider = LiderComboBox.getSelectedItem().toString();
           
           if(Lider == "")
               JOptionPane.showMessageDialog(this, "Seleccione un Lider.");
           
           else {
            boolean ingresado= false;
            
            for(Equipo e: ProyectoFinal.Equipos){
                if(e.getNombreEquipo().equals(NombreEquipo)){
                    ingresado= true;    
                    break;
                }
            }
            if(ingresado){
                JOptionPane.showMessageDialog(this, "Equipo ya existente");
            }
            else{
                Equipo EquipoNuevo = new Equipo();
                EquipoNuevo.setLider(Lider);
                EquipoNuevo.setNombreEquipo(NombreEquipo);
                EquipoNuevo.setCorrelativo(Integer.parseInt(CorrelativojLabel.getText()));
                
                ProyectoFinal.Equipos.add(EquipoNuevo);
                
                NombreEquipoTextField.setText("");
                LiderComboBox.setSelectedIndex(0);
                
                //Consultar el numero de equipos existentes y sumarle 1
                CorrelativojLabel.setText(Integer.toString(ProyectoFinal.Equipos.size() + 1));

                JOptionPane.showMessageDialog(this, "Equipo creado exitosamente");
            }
        }
         
    }//GEN-LAST:event_AceptarjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarjButton;
    private javax.swing.JLabel CorrelativojLabel;
    private javax.swing.JComboBox<String> LiderComboBox;
    private javax.swing.JTextField NombreEquipoTextField;
    private javax.swing.JButton SalirjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
