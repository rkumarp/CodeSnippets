<%-- 
    Document   : search
    Created on : Apr 21, 2013, 1:07:25 PM
    Author     : Sanket Chandorkar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,com.utd.search.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bookle</title>
        <link rel="shortcut icon" href="bookle.ico">
    </head>
    <body bgcolor="white">
        <table> 

            <%--  Search Header   --%>
            <tr bgcolor="#CCCCCC">
                <td align="center">
                    <a href="index.jsp" ><img src="bookle.png" width="120" height="40"> </a>
                </td>
                  
            <td align="center">
                <form method="get" action="search.jsp">
                    <font size="4">
                             &nbsp&nbsp&nbsp
                             <input type="text" name="searchString" value="<% out.print( request.getParameter( "searchString" ));     %>"  style="font-size:20px" size="70"/>
                            &nbsp&nbsp
                            <input type="submit" value="Bookle Search" style="font-size:20px"/></font>
                </form>
            </td>
        </tr>

        <%
             String searchStr = request.getParameter( "searchString" );
             String pageno = request.getParameter( "pageno" );
             if(searchStr != "") {
                 //Result res = SearchData.search(searchStr,pageno);
                 SearchData s = new SearchData();
        %>
        
        <%--  Query stats   --%>
        <tr bgcolor="#E6E6E6">
            <td style="color:#666666;font-size:15px"><B> <%  //out.print("Records found =  " + res.numberOfPages); %> </B></td>
                <td style="color:#666666;font-size:15px"><B><%  //out.print("Query Time =  " + res.execTime); %>  </B></td>
        </tr>

        <%--  Query results   --%>
        <tr>
            <%--  Query Stats Extra   --%>
            <td></td>
            
            <%--  Query results rows   --%>
            <td>
                
                <table>

                    <%

                            //out.print(res.output);
                        }
                    %>          
                    
                </table>
                
            </td>
            
            <%--  Query results : paging --%>
            <td>
                
            </td>

        </tr>
    </table>
</body>
</html>
