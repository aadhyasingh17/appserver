
package com.quinnox.bankwebservoce;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces("text/plain")
    public String getIt() {
        return "Hello";
    }
    
//    GET  - get information 
//    POST - creating records 
//    PUT - updating records
//    PATCH - updating partical record
//    DELETE - delete record
    
    
    
    
}
