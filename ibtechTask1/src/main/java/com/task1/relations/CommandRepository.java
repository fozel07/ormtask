package com.task1.relations;

import javax.persistence.TypedQuery;

import com.task1.entities.Command;

public class CommandRepository extends BaseRepository<Command> {

	public CommandRepository() {
		super(Command.class);
		
	}
	
	public Command getCommand(String commandName) {

		TypedQuery<Command> typedQuery = newManager().createQuery("SELECT u FROM Command u WHERE u.commandName=:commandName", Command.class);
	    typedQuery.setParameter("commandName", commandName);
		
		return  typedQuery.getSingleResult();

	}
	

}
