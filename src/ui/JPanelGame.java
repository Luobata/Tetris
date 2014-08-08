package ui;

import java.awt.Graphics;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import config.ConfigFactory;
import config.GameConfig;
import config.LayerConfig;
import control.PlayerControl;
import dto.GameDto;

public class JPanelGame extends JPanel{
    
	private List<Layer> layers=null;
	
	private GameDto dto=null;
	public JPanelGame(GameDto dto){
		//���dto����
		this.dto=dto;
		//��ʼ�����
		initComponent();
		//��ʼ����
		initLayer();
       
    }
	/**
	 * ��װ��ҿ�����
	 * @param control
	 */
	public void setGameControl(PlayerControl control){
		this.addKeyListener(control);
	}
	
	/**
	 * ��ʼ�����
	 */
	private void initComponent(){
		
	}
    /**
     * ���ʼ��
     */
	
	private void initLayer(){
		try {
        	//�����Ϸ����
    		GameConfig cfg=ConfigFactory.gerGameConfig();
    		//��ò�����
    		List<LayerConfig> layersCfg=cfg.getLayersConfig();
    		//������Ϸ������
            layers =new ArrayList<Layer>(layersCfg.size());
            //ѭ���������Բ����
            for (LayerConfig layerCfg:layersCfg) {
        	    //��������
            	Class<?> cls=Class.forName(layerCfg.getClassName());
            	//��ù��캯��
            	Constructor<?> ctr=cls.getConstructor(int.class,int.class,int.class,int.class);
            	//���ù��캯����������
            	Layer layer=(Layer)ctr.newInstance(
            			layerCfg.getX(),layerCfg.getY(),layerCfg.getW(),layerCfg.getH()
            			);
            	//������Ϸ����
            	layer.setDto(this.dto);
            	//�Ѵ�����layer�������list
            	layers.add(layer);
    	}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
    @Override
    public void paintComponent(Graphics g){
        //���û��෽��
    	super.paintComponent(g);
    	//ѭ��ˢ����Ϸ����
    	for (int i = 0; i < layers.size(); i++) {
    		layers.get(i).paint(g);
    		
    	//���ؽ���
    	this.requestFocus();
	}
     
    }
}