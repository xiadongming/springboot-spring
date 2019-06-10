package com.itchina.vip.factory.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyListTest {
	public static void main(String[] args) {

		// new MyList().sort(new NumberComparator());

		List<Long> list = new ArrayList();

		Collections.sort(list, new Comparator<Long>() {

			@Override
			public int compare(Long o1, Long o2) {
				return 0;
			}
		});

		System.out.println(list);
	}

}
