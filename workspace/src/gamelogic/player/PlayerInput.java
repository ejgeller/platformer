/*
 * 
 */
package gamelogic.player;

import java.awt.event.KeyEvent;

import gameengine.input.KeyboardInputManager;

/**
 * 
 * @author Paul
 *
 */
class PlayerInput {
	/**
	 * 
	 * @return true if the walk-up-key is down
	 */
	public static boolean isJumpKeyDown() {
		
		return KeyboardInputManager.isKeyDown(KeyEvent.VK_SPACE);
	}

	public static boolean isOneKeyDown() {
		return KeyboardInputManager.isKeyDown(KeyEvent.VK_1);
	}
	public static boolean isTwoKeyDown() {
		return KeyboardInputManager.isKeyDown(KeyEvent.VK_2);
	}
	public static boolean isThreeKeyDown() {
		return KeyboardInputManager.isKeyDown(KeyEvent.VK_3);
	}
	
	/**
	 * 
	 * @return true if the walk-left-key is down
	 */
	public static boolean isLeftKeyDown() {
		return KeyboardInputManager.isKeyDown(KeyEvent.VK_A) || KeyboardInputManager.isKeyDown(KeyEvent.VK_LEFT);
	}
	/**
	 * 
	 * @return true if the walk-right-key is down
	 */
	public static boolean isRightKeyDown() {
		return KeyboardInputManager.isKeyDown(KeyEvent.VK_D) || KeyboardInputManager.isKeyDown(KeyEvent.VK_RIGHT);
	}
}
