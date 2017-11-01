public class MazeGame {

	public Maze createEnchantedMaze() {
		Maze maze = new Maze();
		Room room = new EnchantedRoom();
		Room room2 = new EnchantedRoom();
		Door door = new DoorNeedingSpell();
		maze.addRoom(room);
		maze.addRoom(room2);
		maze.addDoor(door);
		return maze;
	}

	public Maze createBombMaze() {
		Maze maze = new BombMaze();
		Room room = new RoomWithABomb();
		Room room2 = new RoomWithABomb();
		Door door = new Door();
		maze.addRoom(room);
		maze.addRoom(room2);
		maze.addDoor(door);
		return maze;
	}	
}