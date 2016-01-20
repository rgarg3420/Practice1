package com.main.stack;

public class Stacks {

private Object element[] ;
private static final int limit = 10;
private int size =0;

public Stacks(){
	element = new Object[10] ;
}

public void push(Object ob){
if(size== limit)	{
	size = limit*2 ;
}

element[size] = ob;
size = size+1;
}

public Object pop(){ 
	int count = size;
	Object e = null;
	
if(count<1){
		return 0;
	}
while(element[count]== null){
	count--;
}
e = element[count];
size = count;
element[size] = null;
return e;	
}

public Stacks reverseStack(){
	Stacks reversStk = new Stacks();
	
	for(int i = size-1;i>=0;i--){
		reversStk.push(element[i]);
	}
	
	return reversStk;
}

public int size(){
	return size;
}



public Object peek(){
	Object e = null;
	int count = size;
	if(count<1){
		return 0;
	}
	while(element[count]==null){
		count--;
	}
	e = element[count];
	
	return e;
} 

public void print(){
	String stackPrint = "";
for(Object o : element){
	if(o!=null){
	stackPrint= stackPrint+ o.toString()+",";
}
	}
System.out.println(stackPrint);
}

public Object getIndexValue(int index){
Object ob = new Object();

for(int i = size-1; i>=index;i--){
	ob = element[i];
}


return ob;
	
}

	
public static void main(String s[]){
	
Stacks stk =  new Stacks();
stk.push(1);
stk.push(2);
stk.push(3);
stk.push(4);
stk.push(5);
stk.print();
System.out.println(stk.size());
Object a = stk.getIndexValue(2);
System.out.println("index value: "+a.toString());
Object first = stk.peek();
System.out.println("First element :"+first);
System.out.println(stk.pop());
System.out.println(stk.pop());
stk.print();
System.out.println(stk.size());
Stacks rstks = stk.reverseStack();
rstks.print(); 



	
	
}

	
}
