package com.baizhi.cmfz.controller;

import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
@Controller
public class KaptchaContorller {
	@Autowired
	private Producer producer;
	

	@RequestMapping("/getKaptcha")
	public void getKaptcha(HttpSession session,HttpServletResponse response) throws IOException{
		
		String text=producer.createText();
		
		session.setAttribute("code", text);
		
		BufferedImage createImage = producer.createImage(text);
		
		ImageIO.write(createImage, "jpg", response.getOutputStream());
	}
}
