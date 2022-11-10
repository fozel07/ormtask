package com.task1.cmd;

import java.lang.reflect.*;

import com.task1.entities.Command;
import com.task1.entities.Customer;
import com.task1.relations.CommandRepository;

public class CommandExecuter {
	
	public void execute(String commandName ,Object... args) throws Exception {
		
		CommandRepository commandRepository= new CommandRepository();
		
		Command command=commandRepository.getCommand(commandName);
		
		Class<?> clazz=Class.forName(String.format("com.task1.relations.%s",command.getClassName()));  
		Constructor<?> constructor=clazz.getConstructor();
		Object object=constructor.newInstance();
		
		for (Method method : clazz.getMethods()) {
			
			if(method.getName().equals(command.getMethodName())) {
				if(method.getParameterCount()>0) {
					method.invoke(object, args);
				}
				else {
					method.invoke(object, null);
				}
				
			}
			
			
		}
		
		
	}
	

}
