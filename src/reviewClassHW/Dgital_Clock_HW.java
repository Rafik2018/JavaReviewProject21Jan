package reviewClassHW;

public class Dgital_Clock_HW {

    public static void main(String[] args) {


        for (int h1 = 0; h1 <= 2; h1++) {
            for (int h2 = 0; h2 <= 9; h2++) {
            if (h1==2 && h2==4){

           break;
}
            for (int min =0; min<=59; min++){
                if (min < 10) {
                    System.out.println(h1 + "" + h2 + ":0" + min);
                }else {
                    System.out.println(h1 + "" + h2 + ":" + min);
                }
              }

            }

        }
    }
}























/*

             With seconds


        for(int i=0;i<=2;i++){
        for(int j=0;j<=3;j++){
        for(int k=0;k<=5;k++){
        for(int l=0;l<=9;l++){
        for(int m=0;m<=5;m++){
        for(int n=0;n<=9;n++){
        System.out.println(i+""+j+":"+k+""+l+":"+m+""+n);
        }
        }
        }
        }
        }
        }*/
