package dto;

import java.util.List;

import entity.GameAct;

public class GameDto {
    /**
     * ���ݿ��¼
     */
	private List<Player> dbRecode;
	/**
	 * ���ؼ�¼
	 */
	private List<Player> diskRecode;
	/**
	 * ���з���
	 */
	private boolean[][] gameMap;
	/**
	 * ���䷽��
	 */
	private GameAct gameAct;
	/**
	 * ��һ������
	 */
	private int next;
	/**
	 * �ȼ�
	 */
	private int nowlevel;
	/**
	 * ����
	 */
	private int nowPoint;
	/**
	 * ����
	 */
	private int nowRemoveLine;

	/**
	 * ���캯��
	 */
	public GameDto(){
		dtoInit();
	}
	/**
	 * dto��ʼ��
	 */
	public void dtoInit(){
		//TODO Ӳ����
		this.gameMap=new boolean[10][18];
		//TODO ��ʼ����Ϸ���ж���
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
