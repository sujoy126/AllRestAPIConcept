package routes.api;

/**
 Create user : https://petstore.swagger.io/v2/user 
 To get user  : https://petstore.swagger.io/v2/user/1
 To update user : https://petstore.swagger.io/v2/user/1
 To Delete user  : https://petstore.swagger.io/v2/user/1
 
 
 */

public class EndPoints {
	// User module End points
	public static String userUrl = "https://petstore.swagger.io/v2/user";
	public static String userCreate = userUrl;
	public static String userGet = userUrl+"/{un}";
	public static String userUpdate = userUrl+"/{un}";
	public static String userDelete = userUrl+"/{un}";

}
