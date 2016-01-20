package com.main.collections;

import java.util.ArrayList;

public class NewHashMap<K, V> {

    private ArrayList<SampleBean> ll = new ArrayList<SampleBean>();
    static int i = -1;

    public void put(Object key, Object value) {
	if (!key.equals(null)) {
	    ArrayList<SampleBean> lcopy = null;
	    boolean flag = false;
	    SampleBean bean = new SampleBean();
	    bean.setKey(key);
	    bean.setValue(value);
	    if (ll.size() < 1) {
		lcopy = new ArrayList<SampleBean>();
		lcopy.add(bean);
		ll.addAll(lcopy);
	    } else if (ll.size() > 0) {

		for (SampleBean sb : ll) {
		    if (sb.getKey().equals(key)) {
			sb.setValue(value);
			flag = true;
			break;
		    }
		}
		if (!flag) {
		    lcopy = new ArrayList<SampleBean>();
		    lcopy.add(bean);
		    ll.addAll(lcopy);
		}

	    }
	}

    }

    public Object get(Object key) {

	int size = ll.size();
	int i = 0;
	Object val = null;
	if (!key.equals(null)) {
	    while (i < size) {
		if (ll.get(i).getKey().equals(key)) {
		    val = ll.get(i).getValue();
		}
		i++;
	    }
	}
	return val;
    }

    public int size() {
	return ll.size();
    }

    public SampleBean Iterator() {
	i++;
	System.out.println("i value :" + i);
	return ll.get(i);
    }

}
