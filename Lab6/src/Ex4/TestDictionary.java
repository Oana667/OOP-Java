package Ex4;


public class TestDictionary {
    static Dictionary dictionary=new Dictionary();
    public static void  init(){
        dictionary.addWord(new Word("tv"),new Definition("televizor"));
        dictionary.addWord(new Word("car"),new Definition("masina"));
        dictionary.addWord(new Word("museum"),new Definition("muzeu"));
    }
    public static void main(String[] args){
        init();
        dictionary.addWord(new Word("bus"),new Definition("autobuz"));
        System.out.println(dictionary.getAllDefinitions());
        System.out.println(dictionary.getAllWords());
        System.out.println(dictionary.getDefinition(new Word("tv")));
    }
}
