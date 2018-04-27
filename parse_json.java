import java.util.*;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    String json = "{\"name\":\"John\",\"from\":\"USA\",\"hobby\":[\"reading\",\"sleeping\",\"bball\"],\"sex\":[],\"language\":[\"Mongolian\"],\"food\":{\"chinese\":{\"soup\":\"egg soup\",\"dishes\":\"fried chicken\"},\"japanese\":[\"sushi\",\"noodle\",\"hot pot\"]}}";    
    HashMap hm = json2HashMap(json);
    
    Set set = hm.entrySet();
    Iterator i = set.iterator();    
    while(i.hasNext()) {
      Map.Entry me = (Map.Entry)i.next();
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
    }
    System.out.println();
    
    //System.out.print(hm.get("name"));
  }
  
  public static HashMap json2HashMap(String s){
    HashMap<String,Object> hm = new HashMap<String,Object>();
    int idx = 0;
    String key;
    int start_idx = 0;
    int end_idx = 0;
    int sep = 0;
    
    while (s.indexOf('\"',idx+1) != -1) {
      start_idx = s.indexOf('\"',idx+1);
      end_idx = s.indexOf('\"',start_idx+1);
      key = s.substring(start_idx+1,end_idx);
      sep = s.indexOf(':',end_idx);  
      // if a value is a list []
      if (s.substring(sep+1,sep+2).indexOf('[') != -1) {
        List<String> value = new ArrayList<String>();
        idx = s.indexOf('[',sep+1) + 1;
        while (idx >= s.indexOf('[',sep+1) && idx < s.indexOf(']',sep+1) ){
          start_idx = s.indexOf('\"',idx);
          end_idx = s.indexOf('\"',start_idx+1);
          value.add(s.substring(start_idx+1,end_idx));
          idx = end_idx + 1;
        }
        hm.put(key, value);        
      } 
      // if a value is a hashmap {}
      else if (s.substring(sep+1,sep+2).indexOf('{') != -1) {
        start_idx = s.indexOf('{',sep+1);
        int start = start_idx;
        end_idx = s.indexOf('}',start+1);
        while (s.substring(start+1,end_idx).indexOf('{') != -1 ){
          start = s.indexOf('{',start+1);
          end_idx = end_idx + 1;
        }
        end_idx = s.indexOf('}',end_idx);
        HashMap value = json2HashMap(s.substring(start_idx,end_idx+1));
        hm.put(key, value);
        idx = end_idx;
        
      }
      // if a value is a string
      else {
        start_idx = s.indexOf('\"',sep+1);
        end_idx = s.indexOf('\"',start_idx+1);
        String value = s.substring(start_idx+1,end_idx);
        hm.put(key, value);
        idx = end_idx;
      }
      
      //hm.put(key, value);
      //idx = end_idx;
       
    }
    
    return hm;
  }
}