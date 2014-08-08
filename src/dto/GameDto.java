package dto;

import java.util.List;

import entity.GameAct;

public class GameDto {
    /**
     * 数据库记录
     */
	private List<Player> dbRecode;
	/**
	 * 本地记录
	 */
	private List<Player> diskRecode;
	/**
	 * 已有方块
	 */
	private boolean[][] gameMap;
	/**
	 * 下落方块
	 */
	private GameAct gameAct;
	/**
	 * 下一个方块
	 */
	private int next;
	/**
	 * 等级
	 */
	private int nowlevel;
	/**
	 * 分数
	 */
	private int nowPoint;
	/**
	 * 消行
	 */
	private int nowRemoveLine;

	/**
	 * 构造函数
	 */
	public GameDto(){
		dtoInit();
	}
	/**
	 * dto初始化
	 */
	public void dtoInit(){
		//TODO 硬编码
		this.gameMap=new boolean[10][18];
		//TODO 初始化游戏所有对象
	}
	public List<Player> getDbRecode() {
		return dbRecode;
	}

	public void setDbRecode(List<Player> dbRecode) {
		this.dbRecode = dbRecode;
	}

	public List<Player> getDiskRecode() {
		return diskRecode;
	}

	public void setDiskRecode(List<Player> diskRecode) {
		this.diskRecode = diskRecode;
	}

	public boolean[][] getGameMap() {
		return gameMap;
	}

	public void setGameMap(boolean[][] gameMap) {
		this.gameMap = gameMap;
	}

	public GameAct getGameAct() {
		return gameAct;
	}

	public void setGameAct(GameAct gameAct) {
		this.gameAct = gameAct;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public int getLevel() {
		return nowlevel;
	}

	public void setLevel(int nowlevel) {
		this.nowlevel = nowlevel;
	}

	public int getNowPoint() {
		return nowPoint;
	}

	public void setNowPoint(int nowPoint) {
		this.nowPoint = nowPoint;
	}

	public int getNowRemoveLine() {
		return nowRemoveLine;
	}

	public void setNowRemoveLine(int nowRemoveLine) {
		this.nowRemoveLine = nowRemoveLine;
	}
}
