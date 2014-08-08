package entity;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class GameAct {

	/**
	 * ��������
	 */
	private Point[] actPoints=null;
	
	private static int MIN_X=0;
	private static int MAX_X=9;
	private static int MIN_Y=0;
	private static int MAX_Y=17;
	
	private static List<Point[]> TYPE_CONFIG;
	
	static{
		//TODO �����ļ�
		TYPE_CONFIG=new ArrayList<Point[]>(7);
		TYPE_CONFIG.add(new Point[]{new Point(4,0),new Point(3,0),new Point(5,0),new Point(6,0)});
		TYPE_CONFIG.add(new Point[]{new Point(4,0),new Point(3,0),new Point(5,0),new Point(4,1)});
		TYPE_CONFIG.add(new Point[]{new Point(4,0),new Point(3,0),new Point(5,0),new Point(3,1)});
		TYPE_CONFIG.add(new Point[]{new Point(4,0),new Point(5,0),new Point(4,1),new Point(3,1)});
		TYPE_CONFIG.add(new Point[]{new Point(4,0),new Point(5,0),new Point(4,1),new Point(5,1)});
		TYPE_CONFIG.add(new Point[]{new Point(4,0),new Point(3,0),new Point(5,0),new Point(5,1)});
		TYPE_CONFIG.add(new Point[]{new Point(4,0),new Point(3,0),new Point(4,1),new Point(5,1)});
	}
	
	public GameAct(){
		this.init(0);
	}
	
	public void init(int actCode){
		//TODO ����actCode��ֵˢ�·���
		Point[] points=TYPE_CONFIG.get(actCode);
		actPoints =new Point[points.length];
		for (int i = 0; i < points.length; i++) {
			actPoints[i]=new Point(points[i].x,points[i].y);
		}
		
	}
	public Point[] getActPoints() {
		return actPoints;
	}
	/**
	 * �����ƶ�
	 * @param MoveX X��ƫ����
	 * @param MoveY Y��ƫ����
	 * @return 
	 */
	public boolean move(int MoveX,int MoveY,boolean[][] gameMap){
		
		//�ƶ�����
		for (int i = 0; i < actPoints.length; i++) {
			int newX =actPoints[i].x+MoveX;
			int newY= actPoints[i].y+MoveY;
			if(isoverMap(newX, newY,gameMap)){
				return false;
			}
		}
		for (int i = 0; i < actPoints.length; i++) {
			actPoints[i].x +=MoveX;
			actPoints[i].y +=MoveY;
		}
		return true;
		
	}
	/**
	 * ������ת
	 * 
	 * ˳ʱ�빫ʽ��
	 * A.x=0.y+0.x-B.y
	 * A.y=0.y-0.x+B.x
	 */
	public void round(boolean[][] gameMap){
		for (int i = 1; i < actPoints.length; i++){
			int newX=actPoints[0].y+actPoints[0].x-actPoints[i].y;
			int newY=actPoints[0].y-actPoints[0].x+actPoints[i].x;
			if(isoverMap(newX,newY,gameMap)){
				return;
			}
			//TODO �Ƿ������ת
		}
		for(int i = 1; i < actPoints.length; i++){
			int newX=actPoints[0].y+actPoints[0].x-actPoints[i].y;
			int newY=actPoints[0].y-actPoints[0].x+actPoints[i].x;
			actPoints[i].x=newX;
			actPoints[i].y=newY;
		}
	}
	/**
	 * �ж��Ƿ񳬳��߽�
	 * @param x
	 * @param y
	 * @return
	 */
	
	
	private boolean isoverMap(int x, int y,boolean[][] gameMap){
		return x<MIN_X||x>MAX_X||y<MIN_Y||y>MAX_Y||gameMap[x][y];
	}
}
