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
	 * ���Ʒ������
	 */
		public void keyup() {
			this.dto.getGameAct(). round(this.dto.getGameMap());
		}
	/**
	 * ���Ʒ������
	 */
		public void keydown() {
			//���������ƶ������ж��Ƿ��ƶ��ɹ�
			if(this.dto.getGameAct().move(0, 1,this.dto.getGameMap())){
				return; 
			}
			//�����Ϸ��ͼ����
			boolean[][]  map=this.dto.getGameMap();
			//��÷������
			Point[]act =this.dto.getGameAct().getActPoints();
			//������ѻ�����ͼ����
			for (int i = 0; i < act.length; i++) {
				map[act[i].x][act[i].y]=true;
			}
			//TODO  �ж��Ƿ��������
			//TODO  ���в���
			//TODO  ��ֲ���
			//TODO	�ж��Ƿ�����
			//TODO	����
			//ˢ��һ���µķ���
			this.dto.getGameAct().init(0);
		}
	/**
	 * �������(��)
	 */
		public void keyleft() {
			this.dto.getGameAct().move(-1, 0,this.dto.getGameMap());
		}
	/**
	 * ���Ʒ������
	 */
		public void keyright() {
			this.dto.getGameAct().move(1, 0,this.dto.getGameMap());
			
		}
	
}
