package com.task.sprint1;

import java.util.Comparator;

public class CoursePriceComparatorDesc implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (o1.getCourseFees() < o2.getCourseFees()) {
			return 1;
		} else if (o1.getCourseFees() > o2.getCourseFees()) {
			return -1;
		} else {
			return 0;
		}
	}

}
