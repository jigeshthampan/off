package rcom.idc.usage.bean;

public class DTPlan extends Plan{
	private double quoata;
	private String primarySwitchIP;
	private String secondarySwitchIP;
	public double getQuoata() {
		return quoata;
	}
	public void setQuoata(double quoata) {
		this.quoata = quoata;
	}
	public String getPrimarySwitchIP() {
		return primarySwitchIP;
	}
	public void setPrimarySwitchIP(String primarySwitchIP) {
		this.primarySwitchIP = primarySwitchIP;
	}
	public String getSecondarySwitchIP() {
		return secondarySwitchIP;
	}
	public void setSecondarySwitchIP(String secondarySwitchIP) {
		this.secondarySwitchIP = secondarySwitchIP;
	}
	
	
}
