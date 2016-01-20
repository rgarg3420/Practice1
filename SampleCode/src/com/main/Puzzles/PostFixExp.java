package com.main.Puzzles;

import com.main.stack.Stacks;

public class PostFixExp {
	
	

	public static void main(String[] args) {
		Stacks st = new Stacks();
		int a1 = 0;
		int a2 = 0;
		String str = "231*+9-";
		char[] exp = str.toCharArray();
		
		for(Character ob : exp){
			
		
		if(ob=='+'){
			a1 = Integer.parseInt(st.pop().toString());
			a2 = Integer.parseInt(st.pop().toString());
			st.push(a1+a2);
			
		}
		
		else if(ob=='-'){
			a1 = Integer.parseInt(st.pop().toString());
			a2 = Integer.parseInt(st.pop().toString());
			st.push(a2-a1);
			
		}
		else if(ob=='*'){
			a1 = Integer.parseInt(st.pop().toString());
			a2 = Integer.parseInt(st.pop().toString());
			st.push(a2*a1);
			
		}
		else if(ob=='/'){
			a1 = Integer.parseInt(st.pop().toString());
			a2 = Integer.parseInt(st.pop().toString());
			st.push(a2/a1);
			
		}
		else{
		st.push(ob);
		}
		}
		
int result = Integer.parseInt(st.pop().toString());

System.out.println("Result :"+ result);
	}

}
