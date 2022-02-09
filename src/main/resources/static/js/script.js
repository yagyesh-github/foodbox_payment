
const paymentStart= ()=>{
	console.log("payment started...");
	var amount=$("#payment_field").val();
	
	console.log(amount);
	
	
	$.ajax(
			{   
				url:"/cart/create_order",
				data:JSON.stringify({amount:amount,info:"order_request"}),
				contentType:"application/json",
				type:"POST",
				dataType:"json",
				success:function(responseJSON){
					console.log(responseJSON);
					if(responseJSON.status=="created"){
						var options={
								key:"rzp_test_iHqgygnuQ4zqAP",
								amount:amount,
								currency:"INR",
								name:"FoodBox",
								description:"Payment",
								image:"http://localhost:8081/images/logo2.png",
								order_id:responseJSON.id,
								handler:function(responseJSON){
									
									console.log(responseJSON.razorpay_payment_id);
									console.log(responseJSON.razorpay_order_id);
									console.log(responseJSON.razorpay_signature);
									console.log("payment successfull");
			//						alert("payment successfull");
									swal("Good job!", "PAyment Successfull!!!", "success");
									$("#payment_field").attr("disabled",true);	
									$("#submit").attr("disabled",false);
									$("#clear").attr("disabled",true);
//									$("#name").prop("disabled",true);
//									$("#phone").attr("disabled",true);
//									$("#address").attr("disabled",true);
//									$("#pincode").attr("disabled",true);
								},
								 "prefill": {
								        "name": "",
								        "email": "",
								        "contact": ""
								    },
								    "notes": {
								        "address": "FoodBox"
								    },
								    "theme": {
								        "color": "#3399cc"
								    },
						};
						
						var rzp=new Razorpay(options);
						
						rzp.on("payment.failed", function (response){
					        alert(response.error.code);
					        alert(response.error.description);
					        alert(response.error.source);
					        alert(response.error.step);
					        alert(response.error.reason);
					        alert(response.error.metadata.order_id);
					        alert(response.error.metadata.payment_id);
					        alert("ooops payment failed");
					        swal("Failed!", "ooops payment failed!!!", "Fail");
					        
					});
						rzp.open();
					}
				},
				error:function(error){
					console.log(error);
					alert("something went wrong !!");
				}
		})
		
	
};