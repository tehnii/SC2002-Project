package Controller;

import Entity.User;

import java.io.IOException;
import java.util.ArrayList;



//User Controller settles everything for all User. we do not store payment information for customer
public class UserController {
    public static User loginUser(String email,String password){
        ArrayList<User> tempArray = DatabaseController.getAllUser();
        for(int i = 0 ; i < tempArray.size(); i++){
            if (tempArray.get(i).isRegisteredUser(email,password)){
                //found User we shall use him for the rest of the session
                return tempArray.get(i);
                //break;
            }
        }
        //no User found Proceed to return null object.
        return null;
    }
    //Register User method
    public static User registerUser(String name,String email,String password) throws IOException{
        // If user exist returns a null object to View Page (View Page should be able to handle null objects;)
        if(DatabaseController.getUser(email) != null){
            return null;
        }
        //else if no user exist we shall call the call database to insert the user in. Note that we do the creation of user object here.
        return DatabaseController.registerUser(new User(name,email,password,false));

    }

    
}
