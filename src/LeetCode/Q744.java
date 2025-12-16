package LeetCode;

public class Q744 {
    public static void main(String[] args) {
        char[] letter = {'c','f','y'};
        char target = 'd';
        char a = nextGreatestLetter(letter,target);
        System.out.println(a);
    }
    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        if (target < letters[0] || target > letters[letters.length-1]) {
            return letters[0];
        }else {
            while (start <= end) {
                int mid = (start+end)/2;
                if (target < letters[mid]) {
                    end =  mid - 1;
                }else {
                    start = mid + 1;
                }
            }
            return letters[start % letters.length];
        }
    }
}

