package core;
	
	/*
	 * This example prints the hardcoded messages between two individuals
	 */
	
	Observable<Event> friendA = new Observable (call(* core.HelloWorld.helloMethod()) && !localhost);
	
	Observable<Event> friendB = new Observable (call(* core.HelloWorld.worldMethod()) && !localhost);
	
	// The printing comes from the test