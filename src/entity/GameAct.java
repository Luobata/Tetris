package entity;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class GameAct {

	/**
	 * 方块数组
	 */
	private Point[] actPoints=null;
	
	private static int MIN_X=0;
	private static int MAX_X=9;
	private static int MIN_Y=0;
	private static int MAX_Y=17;
	
	private static List<Point[]> TYPE_CONFIG;
	
	static{
		//TODO 配置文件
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
		//TODO 根据actCode的值刷新方块
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
	 * 方块移动
	 * @param MoveX X轴偏移量
	 * @param MoveY Y轴偏移量
	 * @return 
	 */
	public boolean move(int MoveX,int MoveY,boolean[][] gameMap){
		
		//移动处理
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
	 * 方块旋转
	 * 
	 * 顺时针公式：
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
			//TODO 是否可以旋转
		}
		for(int i = 1; i < actPoints.length; i++){
			int newX=actPoints[0].y+actPoints[0].x-actPoints[i].y;
			int newY=actPoints[0].y-actPoints[0].x+actPoints[i].x;
			actPoints[i].x=newX;
			actPoints[i].y=newY;
		}
	}
	/**
	 * 判断是否超出边界
	 * @param x
	 * @param y
	 * @return
	 */
	
	
	private boolean isoverMap(int x, int y,boolean[][] gameMap){
		return x<MIN_X||x>MAX_X||y<MIN_Y||y>MAX_Y||gameMap[x][y];
	}
}
