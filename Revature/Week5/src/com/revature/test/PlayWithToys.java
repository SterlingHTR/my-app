package com.revature.test;

import com.revature.model.ActionFigure;

public class PlayWithToys {
	
	public static void main(String[] args) {
		
		ActionFigure coolGuy = new ActionFigure("speed", "blue", "Barry Allan");
		System.out.println("Our action figure " + coolGuy.getName() + " has " + coolGuy.getEyeColor() + " eyes and " + coolGuy.getSkill() + ".");
		coolGuy.play();
		coolGuy.makeTalk();
		coolGuy.useSkill();
	}
}
