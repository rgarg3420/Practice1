package com.main.collections;

public class SampleBean {

    private Object key;
    private Object Value;

    /**
     * @return the key
     */
    public Object getKey() {
	return key;
    }

    /**
     * @param key
     *            the key to set
     */
    public void setKey(Object key) {
	this.key = key;
    }

    /**
     * @return the value
     */
    public Object getValue() {
	return Value;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue(Object value) {
	Value = value;
    }

    public static void main(String s[]) {
	NewHashMap<Integer, String> nHS = new NewHashMap<Integer, String>();
	nHS.put(1, "One");
	nHS.put(2, "Two");
	nHS.put(3, "Three");
	nHS.put(1, "One");
	nHS.put(1, "One");
	nHS.put(4, "Four");

	nHS.put(6, null);

	System.out.println("Size : " + nHS.size());

	String value1 = (String) nHS.get(4);
	String value2 = (String) nHS.get(3);

	System.out.println("Value1 :" + value1 + " Value2 :" + value2);

	int i = 0;
	while (i < nHS.size()) {
	    SampleBean sb = nHS.Iterator();
	    System.out.println("Key: " + sb.getKey());
	    System.out.println("  Value :" + sb.getValue());
	    i++;
	}

    }

}
