package ap.immortal.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import ap.immortal.exception.StudentNotFoundException;
import ap.immortal.model.error.StudentErrorResponse;

@ControllerAdvice
public class StudentExceptionHandler {
	
	//ExceptionHandler Method fo NOT FOUND
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException studentException){
		StudentErrorResponse errResp = new StudentErrorResponse();
		errResp.setStatus(HttpStatus.NOT_FOUND.value());
		errResp.setMessage(studentException.getMessage());
		errResp.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(errResp,HttpStatus.NOT_FOUND);
	}
	
	//ExceptionHandler for Generic Exception BAD REQUEST
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleGenricException(Exception exc){
		StudentErrorResponse errResp = new StudentErrorResponse();
		errResp.setStatus(HttpStatus.BAD_REQUEST.value());
		errResp.setMessage(exc.getMessage());
		errResp.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(errResp,HttpStatus.BAD_REQUEST);
	}

}
