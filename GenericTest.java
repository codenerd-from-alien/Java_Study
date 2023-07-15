package Generics_study;

import java.util.ArrayList;
import java.util.Objects;


class Product{}
class Tv extends Product{}
class Audio extends Product{}
public class GenericTest {
    public static void main(String[] args) {
//        ArrayList<Integer> lst = new ArrayList<Integer>();
//        lst.add(10);
//        lst.add(20);
//        //lst.add("30"); //에러 방생
//
//        //만약에 integer로 받으면??
//        Integer i = (Integer)lst.get(2);//컴파일이 가능하다. ->하지만 ClassCastException 발생
//        //컴파일러의 한계임
//        System.out.println(lst);

          //여러 종류의 객체를 저장을 하고 싶을 때는?
//          ArrayList<Object> list = new ArrayList<Object>();
//          list.add(10);
//          list.add(20);
//          list.add("30");
//          String i = (String)list.get(2); //값을 가져올 수 있다.
//          System.out.println(i);

//        ArrayList list = new ArrayList();//모든 타입 객체 저장 가능
//        list.add(new Tv());
//        list.add(new Audio());//에러 발생

          ArrayList<Product> productList = new ArrayList<Product>();
          //ArrayList<Tv> tvList = new ArrayList<Product>();//<-에러 발생

          ArrayList<Tv> tvList = new ArrayList<Tv>();

          tvList.add(new Tv());
          tvList.add(new Tv());
          //tvList.add(new Audio());//오디오는 tv의 자손이 아니다!
    }
}
