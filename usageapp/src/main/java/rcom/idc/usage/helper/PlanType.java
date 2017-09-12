package rcom.idc.usage.helper;

public enum PlanType {
	STANDARD('S'),FIXED('F'),MRTG('M'),PERCENTILE('P');
		
	private final char planCode;
	PlanType(char val){
		this.planCode=val;
	}
	public char getPlanType() {
		return this.planCode;
	}
	
}
