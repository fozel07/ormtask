package com.task1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Command {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="commandId") 
	private long commandId;
	
	@Column(name="commandName") 
	private String commandName;
	
	@Column(name="commandDescription") 
	private String commandDescription;
	
	@Column(name="className") 
	private String className;
	
	@Column(name="methodName") 
	private String methodName;

	public Command(long commandId, String commandName, String commandDescription, String className, String methodName) {
		this.commandId = commandId;
		this.commandName = commandName;
		this.commandDescription = commandDescription;
		this.className = className;
		this.methodName = methodName;
	}
	public Command() {
		
	}
	
	public long getCommandId() {
		return commandId;
	}

	public void setCommandId(long commandId) {
		this.commandId = commandId;
	}

	public String getCommandName() {
		return commandName;
	}

	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}

	public String getCommandDescription() {
		return commandDescription;
	}

	public void setCommandDescription(String commandDescription) {
		this.commandDescription = commandDescription;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	

	
	
	

	

}
