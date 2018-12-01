/**
 * 
 */
package de.sb.radio.rest;


import static org.junit.Assert.assertEquals;

import java.util.List;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.Test;

import de.sb.radio.persistence.Person;

/**
 * @author Rachel
 *
 */
public class QueryPeopleTest extends ServiceTest {
	
	@Test
	public void testQueryPeople() {
		final WebTarget webTarget = newWebTarget("ines.bergmann@web.de", "ines").path("people");
		
		Response response = webTarget.queryParam("forename", "Ines")
				.request(MediaType.APPLICATION_JSON_TYPE).get();
		
		assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
		
		Person[] people = response.readEntity(Person[].class);

//		List<Person> people = webTarget.queryParam("forename", "ines")
//				.request(MediaType.APPLICATION_JSON_TYPE).get(new GenericType<List<Person>>() {});
		
		// there should be only one "ines"
		assertEquals(1, people.length);
		
		// forename should be "ines" -> get Person in List at position 0 (we should have only 1)
		assertEquals("Ines", people[0].getForename());
	}
		
}
