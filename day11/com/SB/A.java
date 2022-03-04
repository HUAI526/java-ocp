package com.SB;

import com.SA.school;
//class A extends com.SA.school
public class A extends school
{
	private int chi;
	public A(String name, int chi)
	{
		super(name);
		this.chi=chi;
	}

	public String show()
	{
		return super.show()+"\t國文"+chi;
	}
}