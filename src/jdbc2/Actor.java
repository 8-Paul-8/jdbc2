/*
    This Class fetches all the actors in actor object nature and lists all
    their details form sakila database.
    We give for avery row values to the instance variables and then we 
    we store these values to an arraylist. 
 */
package jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author <8-Paul-8>
 */
public class Actor {
    private long actorId;
    private String firstName;
    private String lastName;
    private LocalDate LocalDateUpdate;

    public Actor() {
    }

    public Actor(long actorId, String firstName, String lastName, LocalDate LocalDateUpdate) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.LocalDateUpdate = LocalDateUpdate;
    }

    public long getActorId() {
        return actorId;
    }

    public void setActorId(long actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getLocalDateUpdate() {
        return LocalDateUpdate;
    }

    public void setLocalDateUpdate(LocalDate LocalDateUpdate) {
        this.LocalDateUpdate = LocalDateUpdate;
    }

    @Override
    public String toString() {
        return "Actor{" + "actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + ", LocalDateUpdate=" + LocalDateUpdate + '}';
    }
    
    public List<Actor> fetchAllActors() throws SQLException{
        List<Actor> list = new ArrayList();
        Connection conn= MySQLConnection.connect();
        String sql= "select actor_id, first_name, last_name, last_update from actor";
        
        PreparedStatement pstmt= conn.prepareStatement(sql);
        ResultSet rs= pstmt.executeQuery();
        while (rs.next()){
            Actor actor= new Actor();
            actor.actorId= rs.getLong(1);
            actor.firstName= rs.getString(2);
            actor.lastName= rs.getString(3);
            actor.LocalDateUpdate=rs.getObject(4,LocalDate.class);
            list.add(actor);
        }
        return list;
    }
    
    
    
    
    
    
}
