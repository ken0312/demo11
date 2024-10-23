package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class Lec4Test {
	@Test
	public void arrayTest(){
		int arr1[] = new int[7];
		Integer[]arr1class = new Integer[7];
		int []arr2 = new int[7];
		int []arr3 = {1,2,3,4,5,6,7};
		System.out.println(arr1[1]);
		System.out.println(arr1class[1]);
		System.out.println(arr3[6]);
		arr1[0]= 99;
		
		double []weather = {26.5,27.3,24.9,27.3,23.5,26.6,27.1,};
		System.out.println(weather[0]);
		this.avgWeather(weather);
	}
	public double avgWeather(double []weatherData) {
		double sum=0;
		for(int i = 0;i<weatherData.length;i++) {
			 sum+=weatherData[i];
			System.out.println(weatherData[i]);
		}
		double avg = sum/weatherData.length;
		System.out.printf("%.2f" ,avg);
		return avg;
	}
	@Test
	public void score() {
		int []score = {60,70,76,61,85};
		//System.out.println(score[4]);
		this.score2(score);
		this.avgscore(score);
		
	}
	public double score2(int []scoreData) {
		int max,min;
		System.out.println("块皚:"+ Arrays.toString(scoreData));
		max=min=scoreData[0];
		double sum=0;
		for(int i = 0;i<scoreData.length;i++) {
			if(scoreData[i]>max) {
				max=scoreData[i];
			}
			if(scoreData[i]<min) {
				min=scoreData[i];
			}
			 sum+=scoreData[i];
			
		}
		
		/*for(int sc:scoreData) {
			if(sc>max) {
				max=sc;
			}
			if(sc<min) {
				min=sc;
			}
		}*/
		System.out.printf("\n﹍羆だ计:"+sum);
		sum=(sum-max-min);//羆㎝搭奔程籔程
		double avg = sum/(scoreData.length-2);
		System.out.printf("\nΙ埃程蔼:%dだ籔程:%dだ羆だ:"+sum,max,min);
		//System.out.println(min);
		System.out.printf("\nキАだ计:"+"%.2f",avg);
		//System.out.println(max);
		//System.out.println(min);
		return avg;
	}
	public double avgscore(int[]score) {
		System.out.println("\n眤块皚:"+ Arrays.toString(score));
		Arrays.sort(score);
		System.out.println("\n逼:"+Arrays.toString(score));
		int sum = 0;
		for(int i = 0;i<score.length;i++) {
			sum+=score[i];
		}
		System.out.printf("\nΙ埃程蔼:%dだ籔程:%dだ羆だ%dキАだ计:%d",score[0],score[score.length-1],(sum-score[0]-score[score.length-1]),(sum-score[0]-score[score.length-1])/(score.length-2));
		return sum/(score.length-2);
	}
	@Test
	public void arrayListTest() {
		List<String> list1 = Arrays.asList("1","2");//礚猭糤 ㏕﹚
		List<Integer> list2 = List.of(99,100);//礚猭糤 ㏕﹚
		List<Character> list3 = new ArrayList<>();
		List<Integer> list4 = new ArrayList<>(500);
		ArrayList<String> list5 = new ArrayList();
		list3 = new LinkedList<Character>();
		list4 = new LinkedList<Integer>(list2);
		list4.add(3);
		System.out.println(list1.get(1));
		System.out.println(list2.get(0));
		list4.remove(1);
		System.out.println(list4.get(1));
		List<Double> templist = Arrays.asList(30.0,28.5,29.0,30.5,31.0,26.5,27.0);
		List<Double> weatherList1= new ArrayList<>(templist);
		List<Double> weatherList2 = new ArrayList<>(List.of(30.0,28.5,29.0,30.5,31.0,26.5,27.0));
		/*weatherList1.add(30.0);
		weatherList1.add(28.5);
		weatherList1.add(29.5);
		weatherList1.add(28.0);
		weatherList1.add(27.5);
		weatherList1.add(31.0);
		weatherList1.add(30.5);*/
		for(int i = 0;i<weatherList1.size();i++) {
			System.out.print(weatherList1.get(i)+" ");
		}
		weatherList1.remove(weatherList1.indexOf(27.0));
		int a = weatherList1.indexOf(27.0);
		System.out.println(weatherList1.contains(29.0));
		System.out.println("\n"+a);
		this .weatherList(templist);
	}
	@Test
	public double weatherList(List<Double>weatherList) {
		double sum = 0;
		/*for(int i = 0;i<weatherList.size();i++) {
			sum += weatherList.get(i);
		}*/
		for(Double item : weatherList) {//item = weatherList.get(i);
			if(weatherList.indexOf(item)== 0) {
				//
				weatherList.remove(0);
				weatherList.add(0.0);
			}
			
			System.out.println(item);
		}
		/*weatherList.forEach(item -> {
			sum += item;
			System.out.println(item);
		});*/
		for(double weather:weatherList) {
			
		}
		/*weatherList.forEach(item->{
		
			if(weatherList.indexOf(item)== 0) {
				//
				weatherList.remove(0);
				weatherList.add(0.0);
			}
		});*/
		return sum/weatherList.size();
	}
	@Test
	public void classTest1() {
		List<Integer> List1 = new ArrayList<>((int)(Math.random()*10000));
		System.out.println(List1.get(0));
		
		
			
		/*List<Integer> classTest2 = new ArrayList<>();
		Random r = new Random();
		
		
		System.out.println(classTest2.get(0));*/
		}
		
		
		
		
		
	
}