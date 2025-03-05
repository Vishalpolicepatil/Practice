public class Butterfly {
     
    public static void main(String[] args){
        int n =5;
     // First Half
     for(int i=1; i<=n; i++){
        //First part
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        //Spaces
        int Spaces = 2*(n-i);
        for(int j=1; j<=Spaces; j++){
            System.out.print(" ");
        }
        // Second part
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
     }
     // Lower half
     for(int i=n; i>=1; i--){
        //First part
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        //Spaces
        int Spaces = 2*(n-i);
        for(int j=1; j<=Spaces; j++){
            System.out.print(" ");
        }
        // Second part
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
     } 


    }
}