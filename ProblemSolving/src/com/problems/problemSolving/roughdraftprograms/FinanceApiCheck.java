package com.problems.problemSolving.roughdraftprograms;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FinanceApiCheck {
	public static void main(String a[]) throws IOException, InterruptedException {

		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://apidojo-yahoo-finance-v1.p.rapidapi.com/market/get-charts?symbol=AAPL&interval=5m&range=1d&region=US&comparisons=%5EGDAXI%2C%5EFCHI"))
				.header("x-rapidapi-key", "a21e8fa4c8msh4a5f30efcc1ea78p1b215djsnec0f969702f4")
				.header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	
}
}

//https://rapidapi.com/apidojo/api/yahoo-finance1 unoffical apis site
//https://rapidapi.com/developer/dashboard  dashbord for no. of requests
//https://rapidapi.com/blog/how-to-use-the-yahoo-finance-api/
//https://rapidapi.com/apidojo/api/yahoo-finance1?endpoint=5c1b0669e4b09c6b17cfb448