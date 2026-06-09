
// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int num : nums)
//         {
//             map.put(num,map.getOrDefault(num,0)+1);
//         }

//         PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
//             pq.addAll(map.entrySet());

//         int result[]=new int[k];
//         for(int i=0;i<k;i++)
//         {
//             result[i]=pq.poll().getKey();
//         }
//         return result;
//     }
// }



class Number implements Comparable<Number>
{
    int element;
    int freq;
    public Number(int element,int freq)
    {
        this.element=element;
        this.freq=freq;
    }
    public int compareTo(Number that)
    {
        return that.freq-this.freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Number> pq=new PriorityQueue<>();
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num : nums)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : freq.entrySet())
        {
            Number number=new Number(entry.getKey(),entry.getValue());
            pq.offer(number);
        }
        int result[]=new int[k];
        int idx=0;
        while(idx<k)
        {
            result[idx]=pq.poll().element;
            idx++;
        }
        return result;
    }
}