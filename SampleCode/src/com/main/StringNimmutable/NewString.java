package com.main.StringNimmutable;

import java.io.Serializable;
import java.util.Arrays;

public final class NewString implements CharSequence, Comparable<NewString>, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 6286739558990904939L;
    private final char value[];
    private int hash;

    public NewString() {
	this.value = new char[0];
    }

    public NewString(NewString newString) {
	this.value = newString.value;
	this.hash = newString.hash;
    }

    public NewString(char value[], int offset, int count) {
	if (offset < 0) {
	    throw new StringIndexOutOfBoundsException(offset);
	}
	if (count < 0) {
	    throw new StringIndexOutOfBoundsException(count);
	}
	if (offset > value.length - count) {
	    throw new StringIndexOutOfBoundsException();
	}
	this.value = Arrays.copyOfRange(value, offset, offset + count);
    }

    @Override
    public int compareTo(NewString anotherStr) {

	int counter = 0;
	int len1 = value.length;
	int len2 = anotherStr.length();
	int limit = Math.min(len1, len2);
	char[] charArray1 = value;
	char[] charArray2 = anotherStr.value;

	while (counter < limit) {
	    char char1 = charArray1[counter];
	    char char2 = charArray2[counter];

	    if (char1 != char2) {
		return char1 - char2;
	    }
	    counter++;
	}

	return len1 - len2;
    }

    @Override
    public int length() {
	return value.length;
    }

    @Override
    public char charAt(int index) {
	if (index < 0 || index > value.length) {
	    throw new StringIndexOutOfBoundsException(index);
	}
	return value[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
	if (start < 0) {
	    throw new StringIndexOutOfBoundsException(start);
	}
	if (end > value.length) {
	    throw new StringIndexOutOfBoundsException(end);
	}
	return subString(start, end);
    }

    public CharSequence subString(int beginIndex, int endIndex) {
	if (beginIndex < 0) {
	    throw new StringIndexOutOfBoundsException(beginIndex);
	}
	if (endIndex > value.length) {
	    throw new StringIndexOutOfBoundsException(endIndex);
	}
	int sublength = endIndex - beginIndex;
	if (sublength < 0) {
	    throw new StringIndexOutOfBoundsException(sublength);
	}
	return (beginIndex == 0) && (endIndex == value.length) ? this : new NewString(value, beginIndex, sublength);

    }

    @Override
    public int hashCode() {
	int h = 0;
	h = hash;
	if (h == 0 && value.length > 0) {
	    for (int i = 0; i < value.length; i++) {
		h = h + 47 * value[i];
	    }
	}
	return h;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj instanceof NewString) {
	    NewString anotherString = (NewString) obj;
	    int lenght1 = value.length;
	    int lenght2 = anotherString.value.length;
	    if (lenght1 == lenght2) {
		int i = 0;
		char[] val1 = value;
		char[] val2 = anotherString.value;
		while (i < lenght1) {
		    if (val1[i] != val2[i]) {
			return false;
		    }
		    i++;
		}
		return true;
	    }
	}
	return false;
    }

}
