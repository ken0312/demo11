package com.example.demo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class CollectionTest {

	@Test
	public void listTest() {
		String str = new String();
		Bank bank = new Bank();
		// List 是介面(Interface)，只是用來定義方法，沒有任何實作內容:所以無法用new建立實例
		// ArrayList 是用來實現定義在 List 中方法的實作類別(class)
		List<Bank> list = new ArrayList<>();
		// List 中的資料型態不能放8種基本資料型態，意思就是只能放類別(class)
		List<Integer> intlist = new ArrayList<>();
		intlist.add(1);
		intlist.add(2);
		intlist.add(1);
		intlist.add(3);
		intlist.add(2, 5);

		for (Integer item : intlist) {
			System.out.println(item);
		}
		System.out.println("============================");
		intlist.remove(2);
		for (Integer item : intlist) {
			System.out.println(item);
		}
	}

	@Test
	public void listTest1() {
		List<String> strlist = new ArrayList<>();
		strlist.add("A");
		strlist.add("B");
		strlist.add("A");
		strlist.add("C");
		for (int i = 0; i < strlist.size(); i++) {
			if (strlist.get(i).equals("B")) {
				strlist.remove(strlist.get(i));
			}
			System.out.println(strlist.get(i));
		}
		System.out.println("================");
		/*
		 * for (String item : strlist) { if(item.equals("B")) { strlist.remove(item); }
		 * System.out.println(item); }
		 */
	}

	@Test
	public void listTest2() {
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("C");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		List<String> strlist = new ArrayList<>();
		strlist.add("A");
		strlist.add("B");
		strlist.add("A");
		strlist.add("C");
		System.out.println(strlist.get(0));
		System.out.println(strlist.get(strlist.size() - 1));
	}

	@Test
	public void HashSetTest() {
		// HashSet
		// 1.相同的元素只會保留一個(不允許重複的元素)
		// 2.無序(不會依照新增的順序來排列)
		Set<String> strSet = new HashSet<>(); // ctrl+shift+o 快速import
		strSet.add("A");
		strSet.add("E");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("C");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void linkedHashSetTest() {
		// LinkedHashSet
		// 1.相同的元素只會保留一個(不允許重複的元素)
		// 2.有序(會依照新增的順序來排列)
		Set<String> strSet = new LinkedHashSet<>();
		strSet.add("A");
		strSet.add("B");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("C");
		strSet.add("E");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void TreeSetTest() {
		// TreeSet
		// 1.相同的元素只會保留一個(不允許重複的元素)
		// 2.由小到大排序
		Set<String> strSet = new TreeSet<>();
		strSet.add("A");
		strSet.add("B");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("C");
		strSet.add("E");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void classTest() {

		Random ran = new Random();
		TreeSet<Integer> str = new TreeSet<>();
		for (; str.size() < 5;) {
			int num = ran.nextInt(1, 11);
			str.add(num);
		}

		for (Integer item : str) {

			System.out.println(item);

		}
		System.out.println("最小的數:" + str.first());
		System.out.println("最大的數" + str.last());
		List<Integer> list = new ArrayList<>(str);
		Collections.reverse(list);
		System.out.println(list);

	}

	@Test
	public void setTest() {
		TreeSet<Integer> set = new TreeSet<>();
		Random ran = new Random();
		while (set.size() < 5) {
			// 1~10的亂數
//			int number = ran.nextInt(1, 11);
//			set.add(number);
			set.add(ran.nextInt(1, 11));
			// 上述兩行中，因為number被宣告後只被使用一次，可以用匿名的方式合併
		}
		System.out.println("Max" + set.last());
		System.out.println("Min" + set.first());
		
		//由小到大
		System.out.println(set);
		//由大到小
		System.out.println(set.descendingSet());
		
	}

	@Test
	public void setTest2() {
		Set<Integer> set = new TreeSet<>();
		Random ran = new Random();
		while (set.size() < 5) {
			// 1~10的亂數
//			int number = ran.nextInt(1, 11);
//			set.add(number);
			set.add(ran.nextInt(1, 11));
			// 上述兩行中，因為number被宣告後只被使用一次，可以用匿名的方式合併
		}
		// 轉型:將值的資料型態轉換成另一種資料型態
		// 1.被轉型的資料型態寫在變數前面，一定要有小括號 (TreeSet<Integer>) set
		// 2.使用小括號將轉換的資料和值框在一起，這樣才能使用轉換後的資料型態的方法 ((TreeSet<Integer>) set)
		// 3.慎用
		System.out.println("Max" + ((TreeSet<Integer>) set).last());
		System.out.println("Min" + ((TreeSet<Integer>) set).first());
		for (Integer item : set) {
			System.out.println(item);
		}
		List list = new ArrayList<>(set);
		Collections.reverse(list);
		System.out.println(list);
	}

	@Test
	public void setTest3() {
		Set<Integer> set = new TreeSet<>();
		Random ran = new Random();
		while (set.size() < 5) {
			// 1~10的亂數
//			int number = ran.nextInt(1, 11);
//			set.add(number);
			set.add(ran.nextInt(1, 11));
			// 上述兩行中，因為number被宣告後只被使用一次，可以用匿名的方式合併
		}
		//將 Set 轉成 List
		List<Integer> list = new ArrayList<>(set);
		System.out.println("Max:" + list.get(list.size()-1) );
		System.out.println("Min:" + list.get(0) );
		//由小到大(TreeSet本身就會從小排到大)
		System.out.println(list);
		//由大到小(TreeSet 的反序)
		Collections.reverse(list);//reverse 反轉排序
		System.out.println(list);
	}
	
	@Test
	public void mapTest() {
		// Map<key 的資料型態, value 的資料型態>
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		//使用 get() 透過key將對應的value取出
		String str = map.get(2);
		System.out.println(str);
		//便利:使用 for each 將map中的key跟value取出來
		//將 map 轉換成 entrySet，item 就是包含 key 跟 value，可以用 getKey 跟 getValue 取值
		for(Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
		System.out.println("=====================");
		//將 map 轉成 keySet，每個 item 就表示一個 key，通過 get(item) 將相對應的 value 來取出
		for(Integer item:map.keySet()) {
			System.out.println("key: " + item);
			System.out.println("value: " + map.get(item));
		}
		System.out.println("=====================");
		// 原本 map 中，已存在 key = 1 以及對應的value = A;
		// 現在在相同1的位置放入 D，key = 1 其對應的value會變成 D(相同 key + 對應的 value 後蓋前)
		map.put(1, "D");
		//不同的 key ，可以有相同或不同的對應 value
		map.put(4, "D");
		for(Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
		map.containsKey(str);
		map.containsValue(str);
		}
	@Test 
	public void mapTest2() {
		// key-value 是1對1
		Map<Integer,String> map = new HashMap<>();
		// key-value 是1對多
		Map<Integer,String[]> map2 = new HashMap<>();
		Map<Integer,List<String>> map3 = new HashMap<>();
		Map<Integer,Set<String>> map4 = new HashMap<>();
		Map<Integer,Map<String,String>> map5 = new HashMap<>();
	}
	@Test
	public void test123() {
		// isEmpty():詢問集合或是Map 其 size 是否為0(空的)
		List<String> list = new ArrayList<>();
		
		System.out.println(list.isEmpty());
		Set<String> set = new HashSet<>();
		System.out.println(set.isEmpty());
		
		Map<Integer,String> map = new HashMap<>();
		System.out.println(map.isEmpty());
		//=========
		
		// 因為 list2 是 null，所以無法使用null 透過.方法()來執行程式，會報錯
		//下行程是會報 NullPointerException(空指針錯誤)
		List<String> list2 = null;
		System.out.println(list2.isEmpty());
	}
	
}
