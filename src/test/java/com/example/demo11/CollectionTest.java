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
		// List �O����(Interface)�A�u�O�Ψөw�q��k�A�S�������@���e:�ҥH�L�k��new�إ߹��
		// ArrayList �O�Ψӹ�{�w�q�b List ����k����@���O(class)
		List<Bank> list = new ArrayList<>();
		// List ������ƫ��A�����8�ذ򥻸�ƫ��A�A�N��N�O�u������O(class)
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
		// 1.�ۦP�������u�|�O�d�@��(�����\���ƪ�����)
		// 2.�L��(���|�̷ӷs�W�����ǨӱƦC)
		Set<String> strSet = new HashSet<>(); // ctrl+shift+o �ֳtimport
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
		// 1.�ۦP�������u�|�O�d�@��(�����\���ƪ�����)
		// 2.����(�|�̷ӷs�W�����ǨӱƦC)
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
		// 1.�ۦP�������u�|�O�d�@��(�����\���ƪ�����)
		// 2.�Ѥp��j�Ƨ�
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
		System.out.println("�̤p����:" + str.first());
		System.out.println("�̤j����" + str.last());
		List<Integer> list = new ArrayList<>(str);
		Collections.reverse(list);
		System.out.println(list);

	}

	@Test
	public void setTest() {
		TreeSet<Integer> set = new TreeSet<>();
		Random ran = new Random();
		while (set.size() < 5) {
			// 1~10���ü�
//			int number = ran.nextInt(1, 11);
//			set.add(number);
			set.add(ran.nextInt(1, 11));
			// �W�z��椤�A�]��number�Q�ŧi��u�Q�ϥΤ@���A�i�H�ΰΦW���覡�X��
		}
		System.out.println("Max" + set.last());
		System.out.println("Min" + set.first());
		
		//�Ѥp��j
		System.out.println(set);
		//�Ѥj��p
		System.out.println(set.descendingSet());
		
	}

	@Test
	public void setTest2() {
		Set<Integer> set = new TreeSet<>();
		Random ran = new Random();
		while (set.size() < 5) {
			// 1~10���ü�
//			int number = ran.nextInt(1, 11);
//			set.add(number);
			set.add(ran.nextInt(1, 11));
			// �W�z��椤�A�]��number�Q�ŧi��u�Q�ϥΤ@���A�i�H�ΰΦW���覡�X��
		}
		// �૬:�N�Ȫ���ƫ��A�ഫ���t�@�ظ�ƫ��A
		// 1.�Q�૬����ƫ��A�g�b�ܼƫe���A�@�w�n���p�A�� (TreeSet<Integer>) set
		// 2.�ϥΤp�A���N�ഫ����ƩM�Ȯئb�@�_�A�o�ˤ~��ϥ��ഫ�᪺��ƫ��A����k ((TreeSet<Integer>) set)
		// 3.�V��
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
			// 1~10���ü�
//			int number = ran.nextInt(1, 11);
//			set.add(number);
			set.add(ran.nextInt(1, 11));
			// �W�z��椤�A�]��number�Q�ŧi��u�Q�ϥΤ@���A�i�H�ΰΦW���覡�X��
		}
		//�N Set �ন List
		List<Integer> list = new ArrayList<>(set);
		System.out.println("Max:" + list.get(list.size()-1) );
		System.out.println("Min:" + list.get(0) );
		//�Ѥp��j(TreeSet�����N�|�q�p�ƨ�j)
		System.out.println(list);
		//�Ѥj��p(TreeSet ���ϧ�)
		Collections.reverse(list);//reverse ����Ƨ�
		System.out.println(list);
	}
	
	@Test
	public void mapTest() {
		// Map<key ����ƫ��A, value ����ƫ��A>
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		//�ϥ� get() �z�Lkey�N������value���X
		String str = map.get(2);
		System.out.println(str);
		//�K�Q:�ϥ� for each �Nmap����key��value���X��
		//�N map �ഫ�� entrySet�Aitem �N�O�]�t key �� value�A�i�H�� getKey �� getValue ����
		for(Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
		System.out.println("=====================");
		//�N map �ন keySet�A�C�� item �N��ܤ@�� key�A�q�L get(item) �N�۹����� value �Ө��X
		for(Integer item:map.keySet()) {
			System.out.println("key: " + item);
			System.out.println("value: " + map.get(item));
		}
		System.out.println("=====================");
		// �쥻 map ���A�w�s�b key = 1 �H�ι�����value = A;
		// �{�b�b�ۦP1����m��J D�Akey = 1 �������value�|�ܦ� D(�ۦP key + ������ value ��\�e)
		map.put(1, "D");
		//���P�� key �A�i�H���ۦP�Τ��P������ value
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
		// key-value �O1��1
		Map<Integer,String> map = new HashMap<>();
		// key-value �O1��h
		Map<Integer,String[]> map2 = new HashMap<>();
		Map<Integer,List<String>> map3 = new HashMap<>();
		Map<Integer,Set<String>> map4 = new HashMap<>();
		Map<Integer,Map<String,String>> map5 = new HashMap<>();
	}
	@Test
	public void test123() {
		// isEmpty():�߰ݶ��X�άOMap �� size �O�_��0(�Ū�)
		List<String> list = new ArrayList<>();
		
		System.out.println(list.isEmpty());
		Set<String> set = new HashSet<>();
		System.out.println(set.isEmpty());
		
		Map<Integer,String> map = new HashMap<>();
		System.out.println(map.isEmpty());
		//=========
		
		// �]�� list2 �O null�A�ҥH�L�k�ϥ�null �z�L.��k()�Ӱ���{���A�|����
		//�U��{�O�|�� NullPointerException(�ū��w���~)
		List<String> list2 = null;
		System.out.println(list2.isEmpty());
	}
	
}
