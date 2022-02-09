package com.general.stores.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {
	
	@GetMapping("/order/payment")
//	@ResponseBody
	public String paymentPage( ) {
//		System.out.println("order sent");
//	
//		int amt=Integer.parseInt(data.get("amount").toString());
//	
//		RazorpayClient client = null;
//		try {
//			client = new RazorpayClient("rzp_test_iHqgygnuQ4zqAP","Dp7V7YcCt5OwXE41qGtsBXVE");
//		} catch (RazorpayException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		JSONObject ob=new JSONObject();
//		ob.put("amount",amt*100);
//		ob.put("currency", "INR");
//		ob.put("receipt","txn_235425");
//
//		com.razorpay.Order order = null;
//		try {
//			order = client.Orders.create(ob);
//		} catch (RazorpayException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(order);
		return "payment";
	}

}
