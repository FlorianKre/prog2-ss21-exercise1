public class main {

    public static void main(String[] args){

    }

    private boolean check_length(String Password){
        if (Password.length() > 8 && Password.length() < 25) {
            return true;
        } else
            System.out.println("Wrong password length");
        return false;
    }

    private boolean check_lowercase_uppercase(String Password){
        if(Password.matches("[a-zA-z]")){
                return true;
    } else {
            System.out.println("Password has to contain Upper and lower case");
        }
        return false;
    }

   private boolean check_numbers(String Password) {
        if (Password.matches("(\\d)")) {
                return true;
   } else {
            System.out.println("Password has no digit");
        }
        return false;
    }

    private boolean check_specialCharacters(String Password) {
        if (Password.matches("[()#$?!%/@]")) {
            return true;
        } else {
            System.out.println("Password has no special characters");
        }
        return false;
    }

    //private boolean check_otherspecials(String Password) {


}

