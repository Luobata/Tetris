package control;

import service.GameService;
import ui.JPanelGame;

/**
 * ������Ҽ����¼�
 * ���ƻ���
 * ������Ϸ�߼�
 * @author �ޱ���
 *
 */
public class GameControl {
	/**
	 * ��Ϸ�����
	 */
   private JPanelGame panelGame;
   /**
    * ��Ϸ�߼���
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
 * ���Ʒ������
 */
	public void keyup() {
		this.gameService.keyup();
		this.panelGame.repaint();
	}
/**
 * ���Ʒ������
 */
	public void keydown() {
		this.gameService.keydown();
		this.panelGame.repaint();
	}
/**
 * ���Ʒ������
 */
	public void keyleft() {
		this.gameService.keyleft();
		this.panelGame.repaint();
	}
/**
 * ���Ʒ������
 */
	public void keyright() {
		this.gameService.keyright();
		this.panelGame.repaint();
	}
}
