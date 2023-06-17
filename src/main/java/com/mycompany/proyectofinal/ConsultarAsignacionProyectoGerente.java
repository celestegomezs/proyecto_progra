/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author celeste
 */
public class ConsultarAsignacionProyectoGerente extends javax.swing.JFrame {

    private Usuario usuario;
    
    /**
     * Creates new form ConsultarAsignacionProyectoGerente
     */
    public ConsultarAsignacionProyectoGerente(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        LlenarJTable();
    }
    
    private void LlenarJTable(){
        
        DefaultTableModel t = new DefaultTableModel(new String[]{"Proyecto", "Equipo","Interesado"},ProyectoFinal.AsignacionProyectoEquipos.size());
        jTable1.setModel(t);
        
        TableModel modelo = jTable1.getModel();
        
        int IdEquipo = 0;
        int proyectos = 0;
                        
        //Recorrer la lista de asgnaciones para validar a que equipo pertenece el usuario
        for(Equipo e: ProyectoFinal.Equipos){
            //Encuentra el usuario dentro de las asignaciones, y por ende el equipo
            if(e.getLider().equals(this.usuario.getUsuario())){
                IdEquipo = e.getCorrelativo();
                
                break;
            }
        }
        
        for(int i = 0; i < ProyectoFinal.AsignacionProyectoEquipos.size(); i++) {
            AsignacionProyectoEquipo e = ProyectoFinal.AsignacionProyectoEquipos.get(i);
                                   
            if(e.getIdEquipo() == IdEquipo) {
                String Proyecto = "";
                String Interesado = "";
                    
                //Encontrar Nombre del proyecto
                for(Proyecto p: ProyectoFinal.Proyectos){
                    if(p.getCorrelativo() == e.getIdProyecto()){
                        Proyecto = p.getNombreProyecto();    
                        Interesado = p.getInteresado();
                        break;
                    }
                }

                String Equipo = "";

                //Encontrar Nombre del equipo
                for(Equipo eq: ProyectoFinal.Equipos){
                    if(eq.getCorrelativo() == e.getIdEquipo()){
                        Equipo = eq.getNombreEquipo();    
                        break;
                    }
                }
            
                modelo.setValueAt(Proyecto, proyectos, 0);
                modelo.setValueAt(Equipo, proyectos, 1);
                modelo.setValueAt(Interesado,proyectos, 2);
                proyectos++;
            }           
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setText("Consulta de Proyectos Gerentes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        PantallaProyectosGerente proyectos = new PantallaProyectosGerente(this.usuario);
        proyectos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
