import java.util.*;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> nums2 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultNums = new ArrayList<>();
        for (int i = 0; i < Math.min(nums1.size(), nums2.size()); i++) {
            resultNums.add(nums1.get(i));
            resultNums.add(nums2.get(i));
        }
        if (nums1.size() > nums2.size()) {
            resultNums.addAll(getRemainingElements(nums1, nums2));
        } else if (nums1.size() < nums2.size()) {
            resultNums.addAll(getRemainingElements(nums2, nums1));
        }
        System.out.println(resultNums.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> getRemainingElements(List<Integer> longerList, List<Integer> shorterList) {
        List<Integer> nums = new ArrayList<>();
        for (int i = shorterList.size(); i < longerList.size(); i++) {
            nums.add(longerList.get(i));
        }
        return nums;
    }
}
