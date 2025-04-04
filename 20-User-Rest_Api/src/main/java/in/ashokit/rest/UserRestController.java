package in.ashokit.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.User;
import jakarta.websocket.server.PathParam;

@RestController
public class UserRestController {
	private Map<Integer, User> datamap = new HashMap<>();

	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		System.out.println(user);
		datamap.put(user.getId(), user);
		return new ResponseEntity<String>("User Saved", HttpStatus.CREATED);

	}
   // Path Parameters

	@GetMapping("/user/{id}/data")
	public User getUser(@PathVariable("id") Integer userId) {
		User user = datamap.get(userId);
		return user;
	}
	/*Query Parameters

	 * @GetMapping("/user") public User getUser(@RequestParam("userid") Integer
	 * userId) { User user = datamap.get(userId); return user; }
	 */

}
