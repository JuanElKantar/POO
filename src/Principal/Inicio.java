package Principal;

import Salud.Empleado;
import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        /*->Reto 1<-*/
        double resultado, peso=0, estatura=0;
    
        /*->RETO1 y 2<-*/
        /*Persona human=new Persona(null, 0, null, null, estatura, estatura, 0, null);
            
        human.pedirDatos();
        human.mostrarPersona();
        resultado=human.calcularImc(peso, estatura);
        if (resultado<20){
            System.out.println("PESOBAJO");
        }
        else if (resultado >= 20 && resultado <= 25){
            System.out.println("PESOIDEAL");
        }
        else{
            System.out.println("SOBREPESO");
        }
        human.mayorEdad();*/

        /*->Reto3<-*/
        Empleado emp=new Empleado(null, 0, null, null, 0, 0, 0, null, 0, null, null, 0, 0);

        emp.pedirDatos();

        emp.pedirEmpleado();

        emp.mostrarEmpleado();

        emp.calcularHonorarios();
   }
}
