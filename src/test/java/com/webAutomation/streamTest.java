package com.webAutomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class streamTest {
	
//	@Test
	public void streamFilter()
	{
		String[] arr = {"Abhinay","Cannul","Animal","Sunny","Anmol","Kumud" };
		List<String> names = Arrays.asList(arr);
		int count = (int) names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(count);
		long d = Stream.of("Abhinay","Cannul","Animal","Sunny","Anmol","Kumud","Sony").filter(s->
		{s.startsWith(s);
		return true;}).count();
		System.out.println(d);
	}
	
//	@Test
	public void streamFilterSort()
	{
		String[] arr = {"Abhinay","Cannul","Animal","Sunny","Anmol","Kumud" };
		List<String> names = Arrays.asList(arr);
		names.stream().filter(s->s.endsWith("l")).sorted().forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>5).sorted().limit(1).forEach(s->System.out.println(s));
		
	}
	
//	@Test
	public void streamMap()
	{
		Stream.of("Abhinay","Cannul","Animal","Sunny","Anmol","Kumud" ).filter(s->s.endsWith("y")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		String[] arr = {"Abhinay","Cannul","Animal","Sunny","Anmol","Kumud" };
		List<String> names = Arrays.asList(arr);
		String[] arr2 = {"Rahul","Kausik","Animal","Sunny","Anmol","Tara" };
		List<String> names2 = Arrays.asList(arr2);
		
		Stream<String> newStream = Stream.concat(names.stream(), names2.stream()); 
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Rahul"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
	
	@Test
	public void streamCollect()
	{
		List<String> newList = Stream.of("Abhinay","Cannul","Animal","Sunny","Anmol","Kumud" ).filter(s->s.endsWith("y")).map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(newList.get(0));
		List<Integer> values = Arrays.asList(3,2,3,4,5,6,5,7,2);
		values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li);
	}

}
