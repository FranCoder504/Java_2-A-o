//MAIN 

package encapsulamiento;


public class Main {

    
    public static void main(String[] args) {
        
        //CONSTRUCTORES DEL CODIGO
        Alumno alu = new Alumno();
        
        Alumno alu2 = new Alumno(15, 
                "Sergio", "Yanez");
        
        System.out.println("EL ID ES: " + 
                alu2.getId());
        
        System.out.println("EL NOMBRE ES: " + 
                alu2.getNombre());
        
        System.out.println("EL APELLIDO ES : " + 
                alu2.getApellido());
        
    }
    
}
