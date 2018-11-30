/**
 * 
 */
package de.sb.radio.rest;


import static org.junit.Assert.assertEquals;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.junit.Test;

import de.sb.radio.persistence.Document;

/**
 * @author Rachel
 *
 */
public class PostDocumentTest extends ServiceTest {

	@Test
	public void testPostDocument() {
		final WebTarget webTarget = newWebTarget("ines.bergmann@web.de", "ines").path("documents");
		
		//String response = webTarget.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);
//		Document doc = new Document();
//		doc.setContentType("*/*");
//		byte[] data = new byte[] {0,1,2,3,4};
//		doc.setContent(data);
//		
//		Response response = webTarget.request().buildPost(Entity.entity(doc, "application/octet-stream"
//				/*MediaType.WILDCARD*/)).invoke();
//	     
//		assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
//		try {
//			Document myDoc = response.readEntity(Document.class);
//			assertEquals(data, myDoc.getContent());
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("ERROR:" + e.getMessage());
//		}  
	    

	}

}
