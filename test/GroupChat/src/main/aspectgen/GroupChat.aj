package co.edu.escuelaing.reactivexd.aspects;
		
import co.edu.escuelaing.reactivexd.groupsimpl.*;
import co.edu.escuelaing.reactivexd.handlercontrol.*;
import core.*;

public aspect GroupChat {
	
	pointcut eventGroupchat(): call(* core.GroupChat.main() );
	
	after(): eventGroupchat(){
		Event event = new NamedEvent("eventGroupchat");
		_EventHandler distribuidor = _EventHandler.getInstance();
		event.setLocalization(distribuidor.getAsyncAddress());
		Map map = new HashMap<String, Object>();
		distribuidor.multicast(event, map);
		
		System.out.println("[Aspectj] After: Recognized an event in ObservableConstructor");
	}
}
