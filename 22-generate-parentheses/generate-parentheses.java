class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        paren("", n, ans, 0, 0);
        return ans;
    }
    private void paren(String s, int n, List<String> soln, int open, int close) {
        if (s.length() == 2 * n) {
            soln.add(s);
            return;
        }
        if (open < n) {
            paren(s + "(", n, soln, open + 1, close);
        }
        if (close < open) {
            paren(s + ")", n, soln, open, close + 1);
        }
    }
}