package com.techmah.certificacion.Booking.interactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WriteLetter implements Interaction {
	private String letter;

	public WriteLetter(String letter) {
		this.letter = letter;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		try {
			Robot robot = new Robot();
			switch (letter) {
			case "A":
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "B":
				robot.keyPress(KeyEvent.VK_B);
				robot.keyRelease(KeyEvent.VK_B);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "C":
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_C);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "D":
				robot.keyPress(KeyEvent.VK_D);
				robot.keyRelease(KeyEvent.VK_D);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "E":
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "F":
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_F);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "G":
				robot.keyPress(KeyEvent.VK_G);
				robot.keyRelease(KeyEvent.VK_G);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "H":
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "I":
				robot.keyPress(KeyEvent.VK_I);
				robot.keyRelease(KeyEvent.VK_I);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "J":
				robot.keyPress(KeyEvent.VK_J);
				robot.keyRelease(KeyEvent.VK_J);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "K":
				robot.keyPress(KeyEvent.VK_K);
				robot.keyRelease(KeyEvent.VK_K);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "L":
				robot.keyPress(KeyEvent.VK_L);
				robot.keyRelease(KeyEvent.VK_L);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "M":
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_M);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "N":
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_N);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "O":
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "P":
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_P);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "Q":
				robot.keyPress(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_Q);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "R":
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "S":
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "T":
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "U":
				robot.keyPress(KeyEvent.VK_U);
				robot.keyRelease(KeyEvent.VK_U);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "V":
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "W":
				robot.keyPress(KeyEvent.VK_W);
				robot.keyRelease(KeyEvent.VK_W);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "X":
				robot.keyPress(KeyEvent.VK_X);
				robot.keyRelease(KeyEvent.VK_X);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "Y":
				robot.keyPress(KeyEvent.VK_Y);
				robot.keyRelease(KeyEvent.VK_Y);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "Z":
				robot.keyPress(KeyEvent.VK_Z);
				robot.keyRelease(KeyEvent.VK_Z);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case " ":
				robot.keyPress(KeyEvent.VK_SPACE);
				robot.keyRelease(KeyEvent.VK_SPACE);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "1":
				robot.keyPress(KeyEvent.VK_NUMPAD1);
				robot.keyRelease(KeyEvent.VK_NUMPAD1);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "2":
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "3":
				robot.keyPress(KeyEvent.VK_NUMPAD3);
				robot.keyRelease(KeyEvent.VK_NUMPAD3);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "4":
				robot.keyPress(KeyEvent.VK_NUMPAD4);
				robot.keyRelease(KeyEvent.VK_NUMPAD4);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "5":
				robot.keyPress(KeyEvent.VK_NUMPAD5);
				robot.keyRelease(KeyEvent.VK_NUMPAD5);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "6":
				robot.keyPress(KeyEvent.VK_NUMPAD6);
				robot.keyRelease(KeyEvent.VK_NUMPAD6);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "7":
				robot.keyPress(KeyEvent.VK_NUMPAD7);
				robot.keyRelease(KeyEvent.VK_NUMPAD8);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;

			case "9":
				robot.keyPress(KeyEvent.VK_NUMPAD9);
				robot.keyRelease(KeyEvent.VK_NUMPAD9);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "0":
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case ":":
				robot.keyPress(KeyEvent.VK_DEAD_DOUBLEACUTE);
				robot.keyRelease(KeyEvent.VK_DEAD_DOUBLEACUTE);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "Tab":
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "Enter":
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			case "Down":
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				actor.attemptsTo(WaitToLoad.theMiliSeconds(100));
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}

		} catch (AWTException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static WriteLetter theLetter(String letter) {
		return Tasks.instrumented(WriteLetter.class, letter);
	}
}
