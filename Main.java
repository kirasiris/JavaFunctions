/**
 * Write a description of class JavaBasics here.
 *
 * @author (Kevin Uriel Azuara Fonseca)
 * @version (12/05/2019)
 */
public class Main {
    
    // Function definitions
    public static void loops() {
        int n = 12;
        while(n > 0){
            System.out.println(n + ",");
            --n;
        }
        System.out.println("FIRE ");
    }
    
    public static double multiplyThree(double n1, double n2, double n3){
        return (n1*n2*n3);
    }
    
    public static void javaArrays(){
        int [] a = {1, 2, 3, 4};
        
        for(int i = 0; i < 4; i++){
            System.out.println("a[" + i + "]" + a[i]);
        }
    }
    
    
    public static void main(String[] args) {
        loops();
        System.out.println(multiplyThree(3.2, 20.5, 15.0));
        javaArrays();
    }
    
}