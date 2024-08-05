import java.util.*;

class Solution {
    public String kthDistinct(String[] arr, int k) {

        Map<String, Integer> countMap = new HashMap<>();
        for (String str : arr) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        List<String> distinctStrings = new ArrayList<>();
        for (String str : arr) {
            if (countMap.get(str) == 1) {
                distinctStrings.add(str);
            }
        }

        if (k - 1 < distinctStrings.size()) {
            return distinctStrings.get(k - 1);
        } else {
            return "";
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "grape", "kiwi"};
        int k = 2;
        String result = solution.kthDistinct(arr, k);
        if (!result.isEmpty()) {
            System.out.println("The " + k + "th distinct string is: " + result);
        } else {
            System.out.println("There are not enough distinct strings in the array.");
        }
    }
}
