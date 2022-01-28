public class wealth{
    public static void main(String[] args){
       int[][] anu={{65,56,64,32},{56, 65, 23, 56}};
       int fine= siva(anu);
       System.out.println(fine);
    }
    static int siva(int[][] one){
       int max=0;
    for(int i=0; i<one.length;i++){
     int increase=0;
     for(int j=0;j<one[i].length;j++){
       increase+=one[i][j];
     }
    if(increase>max){
       max=increase;
    }
   }
   return max;
    }
   }