package in.ashokit.ExceptionHandle;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ashokit.exceptioninfo.ErrorInfo;
import in.ashokit.user.UserController;

@RestControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handleUserNFE(Exception e) {
		String msg = e.getMessage();
		ErrorInfo info = new ErrorInfo();
		info.setCode("SBIEX001232");
		info.setMsg(msg);
		info.setWhen(LocalDateTime.now());
		return new ResponseEntity<ErrorInfo>(info, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e) {
		String msg = e.getMessage();
		ErrorInfo info = new ErrorInfo();
		info.setCode("SBIEX0012");
		info.setMsg(msg);
		info.setWhen(LocalDateTime.now());
		return new ResponseEntity<ErrorInfo>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
