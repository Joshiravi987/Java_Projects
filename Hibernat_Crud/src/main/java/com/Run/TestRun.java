package com.Run;

import com.dao.DataDao;
import com.model.User;

public class TestRun {
	public static void main(String[] args) {
		User u = new User();
		u.setId(3); // id of the user to be updated
		u.setUsername("Devupdated");
		u.setPassword("Devi@123updated");
		u.setEmail("D@gmail.comupdated");

		DataDao d = new DataDao();
		// d.InsertData(u);
		// d.UpdateData(u); // call the update method

		// d.DeleteData(u); // call the delete method

		// System.out.println("Data Deleted Successfully");

		// u=d.FetchData(1); // fetch data for user with id 1

		// System.out.println(u.getUsername()+" "+u.getPassword()+" "+u.getEmail()+"
		// "+u.getId());

		// fetch all data

		// diffrent metod for fetching all data

		d.FetchAllData().forEach(us -> {
			System.out.println(us.getUsername() + " " + us.getPassword() + " " + us.getEmail() + " " + us.getId());
		});
		System.out.println("Data Fetched Successfully");
		System.out.println("----------------------------------------------------------------------------------------------------------");

		for (User us : d.FetchAllData()) {
			System.out.println(us.getUsername() + " " + us.getPassword() + " " + us.getEmail() + " " + us.getId());
			
		}

	}

}
