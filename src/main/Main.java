package main;

import control.GameControl;
import control.PlayerControl;
import service.GameService;
import ui.JFrameGame;
import ui.JPanelGame;
import dto.GameDto;

public class Main {
public static void main(String[] args) {
	//������Ϸ����Դ
	GameDto dto=new GameDto();
	//������Ϸ�߼���(������Ϸ����Դ)
	GameService service=new GameService(dto);
	//������Ϸ���
	JPanelGame panel=new JPanelGame(dto);
	//������Ϸ������(������Ϸ�������Ϸ�߼���)
	GameControl gameControl=new GameControl(panel, service);
	//������ҿ�����(������Ϸ������)
	PlayerControl control=new PlayerControl(gameControl);
	//��װ��ҿ�����
	panel.setGameControl(control);
	//������Ϸ����(��װ��Ϸ���)
	JFrameGame jframe=new JFrameGame(panel);
}
}