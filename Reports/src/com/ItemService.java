package com;

import model.Item;
//For REST Service
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
//For JSON 

@Path("/Items")
public class ItemService {
	Item itemObj = new Item();

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML)
	public String readItems() {
		return itemObj.readItems();
	}

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String insertItem(@FormParam("itemCode") String itemCode, @FormParam("itemName") String itemName,
			@FormParam("itemPrice") String itemPrice, @FormParam("itemDesc") String itemDesc) {
		String output = itemObj.insertItem(itemCode, itemName, itemPrice, itemDesc);
		return output;
	}

}
