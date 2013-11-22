package cn.yicha.tupo.p2sp.entity;

import java.util.Comparator;

public class RangeComparator implements Comparator<RangeInfo> {
	@Override
	public int compare(RangeInfo o1, RangeInfo o2) {
		int range1 = o1.getEnd() - o1.getStart();
		int range2 = o2.getEnd() - o2.getStart();
		return range1 - range2;
	}
}
