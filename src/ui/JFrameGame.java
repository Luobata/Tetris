package ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import config.ConfigFactory;
import config.GameConfig;

public class JFrameGame extends JFrame {
     public JFrameGame(JPanelGame panelGame){
    	//�����Ϸ����
 		GameConfig cfg=ConfigFactory.gerGameConfig();
    	 //���ñ���
    	 this.setTitle(cfg.getTitle());
    	//���ùر�
    	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 //���ô�С
    	 this.setSize(cfg.getWidth(),cfg.getHeight());
    	 //������ı��С
    	 this.setResizable(false);
    	 //���þ�������  �Ȼ����ʾ������
    	 Toolkit toolkit = Toolkit.getDefaultToolkit();
    	 Dimension screen=toolkit.getScreenSize();
    	 int x=(screen.width-this.getWidth())/2;
    	 int y=(screen.height-this.getHeight())/2;
    	 this.setLocation(x, y);
    	 //����Ĭ��Panel
    	 this.setContentPane(panelGame);
    	 //Ĭ�ϸô���Ϊ��ʾ
    	 this.setVisible(true);
     }
}
