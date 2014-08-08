package control;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerControl extends KeyAdapter{
    private GameControl gameControl;
	
	public PlayerControl(GameControl gameControl){
		this.gameControl=gameControl;
	}
    /**
     * 键盘按下事件
     */
	@Override
	public void keyPressed(KeyEvent e) {
		//TODO 这样的枚举写法不好
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
            this.gameControl.keyup();
			break;
		case KeyEvent.VK_DOWN:
			this.gameControl.keydown();
			break;
		case KeyEvent.VK_LEFT:
			this.gameControl.keyleft();
			break;
		case KeyEvent.VK_RIGHT:
			this.gameControl.keyright();
			break;
		default:
			break;
		}
	}

}
