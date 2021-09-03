package com.example.力扣Test;

import com.example.线程池.Main;
import lombok.val;

import javax.print.DocFlavor;
import java.util.*;
import java.util.stream.Collectors;

public class MainTest {
    public static void main(String args[]) {

        MainTest mainTest = new MainTest();
        int a = mainTest.numWays(46);
        System.out.println(a);
    }

    public String reorganizeString(String S) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            if (map.get(S.charAt(i)) == null) {
                map.put(S.charAt(i), 1);
            } else {
                map.put(S.charAt(i), map.get(S.charAt(i) + 1));
            }
        }

        Map<Character, Integer> sortedMap2 = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal,
                        LinkedHashMap::new));


        return null;
    }

    public int[] reversePrint(ListNode head) {
        List<Integer> list = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] arr = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            arr[i] = stack.pop();
            System.out.println(arr[i]);
        }
        return arr;
    }


    /**
     * 生成 n  位的全排序
     *
     * @param n
     * @return
     */
    public int[] printNumbers(int n) {
        return null;
    }


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
            if (map.size() > 1) {
                if (map.get(target - nums[i]) != null) {
                    result[0] = target - nums[i];
                    result[1] = nums[i];
                }
            }
        }
        return result;
    }

    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            //每次取末尾数字
            int tmp = x % 10;
            //判断是否 大于 最大32位整数
            if (res > Integer.MAX_VALUE || (res == Integer.MAX_VALUE && tmp > 7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (res < Integer.MIN_VALUE || (res == Integer.MIN_VALUE && tmp < -8)) {
                return 0;
            }
            res = res * 10 + tmp;
            x /= 10;
        }
        return res;
    }


    public boolean isPalindrome(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber / 10;
    }


    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        //公共前缀比所有字符串都短，随便选一个先
        String s = strs[0];
        for (String string : strs) {
            while (!string.startsWith(s)) {
                if (s.length() == 0) return "";
                //公共前缀不匹配就让它变短！
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }


    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        s = s.trim();
        String[] strs = s.split(" ");
        return strs[strs.length - 1].length();
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p = head;
        ListNode q = head;
        for (int i = 0; i < k; i++) {
            q = q.next;
        }
        while (q != null) {
            q = q.next;
            p = p.next;
        }
        return p;
    }

    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return head.next;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }


    public ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }

    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            result += n % 1;
            n >>>= 1;
        }
        return result;
    }

    public int majorityElement(int[] nums) {
        int num = 0;
        int votes = 0;
        for (int n : nums) {
            if (votes == 0) {
                num = n;
            }
            votes = num == n ? votes + 1 : votes - 1;
        }
        return num;
    }

//    public int search(int[] nums, int target) {
//
//
//        int left = 0;
//        int right = nums.length-1;
//        while(nums[left] < target) left++;
//        while(nums[right] > target) right--;
//
//        return right-left-1;
//    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return head.next;
    }

    public int lastRemaining(int n, int m) {
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = (result + m) % i;
        }
        return result;
    }

    //第K小
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        Queue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int item : arr) {
            if (pq.size() < k) {
                pq.offer(item);
            } else if (item < pq.peek()) {
                pq.poll();
                pq.offer(item);
            }
        }
        int[] result = new int[pq.size()];
        int a = 0;
        for (int temp : pq) {
            result[a++] = temp;
        }
        return result;
    }

    public int[][] findContinuousSequence(int target) {
        int i = 1;
        int j = 1;
        int sum = 0;
        List<int[]> result = new LinkedList<>();
        while (i <= target / 2) {
            if (sum < target) {
                sum += j;
                j = j + 1;
            } else if (sum > target) {
                sum -= i;
                i = i + 1;
            } else {
                int[] arr = new int[j - i];
                int a = 0;
                for (int temp = i; temp < j; temp++) {
                    arr[a++] = temp;
                }
                result.add(arr);
                sum -= i;
                i++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if ((nums[left] & 1) != 0) {
                left++;
                continue;
            }
            if ((nums[right] & 1) != 1) {
                right--;
                continue;
            }
            int a = nums[left];
            nums[left++] = nums[right];
            nums[right--] = a;
        }
        return nums;
    }

    // 7 8 9 0 1 2 3 4 5 6
    public int minArray(int[] numbers) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) {
                i = m + 1;
            } else if (numbers[m] < numbers[j]) {
                j = m;
            } else {
                j--;
            }
        }
        return numbers[i];
    }

    int count = 0;
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        this.helper(nums, target, left, right);
        return count;
    }

    // 1 2 3 3 4 5
    public void helper(int[] nums, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                count++;
                helper(nums, target, left, mid-1);
                helper(nums, target, mid+1, right);
            } else if (nums[mid] < target) {
                helper(nums, target, mid+1, right);
            } else {
                helper(nums, target, left, mid-1);
            }
        }
    }


    public int numWays(int n) {
        if(n <= 1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) { // 注意i是从3开始的
            dp[i] =  (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }

    public int missingNumber(int[] nums) {
        if(nums[0] == 1){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    public char firstUniqChar(String s) {
        char[] c = s.toCharArray();
        Map<Character,Boolean> map = new LinkedHashMap<>();
        for(Character character : c){
            if(map.get(character) == null){
                map.put(character,true);
            }else{
                map.put(character,false);
            }
        }
        for(Map.Entry<Character,Boolean> entry:map.entrySet()){
            if(entry.getValue()){
                return entry.getKey();
            }
        }
        return ' ';
    }

    public String reverseWords(String s) {
        String[] strs = s.trim().split(" "); // 删除首尾空格，分割字符串
        StringBuilder res = new StringBuilder();
        for(int i = strs.length - 1; i >= 0; i--) { // 倒序遍历单词列表
            if(strs[i].equals("")) continue; // 遇到空单词则跳过
            res.append(strs[i] + " "); // 将单词拼接至 StringBuilder
        }
        return res.toString().trim(); // 转化为字符串，删除尾部空格，并返回
    }

    public boolean isStraight(int[] nums) {
        int max = 0;
        int min = 14;
        Set<Integer> repeat = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                continue;
            }else{
                if(nums[i] >max){
                    max = nums[i];
                }
                if(nums[i] < min){
                    min = nums[i];
                }
            }
            if(repeat.contains(nums[i])) return false; // 若有重复，提前返回 false
            repeat.add(nums[i]); // 添加此牌至 Set
        }
        return max-min < 5;
    }


    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 1 && matrix[0].length == 0){
            return false;
        }
        for(int i=matrix.length-1;i>=0;i--){
            if(matrix[i][0] > target){
                continue;
            }
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return  false;
    }

    public int sumNums(int n) {
        boolean index = n < 0 && ( n += sumNums(n-1) ) >= 0;
        return n;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
