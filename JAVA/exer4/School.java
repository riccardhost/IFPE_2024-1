public class School {
    
    public static void main(String args[]) {

        Student s1 = new Student(); 
        // creating an object of Student

        s1.id = 250005;
        s1.name = "RICARDO SANTOS";
        s1.curso = "IPI-IFPE";
        //s1.media = ;
        
        System.out.println(s1.id); // accessing member through reference variable
        System.out.println(s1.name);
        System.out.println(s1.curso);
        //System.out.println(s1.);
    }
}
