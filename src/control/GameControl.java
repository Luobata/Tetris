package control;

import service.GameService;
import ui.JPanelGame;

/**
 * 接受玩家键盘事件
 * 控制画面
 * 控制游戏逻辑
 * @author 罗比塔
 *
 */
public class GameControl {
	/**
	 * 游戏界面层
	 */
   private JPanelGame panelGame;
   /**
    * 游戏逻辑层
    */
   private GameService gameService;
	
	public GameControl(JPanelGame panelGame,GameService gameService){
    	this.panelGame=panelGame;
    	this.gameService=gameService;
    }

	public void test() {
		// TODO Auto-generated method stub
		
		this.panelGame.repaint();
	}
/**
 * 控制方向键上
 */
	public void keyup() {
		this.gameService.keyup();
		this.panelGame.repaint();
	}
/**
 * 控制方向键下
 */
	public void keydown() {
		this.gameService.keydown();
		this.panelGame.repaint();
	}
/**
 * 控制方向键左
 */
	public void keyleft() {
		this.gameService.keyleft();
		this.panelGame.repaint();
	}
/**
 * 控制方向键右
 */
	public void keyright() {
		this.gameService.keyright();
		this.panelGame.repaint();
	}
}
