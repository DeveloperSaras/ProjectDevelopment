package com.sks;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(17);
		list.add(15);
		list.add(109);
		list.add(16);

		System.out.println("My List is : " + list);

		int index = 5;

		if (index > 0 && index < list.size()) {
			ListIterator<Integer> listIt = list.listIterator(index);

			while (listIt.hasNext()) {

				System.out.println("List element is : " + listIt.next());
			}
		}

		else {

			System.out.println("List size is : " + list.size() + " index is " + index
					+ " .it can not be greater than the size of the list");
		}

		ListIterator<Integer> listIt1 = list.listIterator(list.size());

		while (listIt1.hasPrevious()) {
			System.out.println("Element is : " + listIt1.previous());
		}

	}

}
