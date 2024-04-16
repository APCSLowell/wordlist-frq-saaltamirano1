import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int num = 0;
    for(int i = 0; i < myList.size(); i++){
      if(myList.get(i).size() == len){
        num = num + 1;
      }
    }
    return num;
  }

  public void removeWordsOfLength(int len)
  {
    for(int i = myList.size()-1; i >= 0; i--){
      if(myList.get(i).size() == len){
        myList.remove(i);
    }
  }
}
