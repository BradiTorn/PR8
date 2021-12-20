public class PR8 {
    public boolean login(String log) {

        boolean l = false;

        if(log.length() > 3){
            if(log.length() < 20){
                l = true;
            }
        }
        return l;
    }

    public boolean password(String pass) {
        boolean p = false;

        if (pass.length() > 7) {
            if (pass.matches(".*[A-Z].*")) {
                if (pass.matches(".*[a-z].*")) {
                    if (pass.matches(".*\\d.*")) {
                        if (pass.matches(".*[~!.......].*")) {
                            p = true;
                        }
                    }
                }
            }
        }
        return p;
    }

    public boolean vs(String log, String pass) {

        boolean l = false;

        if(log.length() > 3){
            if(log.length() < 20){
                if (pass.length() > 7) {
                    if (pass.matches(".*[A-Z].*")) {
                        if (pass.matches(".*[a-z].*")) {
                            if (pass.matches(".*\\d.*")) {
                                if (pass.matches(".*[~!.......].*")) {
                                    l = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return l;
    }
}
