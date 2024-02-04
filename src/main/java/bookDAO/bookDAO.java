package bookDAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.niranjana.DTO.bookDTO;
import com.niranjana.util.ConnectionFactory;

public class bookDAO {
private static final String INSERT_SQL="INSERT INTO BOOKS VALUES(?,?,?)";
	
	public boolean savebook(bookDTO bdto) throws Exception {
		
		Connection con =ConnectionFactory.getConnection();
	PreparedStatement ps=	con.prepareStatement(INSERT_SQL);
	ps.setInt(1, bdto.getBookId());
	ps.setString(2, bdto.getBookName());
	ps.setDouble(3, bdto.getBookPrice());
	
	int count =ps.executeUpdate();
	con.close();
	return count>0;
		
		
	}
}
