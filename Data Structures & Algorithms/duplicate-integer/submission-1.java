// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         int n=nums.length;
//         Set<Integer> set =new HashSet<>();
//         for(int num : nums)
//         {
//             set.add(num);
//         }
//         return n!=set.size();
//     }
// }


class Solution
{
    public boolean hasDuplicate(int[] nums)
    {
        Set<Integer> set=new HashSet<>();
        for(int num : nums)
        {
            if(!set.add(num))
            {
                return true;
            }
        }
        return false;
    }
}