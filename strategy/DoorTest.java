package behavioural.strategy;

public class DoorTest {
	public static void main(String[] args) {
		Door door1;
		Door door2;
		door1 = new ClosetDoor();

		door2 = new SlidingDoor();
		
		door1.setOpenBehavior(new Standard());
		door1.setLockBehavior(new NonLocking());

		door1.performOpen();
		door1.performClose();

		door1.performLock();
		door1.performUnlock();

		door2.setLockBehavior(new Password());
		door2.performLock();
		door2.performUnlock();

	}

}
