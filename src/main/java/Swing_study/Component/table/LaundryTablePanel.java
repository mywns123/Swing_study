package Swing_study.Component.table;

import javax.swing.SwingConstants;

import Swing_study.panel.Laundry;

@SuppressWarnings("serial")
public class LaundryTablePanel extends AbstractCustomTablePanel<Laundry> {

	@Override
	protected void setAlignAndWidth() {
		// 컬럼내용 정렬
				setTableCellAlign(SwingConstants.CENTER, 0, 1,2,3,4);
				setTableCellAlign(SwingConstants.RIGHT, 5);
				// 컬럼 너비 조정
				setTableCellWidth(80, 100,100,100,100,100);		
	}

	@Override
	public Object[] toArray(Laundry t) {
		return new  Object[] {t.getNo(), t.getName(), t.getLaundry(),t.getLaundryCode(),t.getGrade(),t.getPrice()};
	}

	@Override
	public String[] getColumnNames() {		
		return new String[] { "접수번호", "고객명","세탁물","세탁물코드","고객등급","가격"};
	}

}
