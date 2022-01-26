public class linear{
public static void main(String[] args) {
int[] arrays= {56, 56, 56 , 854};
int onee= one(arrays, 52);
System.out.println(onee);
}
static int one(int[] nums, int target){
for(int i=0; i<nums.length;i++){
if(nums[i]==target){
return i;
}
}
return -1;
}
}