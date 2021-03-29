class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for (int i=0; i<address.length(); i++){
            if (address.charAt(i) == '.') {
                str.append("[.]");
            }
            else {
                str.append(address.charAt(i));
            } 
        }
        return str.toString();
    }
}

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()){
            if (c == '.') sb.append("[.]");
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}