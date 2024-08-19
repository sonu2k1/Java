public class HalfPyramid {
    
   //Inverter left pyrimid
   /*
       * 
      **
     ***
    ****  
    */
    public static void inverted_Pyramid(int n){
    
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }    
    }

    //Inverter right pyrimid with number
    /*
     12345
     1234
     123
     12
     1
     */
    public static void inv_pyr_num(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }

    //Floyd Triangle
    /*
     1
     12
     123
     1234 
     */
    public static void floyd_tri(int n){
        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    //0-1 Triangle
    public static void zero_one(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               if((i+j)%2==0){
                System.out.print("1 ");
               }
               else{
                System.out.print(" 0");
               }
              
            }
            System.out.println();
        }
    }

    //Butterfly Pattern
    public static void Butterfly(int n){
        //1st half
       for(int i=1;i<=n;i++){
        // Stars
        for(int j=1;j<=i;j++){
            System.out.print("*");

        }
        //Spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //Stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       //2nd Half
       for(int i=n;i>=1;i--){
        // Stars
        for(int j=1;j<=i;j++){
            System.out.print("*");

        }
        //Spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //Stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }

    }   

    //Rhombus
    public static void solid_Rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();  
        }
    }

     //Hollow Rhombus
     public static void hollow_Rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();  
        }
    }

    //Diamond pattern
    public static void Diamond(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }

    public static void main(String[] args){

       // inverted_Pyramid(4);
        //inv_pyr_num(5);
      //  floyd_tri(5);
      
      //zero_one(5);
      //Butterfly(5);  
    //solid_Rhombus(5);
    //hollow_Rhombus(5);
    Diamond(5);
    }
}
