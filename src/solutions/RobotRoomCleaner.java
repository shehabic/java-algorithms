package solutions;

import java.util.HashSet;
import java.util.Set;

public class RobotRoomCleaner {

    interface Robot {
        boolean move();
        void turnLeft();
        void turnRight();
        void clean();
    }

    public void cleanRoom(Robot robot) {
        dfs(robot, 0, 0, 0, new HashSet<>());
    }

    private void dfs(Robot robot, int i, int j, int dir, Set<String> visited) {
        // cell identifier
        String pos = i + "_" + j;
        if (visited.contains(pos)) return;
        robot.clean();
        visited.add(pos);
        for (int n = 0; n < 4; n++) { // move in all directions
            if (robot.move()) {
                int row = i, col = j;
                switch (dir) {
                    case 0:
                        row = i - 1;
                        break;
                    case 90:
                        col = j + 1;
                        break;
                    case 180:
                        row = i + 1;
                        break;
                    case 270:
                        col = j - 1;
                        break;
                }
                // visit next branch
                dfs(robot, row, col, dir, visited);
                // return to initial position
                robot.turnLeft();
                robot.turnLeft();
                robot.move();
                robot.turnRight();
                robot.turnRight();
            }
            // rotate 90 degrees to visit that branch
            robot.turnRight();
            dir += 90;
            dir = dir % 360;
        }
    }
}
