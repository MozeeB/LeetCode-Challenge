class Solution {

  fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    // Pointers for nums1, nums2, and the final position in nums1
    var p1 = m - 1 // Last actual element in nums1
    var p2 = n - 1 // Last element in nums2
    var p = m + n - 1 // Last position in nums1 (end of the array)

    // While there are elements in both arrays to be merged
    while (p1 >= 0 && p2 >= 0) {
        if (nums1[p1] > nums2[p2]) {
            nums1[p] = nums1[p1]
            p1--
        } else {
            nums1[p] = nums2[p2]
            p2--
        }
        p--
    }

    // If there are still elements left in nums2, copy them into nums1
    while (p2 >= 0) {
        nums1[p] = nums2[p2]
        p2--
        p--
    }
  }
}
