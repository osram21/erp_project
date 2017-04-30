package kr.or.dgit.erp_project.content;

import javax.swing.JPanel;
import java.awt.GridLayout;
import erp_myframe.Panel.TextFiledPanel;
import kr.or.dgit.erp_project.dto.Title;

public class TitleContent extends JPanel {

	private TextFiledPanel pNo;
	private TextFiledPanel pName;
	public TitleContent() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		pNo = new TextFiledPanel();
		pNo.setTitle("번호");
		add(pNo);
		
		pName = new TextFiledPanel();
		pName.setTitle("이름");
		add(pName);
	}
	
	public Title getObject(){
		String no = pNo.getTfValue();
		String name = pName.getTfValue();
		return new Title(no, name);
	}
	
	public void setObject(Title title){
		pNo.setTFValue(title.getNo());
		pName.setTFValue(title.getName());
	}
	
	public void clear(){
		pNo.setTFValue("");
		pName.setTFValue("");
	}
}
