package employees;

// ABSTRACT CLASS : This class is declared abstract. It's methods are implemented
// in ZooKeeper.
public interface ZooEmployee {
	/*
	ZooEmployee class
	Attributes : name (String)
				 type (String)
				 day (int)
	methods : arrive : prints arrive message
			  leave : prints leaving message
	*/
	
	public abstract void arrive();
	public abstract void leave();
}