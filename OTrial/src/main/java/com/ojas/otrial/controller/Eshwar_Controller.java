package com.ojas.otrial.controller;

import java.awt.print.Pageable;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Eshwar_Controller {

//	@GetMapping("/encode/{date}")
//	public Map<String, String> dispaly(@PathVariable int date) {
//		Map<String, String> map = new HashMap<String, String>();
//
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMddyyyy");
//		LocalDateTime now = LocalDateTime.now();
//
//		String example1 = dtf.format(now);
//		StringBuilder sb = new StringBuilder(example1);
//		sb.insert(4, date);
//
//		map.put("output", sb.toString());
//
//		System.out.println(sb);
//		return map;
//	}

	@GetMapping("/encode/{num}")
	public Map<String, String> Encode(@PathVariable String num) {
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyyyy");
		Date date = new Date();String strDate = formatter.format(date);
		String s1 = strDate.substring(0, 4);
		String s2 = strDate.substring(4, 8);
		String append = strDate.join(num, s1, s2);
		Map<String, String> map = new HashMap<String, String>();
		map.put("result", append);return map;
	}

	@GetMapping("/decode/{num}")
	public Map<String, String> dispaly(@PathVariable String num) {
		String original = num.substring(4, num.length() - 4);
		Map<String, String> map = new HashMap<String, String>();
		map.put("result", original);

		return map;
	}

}
