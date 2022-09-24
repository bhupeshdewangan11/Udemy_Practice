package com.bhupesh.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			ObjectMapper mapper = new ObjectMapper();

			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

			System.out.println("First Name: " + theStudent.getFirstName());
			System.out.println("Last Name: " + theStudent.getLastName());

			// print out address

			Address tempAddress = theStudent.getAddress();

			System.out.println("Street = " + tempAddress.getStreet());
			System.out.println("City = " + tempAddress.getCity());

			// printout the languages
			System.out.print("Languages: ");
			for (String tempLang : theStudent.getLanguages()) {
				System.out.print(tempLang + " ");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
