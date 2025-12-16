package LeetCode;

import javax.security.auth.login.CredentialException;
import java.util.Arrays;

public class Q34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] out = searchRange(nums,target);
        System.out.println(Arrays.toString(out));
    }
//    public static int[] searchRange(int[] nums, int target) {
//        int[] out = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target){
//                out[0] = i ;
//                for (int j = i; j < nums.length ; j++) {
//                    if (nums[j] == target) {
//                        out[1] = j;
//                    }
//                }
//                break;
//            }
//        }
//        return out;
//    }

    public static int[] searchRange(int[] nums , int target) {
        int[] out = {-1,-1};
        out[0] = search(nums,target,true);
        out[1] = search(nums,target,false);
        return out;
    }
    public static int search (int[] nums , int target , boolean findTheIndex ) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = ( start + end ) / 2;
            if (target < nums[mid]) {
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid+1;
            }
            else  {
                ans = mid;
                if (findTheIndex == true) {
                    end = mid -1;
                }
                else {
                    start = mid +1;
                }

            }
        }
        return ans;
    }
}
