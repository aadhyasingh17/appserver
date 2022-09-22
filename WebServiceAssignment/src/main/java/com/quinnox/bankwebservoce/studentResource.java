package com.quinnox.bankwebservoce;

import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;

@Path("/student")
public class studentResource
{
		studentrepository repository = new studentrepository();
		
		@GET
		@Path("details")
		@Produces(MediaType.APPLICATION_JSON) // @Proudes takes an array of parameters
		public List<student> getAllStudentDetail() throws Exception
		{
			return repository.getAllStudentDetails();
		}
		
     	@POST
		@Path("/insert")
		//@Consumes(MediaType.APPLICATION_XML)  // It will only accept XML input from user.
		@Consumes(MediaType.APPLICATION_JSON) // For both XML & JSON input.
		public student insertstudentDetail(student hb) throws Exception
		{
			repository.insertAccountDetail(hb);
			return 	hb;
		
		}
     	@GET
    	@Path("details/{student_ID}")
    	@Produces(MediaType.APPLICATION_JSON)
    	public List<student> getstudentbasedonid(@PathParam("student_ID")int ID) throws Exception
    	{													//PathParam are path parameters or variable parts of URL path
    		return repository.getStudentdetailID(ID);
    		
    	}
    	@PUT
    	@Path("update/{student_ID}")
    	@Consumes(MediaType.APPLICATION_JSON)
    	public List<student> updateid(@PathParam("student_ID")int id, student hb) throws Exception
    	{	
    		List<student> bothData = new ArrayList<student>();
    		bothData.addAll(repository.getStudentdetailID(id));
    		repository.updateID(id, hb);
    		bothData.addAll(repository.getStudentdetailID(id));

    		return bothData ;
    	}
    	@DELETE
    	@Path("delete/{student_ID}")
    	@Produces(MediaType.APPLICATION_JSON)
    	public String updateAccountName(@PathParam("student_ID")int ID) throws Exception
    	{
    		repository.deleteID(ID);
    		return "ID = "+ID+" is deleted.";
    	}
		

		
		
		

}
