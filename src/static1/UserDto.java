package static1;

public class UserDto {

    public static class AddUerReq {

        private String userId;

        private String userPasswd;

        private String ageCategoryCd;

        protected AddUerReq() {
        }

        public AddUerReq(String userId, String userPasswd, String ageCategoryCd) {
            this.userId = userId;
            this.userPasswd = userPasswd;
            this.ageCategoryCd = ageCategoryCd;
        }

        //생성자 메서드
        public static AddUerReq createReq(String userId, String userPasswd, String ageCategoryCd) {
            AddUerReq req = new AddUerReq(userId,userPasswd, ageCategoryCd);
            return req;
        }

        public String getUserId() {
            return userId;
        }

        public String getUserPasswd() {
            return userPasswd;
        }

        public String getAgeCategoryCd() {
            return ageCategoryCd;
        }
    }


}
