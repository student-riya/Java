import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        List<Integer> longestSequence = findLongestConsecutiveSequence(arr);
        
        System.out.println("Longest Consecutive Sequence: " + longestSequence);
        System.out.println("Length of Sequence: " + longestSequence.size());
        
        scanner.close();
    }
    
    public static List<Integer> findLongestConsecutiveSequence(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int maxLength = 0;
        List<Integer> longestSequence = new ArrayList<>();
        
        for (int num : nums) {
            if (!numSet.contains(num - 1)) { // Start of a sequence
                int currentNum = num;
                List<Integer> currentSequence = new ArrayList<>();
                
                while (numSet.contains(currentNum)) {
                    currentSequence.add(currentNum);
                    currentNum++;
                }
                
                if (currentSequence.size() > maxLength) {
                    maxLength = currentSequence.size();
                    longestSequence = new ArrayList<>(currentSequence);
                }
            }
        }
        
        return longestSequence;
    }
}
