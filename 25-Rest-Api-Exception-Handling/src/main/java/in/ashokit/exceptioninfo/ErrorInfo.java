package in.ashokit.exceptioninfo;

import java.time.LocalDateTime;

import lombok.Data;
@Data
public class ErrorInfo {
	private String code;
	private String msg;
	private LocalDateTime when;

}
