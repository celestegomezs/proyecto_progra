/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author celeste
 */
public class CreacionProyectosGerente extends javax.swing.JFrame {

    private Usuario usuario;
    
    /**
     * Creates new form CreacionProyectosGerente
     */
    public CreacionProyectosGerente(Usuario usuario) {
        initComponents();
        
        this.usuario = usuario;
        
        //Obtener la fecha actual para colocar en los campos de fecha
        Format f = new SimpleDateFormat("dd/MM/yyyy");
        FechaInicioTextField.setText(f.format(new Date()));
        FechaFinjTextField.setText(f.format(new Date()));
        
        //Consultar el numero de equipos existentes y sumarle 1
        CorrelativoLabel.setText(Integer.toString(ProyectoFinal.Proyectos.size() + 1));
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
        jLabel3 = new javax.swing.JLabel();
        NombrejTextField = new javax.swing.JTextField();
        FechaInicioTextField = new javax.swing.JTextField();
        FechaFinjTextField = new javax.swing.JTextField();
        CrearjButton = new javax.swing.JButton();
        SalirjButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CorrelativoLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        InteresadoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("Nombre del Proyecto:");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel2.setText("Fecha de Inicio:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setText("Fecha de Finalizacion:");

        CrearjButton.setText("Crear");
        CrearjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearjButtonActionPerformed(evt);
            }
        });

        SalirjButton.setText("Salir");
        SalirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirjButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setText("Correlativo:");

        CorrelativoLabel.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        CorrelativoLabel.setText("0");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel6.setText("Crear Proyecto Gerente");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setText("Interesado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CrearjButton)
                                .addGap(66, 66, 66)
                                .addComponent(SalirjButton)
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CorrelativoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NombrejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FechaInicioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InteresadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(FechaFinjTextField))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(CorrelativoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombrejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FechaInicioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FechaFinjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(InteresadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrearjButton)
                    .addComponent(SalirjButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearjButtonActionPerformed
        // TODO add your handling code here:
        Pattern ExpresionRegular = Pattern.compile("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", Pattern.CASE_INSENSITIVE);
        Matcher CoincidenciaFechaInicio = ExpresionRegular.matcher(FechaInicioTextField.getText());
        boolean ValidarFechaInicio = CoincidenciaFechaInicio.find();

        if(!ValidarFechaInicio) {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha inicio valida.");
        } else {
            Matcher CoincidenciaFechaFin = ExpresionRegular.matcher(FechaFinjTextField.getText());
            boolean ValidarFechaFin = CoincidenciaFechaFin.find();

            if(!ValidarFechaFin) {
                JOptionPane.showMessageDialog(this, "Ingrese una fecha final valida.");
            } else {

                String Nombre = NombrejTextField.getText();
                String Interesado = InteresadoTextField.getText();

                if("".equals(Nombre)) {
                    JOptionPane.showMessageDialog(this, "Ingrese un nombre.");

                } else {
                    boolean ingresado= false;

                    for(Proyecto u: ProyectoFinal.Proyectos){
                        if(u.getNombreProyecto().equals(Nombre)){
                            ingresado= true;
                            break;
                        }
                    }

                    if(ingresado){
                        JOptionPane.showMessageDialog(this, "Ya existe un proyecto con el nombre ingresado.");
                    }
                    else{
                        
                        String Equipo = "";
                        int IdEquipo = 0;
                        
                        //Recorrer la lista de asgnaciones para validar a que equipo pertenece el usuario
                        for(Equipo e: ProyectoFinal.Equipos){
                            //Encuentra el usuario dentro de las asignaciones, y por ende el equipo
                            if(e.getLider().equals(this.usuario.getUsuario())){
                                Equipo = e.getNombreEquipo();
                                IdEquipo = e.getCorrelativo();
                                break;
                            }
                        }
                        
                        //Validar si el usuairo tiene un equipo asignado
                        if("".equals(Equipo)){
                            JOptionPane.showMessageDialog(this, "El usuario no tiene un equipo asignado, por lo tanto no puede crear proyectos.");
                        } else {
                            
                            Proyecto proyectoNuevo = new Proyecto();
                            proyectoNuevo.setNombreProyecto(Nombre);
                            proyectoNuevo.setFechaInicio(FechaInicioTextField.getText());
                            proyectoNuevo.setFechaFin(FechaFinjTextField.getText());
                            proyectoNuevo.setInteresado(Interesado);
                            proyectoNuevo.setCorrelativo(Integer.parseInt(CorrelativoLabel.getText()));

                            ProyectoFinal.Proyectos.add(proyectoNuevo);

                            AsignacionProyectoEquipo EquipoProyectoNuevo = new AsignacionProyectoEquipo();
                            EquipoProyectoNuevo.setIdEquipo(IdEquipo);
                            EquipoProyectoNuevo.setIdProyecto(Integer.parseInt(CorrelativoLabel.getText()));

                            ProyectoFinal.AsignacionProyectoEquipos.add(EquipoProyectoNuevo);

                            NombrejTextField.setText("");
                            InteresadoTextField.setText("");
                            //Obtener la fecha actual para colocar en los campos de fecha
                            Format f = new SimpleDateFormat("dd/MM/yyyy");
                            FechaInicioTextField.setText(f.format(new Date()));
                            FechaFinjTextField.setText(f.format(new Date()));

                            //Consultar el numero de equipos existentes y sumarle 1
                            CorrelativoLabel.setText(Integer.toString(ProyectoFinal.Proyectos.size() + 1));

                            JOptionPane.showMessageDialog(this, "Proyecto creado exitosamente");
                        }                        
                    }
                }
            }
        }
    }//GEN-LAST:event_CrearjButtonActionPerformed

    private void SalirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirjButtonActionPerformed
        // TODO add your handling code here:
        PantallaProyectosGerente inicio = new PantallaProyectosGerente(this.usuario);
        inicio.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_SalirjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CorrelativoLabel;
    private javax.swing.JButton CrearjButton;
    private javax.swing.JTextField FechaFinjTextField;
    private javax.swing.JTextField FechaInicioTextField;
    private javax.swing.JTextField InteresadoTextField;
    private javax.swing.JTextField NombrejTextField;
    private javax.swing.JButton SalirjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}