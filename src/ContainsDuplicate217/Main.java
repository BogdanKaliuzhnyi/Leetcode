package ContainsDuplicate217;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[] {1,2,3,1};
        Solution solution = new Solution();
        boolean result = solution.containsDuplicate(array);
        System.out.println(result);
    }
}
