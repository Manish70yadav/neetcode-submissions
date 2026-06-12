class Solution {

    public String getFrequencyString(String str)
    {
        int freq[]=new int[26];
        for(char ch : str.toCharArray())
        {
            freq[ch-'a']++;
        }

        StringBuilder freqString=new StringBuilder();
        for(int i : freq)
        {
            char c='a';
            freqString.append(c);
            freqString.append(i);
            c++;
        }
        return freqString.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0)
        {
            return new ArrayList<>();
        }
        HashMap<String ,List<String>> frequencyStringMap=new HashMap<>();
        for(String str : strs)
        {
            String freqString=getFrequencyString(str);
            if(frequencyStringMap.containsKey(freqString))
            {
                frequencyStringMap.get(freqString).add(str);
            }
            else
            {
                List<String> strList=new ArrayList<>();
                strList.add(str);
                frequencyStringMap.put(freqString,strList);
            }
        }
        return new ArrayList<>(frequencyStringMap.values());
    }
}
