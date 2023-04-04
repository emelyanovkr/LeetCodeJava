package org.example;

import java.lang.Object;
import java.util.*;
import java.io.*;
import java.text.*;
import java.security.*;

/*class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}*/

/*class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}*/

// to check if
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> counter = new HashMap<>();
        for (char k : magazine.toCharArray()) {
            counter.put(k, counter.getOrDefault(k, 0) + 1);
        }

        for(char k : ransomNote.toCharArray()) {
            if(counter.containsKey(k)) {
                int curValue = counter.get(k);
                counter.put(k, curValue - 1);
            }
            else {
                return false;
            }
        }

        return true;
    }

}

class Main {
    public static void main(String[] args) {

    }
}