package Implementations;

public class Trie {

    private final TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String key) {
        int len = key.length();
        int index = 0;
        TrieNode crawler = root;
        for (int i = 0; i < len; i++) {
            index = key.charAt(i) - 'a';
            if(crawler.children[index] == null)
                crawler.children[index] = new TrieNode();
            crawler = crawler.children[index];
        }
        crawler.isWord = true;
    }

    public boolean search(String key) {
        int len = key.length();
        int index=0;
        TrieNode crawler = root;
        for (int i = 0; i < len; i++) {
            index = key.charAt(i) - 'a';
            if(crawler.children[index] == null)
                return false;
            crawler = crawler.children[index];
        }
        return (crawler != null && crawler.isWord);
    }

    static class TrieNode {
        final TrieNode[] children = new TrieNode[26];
        boolean isWord;
    }

    public static void main(String...args) {
        Trie trie = new Trie();
        trie.insert("abcd");
        trie.insert("abcc");
        trie.insert("abcde");
        trie.insert("abbc");
        trie.insert("abcd");
        System.out.println(trie.search("f"));
    }
}


