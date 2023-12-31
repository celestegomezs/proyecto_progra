/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author celeste
 */
public class CargaTareas extends javax.swing.JFrame {

    public ArrayList<Tarea> TareasCargadas;
    Usuario usuario;
    /**
     * Creates new form CargaTareas
     */
    public CargaTareas(Usuario usuarioP) {
        initComponents();
        
        this.usuario = usuarioP;
        TareasCargadas = new ArrayList<>();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        CargarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel4.setText("Carga Tareas:");

        CargarButton.setText("CARGAR");
        CargarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarButtonActionPerformed(evt);
            }
        });

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

        jMenu1.setText("Regresar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CargarButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(CargarButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        PantallaProyectosGerente gerente = new PantallaProyectosGerente(this.usuario);
        gerente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void CargarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarButtonActionPerformed
        // TODO add your handling code here:

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos JSON", "json");

        fileChooser.setFileFilter(filtro);

        int seleccion = fileChooser.showOpenDialog(this);
        
        //Si seleccionas un archivo entra al if si no no entra
        if(seleccion == JFileChooser.APPROVE_OPTION){
            String archivo = fileChooser.getSelectedFile().getAbsolutePath();
            leerJson(archivo);
        }

    }//GEN-LAST:event_CargarButtonActionPerformed

    private void leerJson(String archivo){
        JSONParser jsonPar = new JSONParser();
        
        try(FileReader render = new FileReader(archivo)){
            Object obj = jsonPar.parse(render);
            
            JSONArray TareaList = (JSONArray) obj;
            
            for(Object tareaI: TareaList){
                JSONObject tareaItem = (JSONObject) tareaI;
                JSONObject tareaObj = (JSONObject) tareaItem.get("tarea");
                
                Tarea NuevaTarea = new Tarea();
                NuevaTarea.setId(Integer.parseInt(Long.toString((long) tareaObj.get("id"))));
                NuevaTarea.setTitulo((String) tareaObj.get("titulo"));
                NuevaTarea.setDescripcion((String) tareaObj.get("descripcion"));
                NuevaTarea.setFechaInicio((String) tareaObj.get("fechaInicio"));
                NuevaTarea.setFechaFin((String) tareaObj.get("fechaFin"));                
                NuevaTarea.setEstado((String) tareaObj.get("estado"));                
                NuevaTarea.setUsuarioAsignado((String) tareaObj.get("usuarioAsignado"));    
                
                ProyectoFinal.Tareas.add(NuevaTarea);
                TareasCargadas.add(NuevaTarea);
                
            }
            
            llenarTabla();
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ParseException e) {
            e.printStackTrace();
        }
        
        
    }
    
    private void llenarTabla() {
        DefaultTableModel dt = new DefaultTableModel(new String []{"Id","Titulo","Descripcion", "Fecha Inicio","Fecha Fin","Estado","Usuario"}, TareasCargadas.size());
        
        jTable1.setModel(dt);
        
        TableModel tm = jTable1.getModel();
                
        for(int i = 0; i< TareasCargadas.size();i++){
            Tarea p = TareasCargadas.get(i);
                               
            tm.setValueAt(p.getId(), i, 0);
            tm.setValueAt(p.getTitulo(), i, 1);
            tm.setValueAt(p.getDescripcion(), i, 2);
            tm.setValueAt(p.getFechaInicio(), i, 3);
            tm.setValueAt(p.getFechaFin(), i, 4);
            tm.setValueAt(p.getEstado(), i, 5);
            tm.setValueAt(p.getUsuarioAsignado(), i, 6);            
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
