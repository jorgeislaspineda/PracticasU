/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpractica4;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aula 209
 */
public class DbConnection {
     String User = "root";
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/matricula";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, User, "jp780213");
}
