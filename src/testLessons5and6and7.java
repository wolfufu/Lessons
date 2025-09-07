public class testLessons5and6and7 {
    public static void main(String[] args) {


    }

    // можно пользоваться следующими его методами (реализация неизвестна)
    public class Robot {

        public Direction getDirection() {
            // текущее направление взгляда
        }

        public int getX() {
            // текущая координата X
        }

        public int getY() {
            // текущая координата Y
        }

        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
        }

        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
        }

        public void stepForward() {
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
        }
    }


    public static void moveRobot(Robot robot, int toX, int toY) {
        int dx = toX - robot.getX();
        if (dx > 0) {
            turnToDirection(robot, Direction.RIGHT); // на право
            moveSteps(robot, dx);
        } else if (dx < 0) {
            turnToDirection(robot, Direction.LEFT); // на лево
            moveSteps(robot, -dx);
        }

        int dy = toY - robot.getY();
        if (dy > 0) {
            turnToDirection(robot, Direction.UP); // вверх
            moveSteps(robot, dy);
        } else if (dy < 0) {
            turnToDirection(robot, Direction.DOWN); //вниз
            moveSteps(robot, -dy);
        }
    }

    private static void turnToDirection(Robot robot, Direction target) {
        while (robot.getDirection() != target) {
            robot.turnRight(); // robot.turnLeft() - не принципиально
        }
    }

    private static void moveSteps(Robot robot, int steps) {
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
