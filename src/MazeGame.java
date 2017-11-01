public class MazeGame {
	public Maze createMaze() {
		Maze maze = new Maze();
		Room room = new Room();
		Room room2 = new Room();
		Door door = new Door();
		maze.addRoom(room);
		maze.addRoom(room2);
		maze.addDoor(door);
		return maze;
	}
}