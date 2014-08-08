package service;

import java.awt.Point;

import dto.GameDto;
import entity.GameAct;

public class GameService {
   
	private GameDto dto;
	
	public GameService(GameDto dto){
	   this.dto=dto;
	   GameAct act =new GameAct();
	   dto.setGameAct(act);
   }

	/**
	 * 控制方向键上
	 */
		public void keyup() {
			this.dto.getGameAct(). round(this.dto.getGameMap());
		}
	/**
	 * 控制方向键下
	 */
		public void keydown() {
			//方块向下移动，并判断是否移动成功
			if(this.dto.getGameAct().move(0, 1,this.dto.getGameMap())){
				return; 
			}
			//获得游戏地图对象
			boolean[][]  map=this.dto.getGameMap();
			//获得方块对象
			Point[]act =this.dto.getGameAct().getActPoints();
			//将方块堆积到地图数组
			for (int i = 0; i < act.length; i++) {
				map[act[i].x][act[i].y]=true;
			}
			//TODO  判断是否可以消行
			//TODO  消行操作
			//TODO  算分操作
			//TODO	判断是否升级
			//TODO	升级
			//刷新一个新的方块
			this.dto.getGameAct().init(0);
		}
	/**
	 * 方块操作(左)
	 */
		public void keyleft() {
			this.dto.getGameAct().move(-1, 0,this.dto.getGameMap());
		}
	/**
	 * 控制方向键右
	 */
		public void keyright() {
			this.dto.getGameAct().move(1, 0,this.dto.getGameMap());
			
		}
	
}
