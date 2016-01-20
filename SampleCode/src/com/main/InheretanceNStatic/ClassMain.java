package com.main.InheretanceNStatic;

public class ClassMain {

	public static void main(String[] args) {
		
		
		
		ClassGrand grand = new ClassParent();
		String str = grand.printG("Grand");
		System.out.println(grand.a);
		System.out.println("grand:"+str);
		
		ClassParent parent = new ClassParent();
		ClassParent parentSecond = new ClassParent();
		
		System.out.println(parent.a);
		String str1 = parent.printP("parent");
		String str2 =parent.printG("Grand");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("==========================================");
		ClassGrand grand1 = new ClassChild();
		//ClassChild child11 = new ClassGrand(); not possible;
		
		System.out.println(grand1.toString());
		System.out.println(grand1.a); // variable of super class
		String str3 = grand1.printG("child");// method of sub class.
		System.out.println(str3);	
		System.out.println("==========================================");
		parent.incVal();
		parent.incVal();
		parent.incVal();                            // normal variable are seperate for each instance of the class.
		parentSecond.incVal();parentSecond.incVal();// static variable are same for all instances.
		System.out.println("==========================================");
		ClassParent.incStaVal();
		ClassParent.incStaVal();
		ClassParent.incStaVal();
		ClassParent.incStaVal();
        System.out.println("=================**=========**================");
        ClassChild child = new ClassChild();
        int val1 = child.staInt;
        int val2 = child.nInt;
        System.out.println("Value 1: "+ val1);
        System.out.println("Value 2: "+ val2);
        child.incStaVal();
        child.incVal();
        System.out.println("==========##=======**====##====**=======##=========");
             ClassParent childParent = new ClassChild();
             ClassParent childParent1 = new ClassChild();
             int val11 = childParent.staInt;
             int val22 = childParent.nInt;
             System.out.println("Value :"+ val11);
             System.out.println("Value :"+ val22);
             childParent.incStaVal();
             childParent1.incStaVal();
             childParent.incVal();
             childParent1.incVal();
             System.out.println("==========##$$$=======**====##$$$====**=======##$$$=========");
             System.out.println("========static inner class=======");
             ClassChild.subChildStatic stInClass = new ClassChild.subChildStatic();  // calling static inner class.
             stInClass.printdata();
             System.out.println("========inner class=======");
             ClassChild.subChild innClass = child.new subChild();
             innClass.printdata();
             System.out.println("========method inner class=======");  
             
             OuterClass.createInner();
             
             OuterClass oc = new OuterClass();
             oc.createAnotherInner();
             System.out.println("========annonymous class inner class=======");  
             AnnonymousClass ac = new AnnonymousClass();
             ac.interfaceOne.print();
             System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
             InterfaceClass icl1 = new InterfaceClass();
             icl1.print();
             icl1.increment();
             icl1.increment();
             
             InterfaceClass icl2 = new InterfaceClass();
             icl2.print();
             icl2.increment();
             icl2.increment();
             
             
	}

}
