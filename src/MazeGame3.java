public class MazeGame {

	public Maze createMaze(MazeFactory factory) {
		Maze maze = factory.createMaze();
		Room room = factory.createRoom();
		Room room2 = factory.createRoom();
		Door door = factory.createDoor(room, room2);
		maze.addRoom(room);
		maze.addRoom(room2);
		maze.addDoor(door);
		room.setSide(Room.North, factory.makeWall());
		//...
		return maze;
	}
}

public class EnchantedMazeFactory extends MazeFactory {
 	public Room createRoom() {
 		return new EnchantedRoom(n, CastSpell());
 	}
    public Door createDoor() {
    	return new DoorNeedingSpell(r1, r2);
    }
 	protected Spell castSpell() {}
}

//client
	MazeGame game = new MazeGame();
    EnchantedMazeFactory factory = new EnchantedMazeFactory();
    game.CreateMaze(factory);
    BombedMazeFactory factory = new BombedMazeFactory();
    game.CreateMaze(factory);