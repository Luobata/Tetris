package ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import config.ConfigFactory;
import config.GameConfig;

public class JFrameGame extends JFrame {
     public JFrameGame(JPanelGame panelGame){
    	//获得游戏配置
 		GameConfig cfg=ConfigFactory.gerGameConfig();
    	 //设置标题
    	 this.setTitle(cfg.getTitle());
    	//设置关闭
    	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 //设置大小
    	 this.setSize(cfg.getWidth(),cfg.getHeight());
    	 //不允许改变大小
    	 this.setResizable(false);
    	 //设置居中属性  先获得显示器参数
    	 Toolkit toolkit = Toolkit.getDefaultToolkit();
    	 Dimension screen=toolkit.getScreenSize();
    	 int x=(screen.width-this.getWidth())/2;
    	 int y=(screen.height-this.getHeight())/2;
    	 this.setLocation(x, y);
    	 //设置默认Panel
    	 this.setContentPane(panelGame);
    	 //默认该窗口为显示
    	 this.setVisible(true);
     }
}
