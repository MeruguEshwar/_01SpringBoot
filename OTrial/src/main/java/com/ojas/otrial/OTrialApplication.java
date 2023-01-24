package com.ojas.otrial;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OTrialApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(OTrialApplication.class, args);
		
	}

}
