package Implementations;

public class Trie {

    private TrieNode root;




}

class TrieNode {
    private TrieNode[] children = new TrieNode[26];
    private boolean isWord;

    void insert(String key) {
        int len = key.length();
        int index = 0;
        for (int i = 0; i < len; i++) {
            index = key.charAt(i) - 'a';
            if(children[index] == null)
                children[index] = new TrieNode();

        }
    }


}
