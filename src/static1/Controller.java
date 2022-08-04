package static1;

import static1.UserDto;

public class Controller {
    public static void main(String args[]) {
        UserDto.AddUerReq req = UserDto.AddUerReq.createReq("ddd", "ddd", "ddd");
        String userId = req.getUserId();

        System.out.println("userId = " + userId);

    }

}
