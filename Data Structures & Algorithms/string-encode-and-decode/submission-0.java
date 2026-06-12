class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for (String str : strs) {
            encodedString.append(str.length()).append('#').append(str);
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int sepIdx = str.indexOf('#', i);

            int len = Integer.parseInt(str.substring(i, sepIdx));

            i = sepIdx + 1;

            String decodedString = str.substring(i, i + len);
            decodedStrings.add(decodedString);

            i += len;
        }

        return decodedStrings;
    }
}