package com.zain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by qhasan on 8/25/2016.
 */
@SpringBootApplication
public class Application {

    private static Logger LOG = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {

        LOG.info("###Starting application");
//        todo:uncomment when working with hibernate
       ApplicationContext ac = SpringApplication.run(Application.class, args);

//        //   ## DEFINE VARIABLES SECTION ##
//        // define the driver to use
//        String driver = "org.apache.derby.jdbc.EmbeddedDriver";
//        // the database name
//        String dbName="jdbcDemoDB";
//        // define the Derby connection URL to use
//        String connectionURL = "jdbc:derby:" + dbName + ";create=true";
//
//        Connection conn = null;
//        Statement s;
//        PreparedStatement psInsert;
//        ResultSet myWishes;
//        String printLine = "  __________________________________________________";
//        String createString = "CREATE TABLE WISH_LIST  "
//                +  "(WISH_ID INT NOT NULL GENERATED ALWAYS AS IDENTITY "
//                +  "   CONSTRAINT WISH_PK PRIMARY KEY, "
//                +  " ENTRY_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP, "
//                +  " WISH_ITEM VARCHAR(32) NOT NULL) " ;
//        String answer;
//
//        //  JDBC code sections
//        //  Beginning of Primary DB access section
//        //   ## BOOT DATABASE SECTION ##
//        try {
//            // Create (if needed) and connect to the database.
//            // The driver is loaded automatically.
//            conn = DriverManager.getConnection(connectionURL);
//            System.out.println("Connected to database " + dbName);
//
//            //   ## INITIAL SQL SECTION ##
//            //   Create a statement to issue simple commands.
//            s = conn.createStatement();
//            // Call utility method to check if table exists.
//            //      Create the table if needed
//            if (! WwdUtils.wwdChk4Table(conn))
//            {
//                System.out.println (" . . . . creating table WISH_LIST");
//                s.execute(createString);
//            }
//            //  Prepare the insert statement to use
//            psInsert = conn.prepareStatement("insert into WISH_LIST(WISH_ITEM) values (?)");
//
//            //   ## ADD / DISPLAY RECORD SECTION ##
//            //  The Add-Record Loop - continues until 'exit' is entered
//            do {
//                // Call utility method to ask user for input
//                answer = WwdUtils.getWishItem();
//                // Check if it is time to EXIT, if not insert the data
//                if (! answer.equals("exit"))
//                {
//                    //Insert the text entered into the WISH_ITEM table
//                    psInsert.setString(1,answer);
//                    psInsert.executeUpdate();
//
//                    //   Select all records in the WISH_LIST table
//                    myWishes = s.executeQuery("select ENTRY_DATE, WISH_ITEM from WISH_LIST order by ENTRY_DATE");
//
//                    //  Loop through the ResultSet and print the data
//                    System.out.println(printLine);
//                    while (myWishes.next())
//                    {
//                        System.out.println("On " + myWishes.getTimestamp(1) + " I wished for " + myWishes.getString(2));
//                    }
//                    System.out.println(printLine);
//                    //  Close the resultSet
//                    myWishes.close();
//                }       //  END of IF block
//                // Check if it is time to EXIT, if so end the loop
//            } while (! answer.equals("exit")) ;  // End of do-while loop
//
//            // Release the resources (clean up )
//            psInsert.close();
//            s.close();
//            conn.close();
//            System.out.println("Closed connection");
//
//            //   ## DATABASE SHUTDOWN SECTION ##
//            /*** In embedded mode, an com should shut down Derby.
//             Shutdown throws the XJ015 exception to confirm success. ***/
//            if (driver.equals("org.apache.derby.jdbc.EmbeddedDriver")) {
//                boolean gotSQLExc = false;
//                try {
//                    DriverManager.getConnection("jdbc:derby:;shutdown=true");
//                } catch (SQLException se)  {
//                    if ( se.getSQLState().equals("XJ015") ) {
//                        gotSQLExc = true;
//                    }
//                }
//                if (!gotSQLExc) {
//                    System.out.println("Database did not shut down normally");
//                }  else  {
//                    System.out.println("Database shut down normally");
//                }
//            }
//
//            //  Beginning of the primary catch block: prints stack trace
//        }  catch (Throwable e)  {
//            /*       Catch all exceptions and pass them to
//             *       the Throwable.printStackTrace method  */
//            System.out.println(" . . . exception thrown:");
//            e.printStackTrace(System.out);
//        }
//        System.out.println("Getting Started With Derby JDBC program ending.");


    }
}
