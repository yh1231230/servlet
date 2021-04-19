package test01;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        Iterator<String> iterator=list.listIterator();
        while (iterator.hasNext()){
            String temp= iterator.next();
            System.out.println(temp);
        }

        for(String temp:list){
            System.out.println(temp);
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(100, "aa");
        map.put(200, "bb");

        Set<Integer> keyset2=map.keySet();
        for (Integer temp:keyset2
             ) {
            System.out.println(temp+map.get(temp));
        }

        Set<Map.Entry<Integer,String>> entrySet2=map.entrySet();
        for (Map.Entry<Integer,String> temp:entrySet2
             ) {
            System.out.println(temp.getKey()+temp.getValue());
        }


        Iterator<Map.Entry<Integer,String>> iterator2=entrySet2.iterator();
        while(iterator2.hasNext()){
            Map.Entry<Integer,String> temp=iterator2.next();
            System.out.println(temp.getKey()+temp.getValue());
        }

        for (String temp:map.values()
             ) {
            System.out.println(temp);
        }




        //通过keySet()遍历   通常使用
       Set<Integer> keySet=map.keySet();
        for (Integer temp:map.keySet()
             ) {
            System.out.println(temp+map.get(temp));
        }







//        Set<Integer> keyset=map.keySet();
//        for (Integer temp:keyset
//             ) {
//            System.out.println(
//                    temp+map.get(temp)
//            );
//        }
//


        //通过Iterator遍历
        Iterator<Map.Entry<Integer,String>> iterator1=map.entrySet().iterator();
        while(iterator1.hasNext()){
            Map.Entry<Integer,String> temp=iterator1.next();
            System.out.println(temp.getKey()+temp.getValue());
        }










//        Iterator<Map.Entry<Integer, String>> iterator2 = (map.entrySet()).iterator();
//        while (iterator2.hasNext()) {
//            Map.Entry<Integer, String> m = iterator2.next();
//            System.out.println(m.getKey() + m.getValue());
//        }





        //通过entrySet()遍历  大量数据时使用
        Set<Map.Entry<Integer,String>> entrySet=map.entrySet();
        for (Map.Entry<Integer,String> temp:map.entrySet()
             ) {
            System.out.println(temp.getKey()+ temp.getValue());
        }








//        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//        for (Map.Entry<Integer, String> temp : entrySet
//        ) {
//            System.out.println(temp.getKey() + temp.getValue());
//        }




        //通过values()遍历

        for (String temp:map.values()
             ) {
            System.out.println(temp);
        }













//      for(String temp:map.values()){
//          System.out.println(temp);





    }
}
