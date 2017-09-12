package rcom.idc.usage.bean;

import java.util.Date;
import java.util.List;

import rcom.idc.usage.helper.PlanType;

public class Plan {
	private int id;
	private PlanType type;
	private Date startFrom;
	private Date endOn;
	private int status;
	private Date createdAt;
	private Date updatedAt;
	private String createdBy;
	private String updatedBy;
	
	private Customer customer;
	private List<IPAddress> ipList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PlanType getType() {
		return type;
	}
	public void setType(PlanType type) {
		this.type = type;
	}
	public Date getStartFrom() {
		return startFrom;
	}
	public void setStartFrom(Date startFrom) {
		this.startFrom = startFrom;
	}
	public Date getEndOn() {
		return endOn;
	}
	public void setEndOn(Date endOn) {
		this.endOn = endOn;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<IPAddress> getIpList() {
		return ipList;
	}
	public void setIpList(List<IPAddress> ipList) {
		this.ipList = ipList;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
}
