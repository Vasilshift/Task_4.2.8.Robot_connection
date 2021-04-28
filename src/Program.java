public class Program {
    public static void main(String[] args) {
        moveRobot( 5, 4);
    }
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
            //int i = 0;
            RobotConnection connect = robotConnectionManager.getConnection();
            for (int i = 0; i < 3; ){
                try {
                    i++;
                    if (i < 3) {
                        connect.moveRobotTo(toX, toY);
                        //i++;
                    }

                    //if (i == 3) {break;}
                    //else {break;}
                    //runned = true;
                    //i = 3;
                    //connect.close();
                } catch (RobotConnectionException e) {
                    //if (runned) {
                    //    i = 3;
                    //}
                    //else {
                    //    i++;
                    if (i == 3) {
                        throw new RobotConnectionException("3", e);
                    }
                } catch (Throwable e) {
                    throw e;
                } finally {
                    try {
                        if (connect != null) {
                            connect.close();
                        }
                    } catch (Exception ignored) {
                    }
                }
            }

    }

}