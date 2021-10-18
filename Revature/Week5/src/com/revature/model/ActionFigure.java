package com.revature.model;

public class ActionFigure extends Doll{
	
	private String skill;

	public ActionFigure() {
		skill = "dance";
		this.eyeColor = "silver";
		this.name = "Steven";
	}
	
	public ActionFigure(String skill, String eyeColor, String name) {
		this.skill = skill;	
		this.eyeColor = eyeColor;
		this.name = name;
	}
	
	public String getSkill() {
		return this.skill;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public void useSkill() {
		System.out.println("Kachow! You can't overcome my power to " + this.getSkill() + ".");
	}
	
}
