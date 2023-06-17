/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectofinal;
import java.util.ArrayList;
/**
 *
 * @author celeste
 */
public class ProyectoFinal {
    public static ArrayList<Usuario> Usuarios;
    public static ArrayList<Equipo> Equipos;
    public static ArrayList<AsignacionEquipoUsuario> AsignacionEquiposUsuarios;
    public static ArrayList<Proyecto> Proyectos;
    public static ArrayList<AsignacionProyectoEquipo> AsignacionProyectoEquipos;
    public static ArrayList<Tarea> Tareas;
    public static ArrayList<AsignacionTareaProyecto> AsignacionTareasProyetos;

    public static void main(String[] args) {
        Usuarios = new ArrayList<>();
        Equipos = new ArrayList<>();
        AsignacionEquiposUsuarios = new ArrayList<>();
        Proyectos = new ArrayList<>();
        AsignacionProyectoEquipos = new ArrayList<>();
        Tareas = new ArrayList<>();
        AsignacionTareasProyetos = new ArrayList<>();
        datosDefault();
        Login log = new Login();        
        log.setVisible(true);
      
    }
    
    public static void datosDefault()
    {
        Usuario usuarioNuevo = new Usuario();
        usuarioNuevo.setPassword("a");
        usuarioNuevo.setUsuario("a");
        usuarioNuevo.setCorreo("a");
        usuarioNuevo.setNombre("a");
        usuarioNuevo.setApellido("a");
        usuarioNuevo.setRol("Gerente");

        ProyectoFinal.Usuarios.add(usuarioNuevo);
        
        Usuario usuarioNuevo2 = new Usuario();
        usuarioNuevo2.setPassword("b");
        usuarioNuevo2.setUsuario("b");
        usuarioNuevo2.setCorreo("b");
        usuarioNuevo2.setNombre("b");
        usuarioNuevo2.setApellido("b");
        usuarioNuevo2.setRol("Gerente");
        
        ProyectoFinal.Usuarios.add(usuarioNuevo2);
        
        Usuario usuarioNuevo3 = new Usuario();
        usuarioNuevo3.setPassword("c");
        usuarioNuevo3.setUsuario("c");
        usuarioNuevo3.setCorreo("c");
        usuarioNuevo3.setNombre("c");
        usuarioNuevo3.setApellido("c");
        usuarioNuevo3.setRol("Miembro");
        
        ProyectoFinal.Usuarios.add(usuarioNuevo3);
        
        Usuario usuarioNuevo4 = new Usuario();
        usuarioNuevo4.setPassword("d");
        usuarioNuevo4.setUsuario("d");
        usuarioNuevo4.setCorreo("d");
        usuarioNuevo4.setNombre("d");
        usuarioNuevo4.setApellido("d");
        usuarioNuevo4.setRol("Miembro");
        
        ProyectoFinal.Usuarios.add(usuarioNuevo4);
        
        Usuario usuarioNuevo5 = new Usuario();
        usuarioNuevo5.setPassword("e");
        usuarioNuevo5.setUsuario("e");
        usuarioNuevo5.setCorreo("e");
        usuarioNuevo5.setNombre("e");
        usuarioNuevo5.setApellido("e");
        usuarioNuevo5.setRol("Miembro");
        
        ProyectoFinal.Usuarios.add(usuarioNuevo5);
        
        Equipo EquipoNuevo = new Equipo();
        EquipoNuevo.setLider("a");
        EquipoNuevo.setNombreEquipo("Equipo A");
        EquipoNuevo.setCorrelativo(1);

        ProyectoFinal.Equipos.add(EquipoNuevo);
        
        Equipo EquipoNuevo2 = new Equipo();
        EquipoNuevo2.setLider("b");
        EquipoNuevo2.setNombreEquipo("Equipo B");
        EquipoNuevo2.setCorrelativo(2);

        ProyectoFinal.Equipos.add(EquipoNuevo2);
        
        AsignacionEquipoUsuario Eu = new AsignacionEquipoUsuario();
        Eu.setIdEquipo(1);
        Eu.setUsuario("c");

        ProyectoFinal.AsignacionEquiposUsuarios.add(Eu);
        
        AsignacionEquipoUsuario Eu2 = new AsignacionEquipoUsuario();
        Eu2.setIdEquipo(1);
        Eu2.setUsuario("d");

        ProyectoFinal.AsignacionEquiposUsuarios.add(Eu2);
        
        AsignacionEquipoUsuario Eu3 = new AsignacionEquipoUsuario();
        Eu3.setIdEquipo(1);
        Eu3.setUsuario("e");

        ProyectoFinal.AsignacionEquiposUsuarios.add(Eu3);
    }
}

