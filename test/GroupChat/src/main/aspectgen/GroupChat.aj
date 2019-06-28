package co.edu.icesi.eketal.aspects;
		
import co.edu.icesi.eketal.groupsimpl.*;
import co.edu.icesi.eketal.handlercontrol.*;
import core.*;

public aspect GroupChat {
	
	pointcut eventGroupchat(): call(* core.GroupChat.main() );
	
	after(): consult(){
		Event event = new NamedEvent("consult");
		_EventHandler distribuidor = _EventHandler.getInstance();
		event.setLocalization(distribuidor.getAsyncAddress());
		Map map = new HashMap<String, Object>();
		distribuidor.multicast(event, map);
		
		System.out.println("[Aspectj] After: Recognized an event in ObservableConstructor");
	}
}
