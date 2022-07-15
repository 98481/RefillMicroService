package com.cts.refill.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

/** Interface to connect with authentication service */
@FeignClient(url = "http://subscriptionmicroservice.ap-south-1.elasticbeanstalk.com/subscriptionapi", name = "Subscription-Details")
public interface SubscriptionClient {

	/**
	 * @param sId
	 * @param token
	 * @return
	 */
	@GetMapping("/getDrugName/{memberID}")
	public String getDrugNameBySubscriptionId(@RequestHeader("Authorization") String token,@PathVariable("memberID") long memberID);

}
