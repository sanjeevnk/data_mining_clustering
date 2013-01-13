package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DBUtil;
import clustering.DMKMDemo;


/**
 * @author Sanjeev Kulkarni
 */

public class TextClusteringServlet extends javax.servlet.http.HttpServlet
  	implements javax.servlet.Servlet {

	public TextClusteringServlet() {
		super();
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String application = request.getParameter("application");
		String algorithmToBeUsed = request.getParameter("algorithm");
		
		sop("Entered application" + application);

		initConnection(username, password, application, algorithmToBeUsed);
		sop("**** After initConnection() is invoked ***");
		// Close the connection to the MBean server
		}

	private void initConnection(String url, String username, String password,
			String application) throws IOException {
		sop("*** Inside initConnection");


		url = DBUtil.formedURI();
		username = DBUtil.getUsername();
		password = DBUtil.getPassword();
		
		new DMKMDemo().dummy( username, password, url, application);
		
	}
	

	private static final void sop(final String msg) {
		System.out.println(msg);
	}

	/**
	 * Brute Force Algorithm: Almost always sure is the fact that objectName
	 * string contains the domainName in it's indices starting from 0. Hence,
	 * brute force method is preferred here.
	 * 
	 * @param objectName
	 */
	/*private boolean searchDomainBruteForce(Object objectName,
			char[] domPatternChars) {
		sop("***Inside searchDomainBruteForce " + objectName.toString());
		String objNameStr = objectName.toString();
		char[] objNameStrChars = objNameStr.toCharArray(); // Text Array
		boolean domainFound = false;

		for (int i = 0; i < (objNameStrChars.length - domPatternChars.length); i++) {
			int j = 0;
			while (j < domPatternChars.length
					&& (objNameStrChars[i + j] == domPatternChars[j])) {
				j++;
				if (j == objNameStrChars.length) {
					domainFound = true;
				}
			}
			break;
		}
		sop("domainFound" + domainFound);
		return domainFound;
	}*/

}
