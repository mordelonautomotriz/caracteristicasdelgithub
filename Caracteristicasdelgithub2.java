/*
 implemente un algoritmo que le pemita conocer las caracteristicas asi como 
tambien las ventajas y desventajas del software Github, ingresados por teclado
 */
package caracteristicasdelgithub;

/**
 *
 * @author HECTOR ORTIZ
 */
import java.util.Scanner;
public class Caracteristicasdelgithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);//new reserva espacio de memoria
      
       System.out.println("\tUniversidad De Las Fuerzas Armadas ESPE - Extension Latacunga \n");
   
        System.out.println("Ingrese su Nombre: ");
        String nombreEstudiante=objeto.nextLine();
        
        System.out.println("\nDepartamento: Energia y Mecanica");
        
        
        System.out.println("Carrera: Ingeniera Automotriz");
        
        System.out.println("Docente: Ing. Luis Guerra ");
        
        System.out.println("Asignatura: Programacion ");
        
        System.out.println("Nivel: 4to nivel 'B' ");
        
        System.out.println("ID: L00280605 ");
        
        System.out.println("\n\tsoftware github: \n");
        String concepto=objeto.nextLine();
        
        System.out.println("\tEs un repositorio distribuidoy,se diferencia de los repositorios clientes servidor como lo es Subversion y TFS"
                + "\n\tes un sistema de gestión de proyectos y control de versiones de código,permite trabajar, planificar proyectos y realizar un seguimiento del trabajo.\n");
        
        String caracteristicas=objeto.nextLine();
        
        System.out.println("\t1. GitHub es mucho más que un servicio de alojamiento de código."
                + "\n\t2. Un wiki que funciona con gollum, el cual opera con Git para el mantenimiento de las distintas versiones de las páginas."
                + "\n\t3. Un sistema de seguimiento de problemas que permiten a los miembros de tu equipo abrir un ticket detallando un problema que tenga con tu software."
                + "\n\t4. Una herramienta de revisión de código, donde se pueden añadir anotaciones en cualquier punto de un fichero y debatir sobre determinados cambios realizados"
                + "\n\t5. Un visor de ramas donde se pueden comparar los progresos realizados en las distintas ramas de nuestro repositorio.\n");
   
        String ventajas=objeto.nextLine();
    
        System.out.println("\t1.Es uno de los sistemas de control de versiones más populares entre los desarrolladores."
                + "\n\t2.permite trabajar completamente desconectado del servidor y hacer cuantos commits quieras en puntos medios estables sin afectar el código del servidor.\n");
    
        String desventajas=objeto.nextLine();
        
        System.out.println("\t1.suele crecer en tamaño muy considerable en forma local"
                + "\n\t2.La documentacion es complicada");
        
        
    }
    
}
