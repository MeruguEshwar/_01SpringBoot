package com.ojas.otrial;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OTrialApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(OTrialApplication.class, args);

		int x = 8, i;
		String str = "4l6l",add="";
		String s = "";
		for (i = 0; i <= 10; i++) {
			if (i == 0) {
				add = str + i;
				//System.out.print(add);
				continue;
			}

			int res = (x * i);
			s += res;

			if (i==9) {
				String fin = add+"845";
				System.out.print(fin);
				continue;
			}
		}
		System.out.print(s);
	}
}
