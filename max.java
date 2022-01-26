public class max {
public static void main(String[] args) {
int[] arrays={525, 35, 264323, 2666, 3144155};   
int fine = two(arrays);
System.out.println(fine);
}
static int two(int[] maxs){
int fine=maxs[0];
for(int i=1;i<maxs.length;i++){
if(maxs[i]>fine){
fine = maxs[i];
}
}
return fine;
}  
}
