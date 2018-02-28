package com.alexjamesmalcolm.virtualpetjpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StatusIterator implements Iterator<String> {
	List<String> lines = new ArrayList<>();
	int position = 0;

	public StatusIterator(String status) {
		lines = Arrays.asList(status.split("//n"));
	}

	@Override
	public boolean hasNext() {
		return position < lines.size();
	}

	@Override
	public String next() {
		if (hasNext()) {
			String result = lines.get(position);
			position++;
			return result;
		}
		throw new NoSuchElementException();
	}

}
